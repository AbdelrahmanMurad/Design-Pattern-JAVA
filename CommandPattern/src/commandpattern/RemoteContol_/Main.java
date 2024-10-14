/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern.RemoteContol_;

import commandpattern.RemoteContol_.FanReceiver.Fan;
import commandpattern.RemoteContol_.FanReceiver.FanOffCommand;
import commandpattern.RemoteContol_.FanReceiver.FanOnCommand;
import commandpattern.RemoteContol_.LightReceiver.LightOffCommand;
import commandpattern.RemoteContol_.LightReceiver.LightOnCommand;
import commandpattern.RemoteContol_.LightReceiver.Light;

/**
 *
 * @author A_Murad
 */
public class Main {

    public static void main(String[] args) {
        //light reciver
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControle remote = new RemoteControle();

        remote.setCommand(lightOnCommand);
        remote.pressButton();

        remote.setCommand(lightOffCommand);
        remote.pressButton();

        System.out.println("");

        //fan reciver
        Fan fan = new Fan();
        FanOnCommand fanOn = new FanOnCommand(fan);
        FanOffCommand fanOff = new FanOffCommand(fan);

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();

        System.out.println("");
    }
}
