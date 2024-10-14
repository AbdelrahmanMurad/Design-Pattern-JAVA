/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.MessageProcessor;

/**
 *
 * @author A_Murad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Hello World";
        SMSProcessor sms = new SMSProcessor();
        EmailProcessor email = new EmailProcessor();
        sms.sendMSG(text);
        System.out.println("");
        email.sendMSG(text);
    }

}
