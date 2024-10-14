/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Client.A;
import Client.B;
import Client.C;
import Client.D;
import Client.StudentMSG;
import EventBus.EventBus;

/**
 *
 * @author A_Murad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        EventBus.getInstance().subscribe(a);
        EventBus.getInstance().subscribe(b);
        EventBus.getInstance().subscribe(c);
        EventBus.getInstance().subscribe(d);

        StudentMSG msg1 = new StudentMSG();
        msg1.setStudentName("Murad");
        msg1.setStudentId("11");
        msg1.setSender(a);
//        msg1.setSender(b);
//        msg1.setSender(c);
//        msg1.setSender(d);

//        a.sendToOthers(msg1);
        b.sendToOthers(msg1);
//        c.sendToOthers(msg1);
//        d.sendToOthers(msg1);
    }

}
