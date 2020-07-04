package hw12hh;

public class Customer {
    private String firstName;
    private String lastName;
    private CustomerAddress customerAddress;

    public Customer(String firstName, String lastName, CustomerAddress customerAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerAddress=" + customerAddress +
                '}';
    }

    public void printCustomer() {
        System.out.println(toString());
    }
}
