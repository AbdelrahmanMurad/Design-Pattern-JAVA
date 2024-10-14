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
public class SMSProcessor extends MessageProcessorTemplate {

    @Override
    public String logMSG(String msg) {
        System.out.println("Logging message...");
        return "";
    }

    @Override
    public String formatMSG(String msg) {
        System.out.println("Formatting message for sms");
        return "";
    }

    @Override
    public String deliverMSG(String msg) {
        System.out.println("Sending for sms");
        return "";
    }

}
