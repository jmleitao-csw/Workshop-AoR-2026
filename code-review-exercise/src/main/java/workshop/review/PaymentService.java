package workshop.review;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class PaymentService {

    private static final Logger LOGGER = Logger.getLogger(PaymentService.class.getName());

    private final PricingService pricing;
    private final PaymentGateway gateway;

    public PaymentService(PricingService pricing, PaymentGateway gateway) {
        this.pricing = pricing;
        this.gateway = gateway;
    }

    public Receipt process(Order order, int discountPercent) {
        double total = pricing.calculateTotal(order).doubleValue();

        if (discountPercent > 0) {
            total = total - (total * discountPercent / 100);
        }

        LOGGER.info("Charging " + order.getCustomerEmail() + " amount " + total);
        gateway.charge(order.getCustomerId(), new BigDecimal(total));
        order.setStatus("PAID");
        return new Receipt("ok");
    }
}
