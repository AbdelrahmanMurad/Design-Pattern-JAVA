/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern.RoomChat_;

/**
 *
 * @author A_Murad
 */
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.getName() + " Sends: " + message);
        this.getMediator().send(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(this.getName() + " Receives: " + message);
    }

}
