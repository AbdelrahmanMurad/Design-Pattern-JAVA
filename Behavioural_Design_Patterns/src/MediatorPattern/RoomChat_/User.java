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
abstract class User {

    private ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);

    abstract void receive(String message);

    public ChatMediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

}
