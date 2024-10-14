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
public class FlightBooker extends Flight {

    // Method to get available flights for a given date range
    public ArrayList<Flight> getFlightsFor(String startDate, String endDate) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        // Normally, return a list of available flights
        return new ArrayList<>(); // Returning an empty list for simplicity
    }
}
