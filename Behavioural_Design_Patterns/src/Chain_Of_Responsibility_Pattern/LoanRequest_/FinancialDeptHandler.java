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
public class FinancialDeptHandler extends LoanHandler {

    float budget = 500000;

    @Override
    public boolean handleRequest(LoanRequest request) {
        if (request.getAmount() <= 10000 && budget >= 200000) {
            System.out.println("F. Deprt. gives OK");
            return this.getSuccessor().handleRequest(request);
        } else {
            System.out.println("F. Deprt. rejects request");
            return false;
        }
    }

}
