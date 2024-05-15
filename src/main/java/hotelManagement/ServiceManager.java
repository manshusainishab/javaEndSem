// ServiceManager.java
package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class ServiceManager {
    private List<Service> services;

    public ServiceManager() {
        this.services = new ArrayList<>();
        // Initialize services
        services.add(new Service("S001", "102", "food", "Cheeseburger and fries"));
        services.add(new Service("S002", "101", "cleaning", "Extra cleaning service"));
    }

    public void addService(Service service) {
        services.add(service);
    }

    public List<Service> getServices() {
        return services;
    }

    public Service getServiceByOrderId(String orderId) {
        for (Service service : services) {
            if (service.getOrderId().equals(orderId)) {
                return service;
            }
        }
        return null;
    }
}
