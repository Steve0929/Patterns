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
        RestaurantFactoryProducer Myres = new RestaurantFactoryProducer();
        RestaurantAbstractFactory factory = Myres.getRestaurantAbstractFactory(1);
        factory.getFastFood("hamburguer");
        factory.getDrink("soda");
    }
   
    
}
