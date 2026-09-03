package com.booking;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicketBookingTest {

    @Test
    public void testTicketBookingWithoutDiscount() {
        TicketBooking booking = new TicketBooking();
        // 4 * 50 = 200
        assertEquals(200.0, booking.calculateTotalCost("regular", 4), 0.001);
    }

    @Test
    public void testTicketBookingWithDiscount() {
        TicketBooking booking = new TicketBooking();
        // 10 * 100 = 1000 - 10% discount = 900
        assertEquals(900.0, booking.calculateTotalCost("premium", 10), 0.001);
    }
}
