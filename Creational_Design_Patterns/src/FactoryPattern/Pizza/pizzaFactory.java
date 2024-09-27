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
public class pizzaFactory {
    public static pizza createPizza(int id){
        if(id==1){
            return new pizza1();
        }else if(id==2){
            return new pizza2();
        }else if(id==3){
            return new pizza3();
        }else{
            return null;
        }
        
    }
    
}
