/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.Booker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author A_Murad
 */
public class TravelFacade {

    private HotelBooker hotelBooker = new HotelBooker();  // Initialized
    private FlightBooker flightBooker = new FlightBooker(); // Initialized

    // Method to book flights and hotels for a given date range
    public void booking(String startDate, String endDate) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        // Fetch available hotels and flights for the given date range
        ArrayList<Hotel> hotels = hotelBooker.getHotelNamesfor(startDate, endDate);
        ArrayList<Flight> flights = flightBooker.getFlightsFor(startDate, endDate);

        System.out.println("Booking from " + startDate + " to " + endDate);
        System.out.println("Available hotels: " + hotels.size());
        System.out.println("Available flights: " + flights.size());
        // Normally, you would process and return relevant data
    }
}
