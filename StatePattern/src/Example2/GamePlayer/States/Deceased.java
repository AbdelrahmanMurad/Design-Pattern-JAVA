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
public class Deceased extends State{

    public Deceased(StateGamePlayer player) {
        super(player);
    }

    @Override
    public void noHealth() {

    }

    @Override
    public void playerApproaches() {

    }

    @Override
    public void playerRuns() {

    }

    @Override
    public void lowAmmo() {

    }

    @Override
    public void fullAmmo() {

    }

    @Override
    public void fullHealth() {

    }

    @Override
    public void lowHealth() {

    }
    
}
