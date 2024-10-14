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
public class StudentMSG extends EventBus.BusMSG {

    String studentName;
    String studentId;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public EventBus.Subscriber getSender() {
        return sender;
    }

    @Override
    public void setSender(EventBus.Subscriber sender) {
        this.sender = sender;
    }

}
