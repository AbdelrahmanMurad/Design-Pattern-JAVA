/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.Delivery_;

/**
 *
 * @author abdelrahman murad
 */
public class MaritimeDelivery implements DeliveryMethod {

    @Override
    public float calcDeliveryPrice(Item item) {
        return (item.getWeight() * 20) + (item.getHeight() * item.getWidth()/ 100) * 30;
    }

}
