/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import java.text.NumberFormat;

/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink coffee = new Dry(new Whipped(new Capuccino()));
        System.out.println(coffee.description());
        System.out.println(coffee.price().doubleValue());
    }
    
}
