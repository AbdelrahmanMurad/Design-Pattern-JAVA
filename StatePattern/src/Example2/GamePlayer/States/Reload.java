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
public class Reload extends State {

    public Reload(StateGamePlayer player) {
        super(player);
    }

    @Override
    public void noHealth() {
        System.out.println("No Health - Game Over");
        player.setCurrentState(new Deceased(player));
        System.out.println("Player Died");
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
        System.out.println("Attack");
        player.setCurrentState(new Attack(player));
        System.out.println("Attack");
    }

    @Override
    public void fullHealth() {

    }

    @Override
    public void lowHealth() {

    }

}
