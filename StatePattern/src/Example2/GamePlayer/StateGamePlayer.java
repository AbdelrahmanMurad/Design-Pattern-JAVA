/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2.GamePlayer;

import Example2.GamePlayer.States.Patrol;
import Example2.GamePlayer.States.State;

/**
 *
 * @author A_Murad
 */
public class StateGamePlayer {
    
    State currentState;

    //set the current state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //first state
    public StateGamePlayer() {
        this.currentState = new Patrol(this);
    }
    
    public void noHealth() {
        this.currentState.noHealth();
    }
    
    public void playerApproaches() {
        this.currentState.playerApproaches();
    }
    
    public void playerRuns() {
        this.currentState.playerRuns();
    }
    
    public void lowAmmo() {
        this.currentState.lowAmmo();
    }
    
    public void fullAmmo() {
        this.currentState.fullAmmo();
    }
    
    public void fullHealth() {
        this.currentState.fullHealth();
    }
    
    public void lowHealth() {
        this.currentState.lowHealth();
    }
}
