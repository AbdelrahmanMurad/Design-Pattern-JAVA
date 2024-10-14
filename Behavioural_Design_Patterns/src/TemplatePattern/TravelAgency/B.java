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
public class B extends Trip {

    @Override
    public void doComingTransport() {
        System.out.println("doComingTransport");
    }

    @Override
    public void doDayA() {
        System.out.println("Day A");
    }

    @Override
    public void doDayB() {
        System.out.println("Day B");
    }

    @Override
    public void doDayC() {
        System.out.println("Day C");
    }

    @Override
    public void doReturningTransport() {
        System.out.println("doReturningTransport");
    }
}
