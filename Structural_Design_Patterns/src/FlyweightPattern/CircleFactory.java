/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author A_Murad
 */
public class CircleFactory {
   private final Map<String, CircleFlyweight> circleMap = new HashMap<>();

    public CircleFlyweight getCircle(String color, int radius) {
        String key = color + "_" + radius;
        if (!circleMap.containsKey(key)) {
            circleMap.put(key, new CircleFlyweight(color, radius));
        }
        return circleMap.get(key);
    }    
}
