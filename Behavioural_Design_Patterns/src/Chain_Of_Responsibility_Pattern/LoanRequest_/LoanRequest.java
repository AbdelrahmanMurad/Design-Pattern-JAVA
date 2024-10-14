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
public class LoanRequest {

    private float amount; //How much is the request amount ??
    private int urgent; // For example, on a scale of 1 to 5, how important is it ?
    private boolean indebt; // Is the employee indept ?
    private int empEvaluation; // For example, on a scale of 1 to 10, What is the employee evaluation ?

    public LoanRequest(float amount, int urgent, boolean indebt, int empEvaluation) {
        this.amount = amount;
        this.urgent = urgent;
        this.indebt = indebt;
        this.empEvaluation = empEvaluation;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getUrgent() {
        return urgent;
    }

    public void setUrgent(int urgent) {
        this.urgent = urgent;
    }

    public boolean isIndebt() {
        return indebt;
    }

    public void setIndebt(boolean indebt) {
        this.indebt = indebt;
    }

    public int getEmpEvaluation() {
        return empEvaluation;
    }

    public void setEmpEvaluation(int empEvaluation) {
        this.empEvaluation = empEvaluation;
    }
}
