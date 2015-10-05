/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import java.math.BigDecimal;

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

    @Override
    public BigDecimal price() {
        return new BigDecimal(5.5);
    }

    @Override
    BigDecimal additionalPrice() {
        return new BigDecimal(5.5);
    }
}
