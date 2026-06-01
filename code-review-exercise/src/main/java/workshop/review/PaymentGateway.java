package workshop.review;

import java.math.BigDecimal;

public interface PaymentGateway {

    Receipt charge(String customerId, BigDecimal amount);
}
