/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

public class RestaurantFactoryProducer {
    public RestaurantAbstractFactory getRestaurantAbstractFactory(int restaurant_id){
        switch(restaurant_id){
            case 1: return new RestaurantFactoryFood();
            case 2: return new RestaurantFactoryPizza();
            default: return null;
        }
    }
}
