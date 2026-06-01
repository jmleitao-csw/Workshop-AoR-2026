package workshop.testing;

import java.math.BigDecimal;

public class ShippingFeeCalculator {

    public BigDecimal calculate(Order order) {
        if (order.containsHazardousItems()) {
            return new BigDecimal("25.00");
        }

        if (order.total().compareTo(new BigDecimal("50.00")) >= 0) {
            return BigDecimal.ZERO;
        }

        if (order.premiumCustomer()) {
            return new BigDecimal("5.00");
        }

        return new BigDecimal("10.00");
    }
}
