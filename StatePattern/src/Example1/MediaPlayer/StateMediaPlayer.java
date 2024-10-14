/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1.MediaPlayer;

import Example1.MediaPlayer.States.Idle;
import Example1.MediaPlayer.States.State;

/**
 *
 * @author A_Murad
 */
public class StateMediaPlayer {

    State currentState;

    //set the first state
    public StateMediaPlayer() {
        this.currentState = new Idle(this);
    }

    //set the current state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }


    public void playerCreate() {
        this.currentState.playerCreate();
    }

    public void playerDestroy() {
        this.currentState.playerDestroy();
    }

    public void playerPrepare() {
        this.currentState.playerPrepare();
    }

    public void playerUnprepare() {
        this.currentState.playerUnprepare();
    }

    public void playerStart() {
        this.currentState.playerStart();
    }

    public void playerStop() {
        this.currentState.playerStop();
    }

    public void playerPause() {
        this.currentState.playerPause();
    }
}
