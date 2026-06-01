package workshop.review;

import java.math.BigDecimal;

public class PaymentService {

    private final PricingService pricing;
    private final PaymentGateway gateway;

    public PaymentService(PricingService pricing, PaymentGateway gateway) {
        this.pricing = pricing;
        this.gateway = gateway;
    }

    public Receipt process(Order order, int discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("discountPercent must be between 0 and 100");
        }

        BigDecimal total = pricing.calculateTotal(order);

        if (discountPercent > 0) {
            total = total.subtract(total.multiply(BigDecimal.valueOf(discountPercent)).movePointLeft(2));
        }

        Receipt receipt = gateway.charge(order.getCustomerId(), total);
        order.setStatus("PAID");
        return receipt;
    }
}
