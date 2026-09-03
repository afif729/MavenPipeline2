package com.booking;

public class TicketBooking {

    public double calculateTotalCost(String category, int numberOfTickets) {
        double pricePerTicket = 0.0;

        switch (category.toLowerCase()) {
            case "regular":
                pricePerTicket = 50.0;
                break;
            case "premium":
                pricePerTicket = 100.0;
                break;
            case "vip":
                pricePerTicket = 150.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }

        double totalAmount = pricePerTicket * numberOfTickets;

        // Apply a 10% discount if total tickets exceed 5
        if (numberOfTickets > 5) {
            totalAmount = totalAmount - (totalAmount * 0.10);
        }

        return totalAmount;
    }
}
