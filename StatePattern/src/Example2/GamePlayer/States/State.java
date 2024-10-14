/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2.GamePlayer.States;

import Example2.GamePlayer.StateGamePlayer;

/**
 *
 * @author A_Murad
 */
public abstract class State {

    StateGamePlayer player;

    public State(StateGamePlayer player) {
        this.player = player;
    }

    public abstract void noHealth();

    public abstract void playerApproaches();

    public abstract void playerRuns();

    public abstract void lowAmmo();

    public abstract void fullAmmo();

    public abstract void fullHealth();

    public abstract void lowHealth();

}
