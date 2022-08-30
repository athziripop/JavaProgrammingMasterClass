public class VipCustomer {
    private String customerName;
    private String creditLimit;
    private String customerEmail;

    public VipCustomer(){
        this("Default name","Default email","000000000");
    }
    public VipCustomer(String customerName, String customerEmail){
        this(customerName, customerEmail, "000000000");
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public VipCustomer(String customerName, String customerEmail, String creditLimit){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }
}
