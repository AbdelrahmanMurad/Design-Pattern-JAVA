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
public class DeliveryMethodFactory {
    // public static InterfaceName createdInterfaceName(dataType arg) {}
    // method return the same interface.

    public static DeliveryMethod createdDeliveryMethod(int id) {
        if (id == 1) {
            return new LandDelivery();
        } else if (id == 2) {
            return new MaritimeDelivery();
        } else if (id == 3) {
            return new AirDelivery();
        } else if (id == 4) {
            return new DroneDelivery();
        } else {
            throw new IllegalArgumentException("Invalid Id Number");
        }
    }
}
