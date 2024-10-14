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
public class Attack extends State {

    public Attack(StateGamePlayer player) {
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
        System.out.println("Player Runs");
        player.setCurrentState(new Patrol(player));
        System.out.println("Patrol");
    }

    @Override
    public void lowAmmo() {
        System.out.println("Low Ammo");
        player.setCurrentState(new Reload(player));
        System.out.println("Reloading");
    }

    @Override
    public void fullAmmo() {

    }

    @Override
    public void fullHealth() {
    }

    @Override
    public void lowHealth() {
        System.out.println("Low Health");
        player.setCurrentState(new TakeCover(player));
        System.out.println("Take Cover");
    }

}
