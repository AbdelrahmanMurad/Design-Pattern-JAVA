/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.RemoteContol_.FanReceiver;

import CommandPattern.RemoteContol_.Command;

/**
 *
 * @author A_Murad
 */
public class FanOnCommand implements Command {

    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

}
