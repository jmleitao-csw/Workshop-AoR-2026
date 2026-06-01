package workshop.review;

public class Order {

    private final String customerId;
    private final String customerEmail;
    private String status;

    public Order(String customerId, String customerEmail, String status) {
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
