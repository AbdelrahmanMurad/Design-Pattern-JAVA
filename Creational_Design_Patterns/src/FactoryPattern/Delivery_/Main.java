/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.Delivery_;

import java.util.Scanner;

/**
 *
 * @author abdelrahman murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item = new Item();
        item.setPrice(100);
        item.setWeight(5);
        item.setWidth(100);
        item.setHeight(200);

        Scanner s = new Scanner(System.in);
        System.out.println("Choose delivery method:\n1.  Land  \n2.  Maritime  \n3.  Air  \n4.  Drone");
        int choice = s.nextInt();
        DeliveryMethod d = DeliveryMethodFactory.createdDeliveryMethod(choice);
        System.out.println("Delivery price =  " + d.calcDeliveryPrice(item));
    }
}
