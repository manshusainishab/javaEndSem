// Main.java
package hotelManagement;

public class Main {
    public static void main(String[] args) {
        // Initialize RoomManager
        RoomManager roomManager = new RoomManager();
        
        // Initialize CustomerManager
        CustomerManager customerManager = new CustomerManager();

        // Initialize BookingManager
        BookingManager bookingManager = new BookingManager();

        // Initialize ServiceManager
        ServiceManager serviceManager = new ServiceManager();

        // Retrieve and print rooms
        System.out.println("Rooms:");
        for (Room room : roomManager.getRooms()) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getType() + ", Status: " + room.getStatus());
        }

        // Retrieve and print customers
        System.out.println("\nCustomers:");
        for (Customer customer : customerManager.getCustomers()) {
            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getName() + ", Contact Info: " + customer.getContactInfo().getPhone() + ", " + customer.getContactInfo().getEmail());
        }

        // Retrieve and print bookings
        System.out.println("\nBookings:");
        for (Booking booking : bookingManager.getBookings()) {
            System.out.println("Booking ID: " + booking.getBookingId() + ", Customer ID: " + booking.getCustomerId() + ", Room Number: " + booking.getRoomNumber() + ", Check-in Date: " + booking.getCheckInDate() + ", Check-out Date: " + booking.getCheckOutDate());
        }

        // Retrieve and print services
        System.out.println("\nServices:");
        for (Service service : serviceManager.getServices()) {
            System.out.println("Order ID: " + service.getOrderId() + ", Room Number: " + service.getRoomNumber() + ", Service Type: " + service.getServiceType() + ", Details: " + service.getDetails());
        }
    }
}
