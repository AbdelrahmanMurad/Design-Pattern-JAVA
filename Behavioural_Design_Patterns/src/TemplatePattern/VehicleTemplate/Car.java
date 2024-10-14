
package TemplatePattern.VehicleTemplate;


public class Car extends VehicleTemplate {

    @Override
    protected void installGearBox() {
        System.out.println("Installing 5 shifts gear box");    }

    @Override
    protected void assembleComponents() {
        System.out.println("Adding Mirrors , windows , join the parts in a Car body ");    }
    
}
