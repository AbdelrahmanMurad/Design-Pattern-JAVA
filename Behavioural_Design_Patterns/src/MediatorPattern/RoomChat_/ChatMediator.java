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
public interface ChatMediator {

    void addUser(User user);

    void send(String message, User sender);
}
