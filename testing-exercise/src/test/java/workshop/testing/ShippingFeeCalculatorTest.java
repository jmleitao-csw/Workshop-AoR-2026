package workshop.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ShippingFeeCalculatorTest {

    private final ShippingFeeCalculator calculator = new ShippingFeeCalculator();

    @Test
    void shouldReturnFreeShippingForOrdersAtOrAboveFiftyEuros() {
        Order order = new Order(new BigDecimal("50.00"), false, false);

        BigDecimal shippingFee = calculator.calculate(order);

        assertEquals(new BigDecimal("0.00"), shippingFee);
    }

    @Test
    void shouldReturnPremiumShippingForNonHazardousOrdersBelowFiftyEuros() {
        Order order = new Order(new BigDecimal("40.00"), true, false);

        BigDecimal shippingFee = calculator.calculate(order);

        assertEquals(new BigDecimal("5.00"), shippingFee);
    }

    @Test
    void shouldProtectHazardousItemRule() {
        Order order = new Order(new BigDecimal("80.00"), true, true);

        BigDecimal shippingFee = calculator.calculate(order);

        assertEquals(new BigDecimal("25.00"), shippingFee);
    }
}
