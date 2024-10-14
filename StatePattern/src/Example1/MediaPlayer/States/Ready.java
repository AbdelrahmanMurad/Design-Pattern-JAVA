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
public class Ready extends State {

    public Ready(StateMediaPlayer player) {
        super(player);
    }

    @Override
    public void playerCreate() {

    }

    @Override
    public void playerDestroy() {

    }

    @Override
    public void playerPrepare() {

    }

    @Override
    public void playerUnprepare() {
        System.out.println("Make the Player Idle");
        player.setCurrentState(new Idle(player));
        System.out.println("Idle");
    }

    @Override
    public void playerStart() {
        System.out.println("Play the album");
        player.setCurrentState(new Play(player));
        System.out.println("Play");
    }

    @Override
    public void playerStop() {

    }

    @Override
    public void playerPause() {

    }

}
