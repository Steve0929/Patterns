/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

public class RestaurantFactoryFood  extends RestaurantAbstractFactory{
     public FastFood getFastFood(String type){
	    switch(type){
	        case "hamburguer": return new Hamburger();
	        case "sandwich": return new Sandwich();
	        case "hotdog": return new Hotdog();
	        default: return  null;
	    }
	    
	}
     public Drink getDrink(String type){
         switch(type){
	        case "soda": return new Soda();
	        default: return  null;
	    }
     }
}
