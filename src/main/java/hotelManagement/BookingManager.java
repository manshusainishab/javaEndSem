// BookingManager.java
package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        this.bookings = new ArrayList<>();
        // Initialize bookings
        bookings.add(new Booking("B001", "001", "102", "2024-04-01", "2024-04-05"));
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Booking> getBookingsForCustomer(String customerId) {
        List<Booking> customerBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getCustomerId().equals(customerId)) {
                customerBookings.add(booking);
            }
        }
        return customerBookings;
    }
}

