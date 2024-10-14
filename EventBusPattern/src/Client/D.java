/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import EventBus.EventBus;

/**
 *
 * @author A_Murad
 */
public class D implements EventBus.Subscriber {

    @Override
    public void msgReceived(EventBus.BusMSG msg) {
        if (msg instanceof StudentMSG) {
            StudentMSG sm = (StudentMSG) msg;
            System.out.println(getClass().getSimpleName() + " received a message from " + sm.getSender().getClass().getSimpleName() + " about " + sm.getStudentId() + ", " + sm.getStudentName());
        }
    }

    @Override
    public void sendToOthers(StudentMSG msg) {
        EventBus.getInstance().notifySubscribers(msg);
    }

}
