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
public class Dry extends Decorator {
    public Dry(Drink drink) {
        super(drink);
    }
    @Override
    public String condiments(){
        return "Dry";
    }
}
