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
public abstract class State {

    StateMediaPlayer player;

    public State(StateMediaPlayer player) {
        this.player = player;
    }

    public abstract void playerCreate();

    public abstract void playerDestroy();

    public abstract void playerPrepare();

    public abstract void playerUnprepare();

    public abstract void playerStart();

    public abstract void playerStop();

    public abstract void playerPause();

}
