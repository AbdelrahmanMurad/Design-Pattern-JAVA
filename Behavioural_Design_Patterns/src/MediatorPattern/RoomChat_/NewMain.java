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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User ahmad = new ChatUser(chatRoom, "Ahmad");
        User mohammed = new ChatUser(chatRoom, "Mohammed");
        User mahmoud = new ChatUser(chatRoom, "Mahmoud");

        chatRoom.addUser(ahmad);
        chatRoom.addUser(mohammed);
        chatRoom.addUser(mahmoud);
        ahmad.send("Hello Everyone");
        mohammed.send("Hey Ahmad");
    }

}
