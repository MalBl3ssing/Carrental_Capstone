package za.ac.cput.carrental.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.carrental.domain.Booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookingFactoryTests {

    @Test
    void testCreateBooking_Success(){
        Booking booking = BookingFactory.createBooking(
                "M001",
                "C001",
                "2026-09-01",
                "2026-09-05",
                1700.00
        );
        assertNotNull(booking);
        assertNotNull(booking.getBookingId());
        assertEquals("M001", booking.getMemberId());
        assertEquals("C001", booking.getCarId());
        assertEquals("2026-09-01", booking.getStartDate());
        assertEquals("2026-09-05", booking.getEndDate());
        assertEquals(1700.00, booking.getTotalCost());
    }

    @Test
    void testCreateBooking_NotNull() {
        Booking booking = BookingFactory.createBooking(
                "M002",
                "C002",
                "2026-10-01",
                "2026-10-05",
                1300.00
        );
        assertNotNull(booking);
    }

    @Test
    void testCalculateRentalDuration(){
        Booking booking = BookingFactory.createBooking(
                "M003",
                "C001",
                "2026-09-01",
                "2026-09-05",
                1800.00
        );
        assertEquals(4, booking.calculateRentalDuration());
    }
}
