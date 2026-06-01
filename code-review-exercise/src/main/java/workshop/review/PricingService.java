package workshop.review;

import java.math.BigDecimal;

public interface PricingService {

    BigDecimal calculateTotal(Order order);
}
