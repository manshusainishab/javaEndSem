// CustomerManager.java
package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
        // Initialize customers
        customers.add(new Customer("001", "John Doe", new ContactInfo("1234567890", "john.doe@example.com")));
        customers.add(new Customer("002", "Jane Smith", new ContactInfo("0987654321", "jane.smith@example.com")));
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
