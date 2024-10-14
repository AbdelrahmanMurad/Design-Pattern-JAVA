/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.TravelAgency;

/**
 *
 * @author A_Murad
 */
public abstract class Trip {

    final public void performTrip() {
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }

    public abstract void doComingTransport();

    public abstract void doDayA();

    public abstract void doDayB();

    public abstract void doDayC();

    public abstract void doReturningTransport();

}
