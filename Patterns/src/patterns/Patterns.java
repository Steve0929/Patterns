/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RestaurantFactoryProducer Producer = new RestaurantFactoryProducer();
        //Comidas
        RestaurantAbstractFactory factory = Producer.getRestaurantAbstractFactory(1);
        System.out.println(factory.getFastFood("hamburguer"));
        System.out.println(factory.getDrink("soda"));
        
        //Pizzeria
        RestaurantAbstractFactory MyPizzaRes = Producer.getRestaurantAbstractFactory(2);
        System.out.println(MyPizzaRes.getFastFood("pizza"));
        System.out.println(MyPizzaRes.getDrink("beer"));
    }
   
    
}
