/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.VehicleTemplate;

/**
 *
 * @author ProBook
 */
public class Truck extends VehicleTemplate {

    @Override
    protected void installGearBox() {
        System.out.println("Installing 6 shifts gear box for trucks");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("adding extra truck container");
    }
    
}
