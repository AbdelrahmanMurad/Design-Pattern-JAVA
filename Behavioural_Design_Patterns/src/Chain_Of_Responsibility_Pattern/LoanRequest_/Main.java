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
public class Main {

    public static void main(String[] args) {
        HRHandler hr = new HRHandler();
        FinancialDeptHandler fdh = new FinancialDeptHandler();
        GeneralManagerHandler gmh = new GeneralManagerHandler();
        TreasuryHandler th = new TreasuryHandler();

        hr.setSuccessor(fdh);
        fdh.setSuccessor(gmh);
        gmh.setSuccessor(th);
        th.getSuccessor();

        LoanRequest request = new LoanRequest(5000, 4, false, 7);
//        hr.handleRequest(request);
        System.out.println(hr.handleRequest(request) + "\n------------------------------------");

        LoanRequest request2 = new LoanRequest(12000, 2, true, 9);
        System.out.println(hr.handleRequest(request2) + "\n------------------------------------");

        LoanRequest request3 = new LoanRequest(5000, 1, false, 6);
        System.out.println(hr.handleRequest(request3) + "\n------------------------------------");

        LoanRequest request4 = new LoanRequest(5000, 2, false, 4);
        System.out.println(hr.handleRequest(request4) + "\n------------------------------------");

        LoanRequest request5 = new LoanRequest(1000, 4, true, 5);
        System.out.println(hr.handleRequest(request5) + "\n------------------------------------");
    }
}
