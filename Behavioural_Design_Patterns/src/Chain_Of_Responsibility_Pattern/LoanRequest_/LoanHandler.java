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
public abstract class LoanHandler {

    LoanHandler successor;

    public LoanHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(LoanHandler successor) {
        this.successor = successor;
    }

    public abstract boolean handleRequest(LoanRequest request);
}
