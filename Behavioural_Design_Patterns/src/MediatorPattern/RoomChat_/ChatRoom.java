/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern.RoomChat_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class ChatRoom implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void send(String message, User sender) {
        // Don't send the message to the sender
        for (User u : users) {
            if (u != sender) {
                u.receive(message);
            }
        }

    }

}
