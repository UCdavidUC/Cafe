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
public class CafeLatte implements Drink {

    @Override
    public String description() {
        return "Cafe Latte";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2.8);
    }
    
}
