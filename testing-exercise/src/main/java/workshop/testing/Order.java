package workshop.testing;

import java.math.BigDecimal;

public record Order(BigDecimal total, boolean premiumCustomer, boolean containsHazardousItems) {
}
