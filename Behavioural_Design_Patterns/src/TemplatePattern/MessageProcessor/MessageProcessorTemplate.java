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
public abstract class MessageProcessorTemplate {

    public abstract String logMSG(String msg);

    public abstract String formatMSG(String msg);

    public abstract String deliverMSG(String msg);

    final public String sendMSG(String msg) {
      return  deliverMSG(formatMSG(logMSG(msg)));
    }
}
