/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author David
 */
public class Whipped extends Decorator {
    public Whipped(Drink drink) {
        super(drink);
    }
    @Override
    String condiments() {
        return "Whipped";
    }
}
