/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.Pizza;

/**
 *
 * @author khaled
 */
public class testing {

    public static void main(String[] args) {
        pizza p = pizzaFactory.createPizza(2);
        p.prepare();
    }

}
