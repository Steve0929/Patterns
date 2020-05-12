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
    }
        public FastFood getFastFood(String type){
	    switch(type){
	        case "hamburguer": return new Hamburger();
	        case "sandwich": return new Sandwich();
	        case "hotdog": return new Hotdog();
	        default: return  null;
	    }
	    
	}
   
    
}
