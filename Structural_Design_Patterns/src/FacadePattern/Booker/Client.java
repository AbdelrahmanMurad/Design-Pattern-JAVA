/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.Booker;

/**
 *
 * @author A_Murad
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TravelFacade travel = new TravelFacade();
        // Booking for the date range
        travel.booking("2024-10-01", "2024-11-01");
    }

}
