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
public class GeneralManagerHandler extends LoanHandler {

    @Override
    public boolean handleRequest(LoanRequest request) {
        if (request.getUrgent() >= 3 || request.getUrgent() < 3 && request.getEmpEvaluation() >= 6) {
            System.out.println("General managers gives OK");
            return this.getSuccessor().handleRequest(request);
        } else {
            System.out.println("General managers rejects request");
            return false;
        }
    }

}
