/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1.MediaPlayer.States;

import Example1.MediaPlayer.StateMediaPlayer;

/**
 *
 * @author A_Murad
 */
public class Idle extends State {

    public Idle(StateMediaPlayer player) {
        super(player);
    }

    @Override
    public void playerCreate() {

    }

    @Override
    public void playerDestroy() {
        System.out.println("Close the Player");
        player.setCurrentState(null);
        System.out.println("Destroy");
    }

    @Override
    public void playerPrepare() {
        System.out.println("Load the album");
        player.setCurrentState(new Ready(player));
        System.out.println("Ready");
    }

    @Override
    public void playerUnprepare() {

    }

    @Override
    public void playerStart() {

    }

    @Override
    public void playerStop() {

    }

    @Override
    public void playerPause() {

    }

}
