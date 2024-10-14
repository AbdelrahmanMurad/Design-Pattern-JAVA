/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility_Pattern.LoanRequest_;

/**
 *
 * @author A_Murad
 */
public class TreasuryHandler extends LoanHandler {

    @Override
    public boolean handleRequest(LoanRequest request) {
        System.out.println("Treasury pays for employee");
        return true;
    }

}
