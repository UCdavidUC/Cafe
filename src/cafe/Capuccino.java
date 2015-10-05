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
public class Capuccino implements Drink {

    @Override
    public String description() {
        return "Capuccino";
    }

    @Override
    public BigDecimal price() {
        BigDecimal price = new BigDecimal(4.90);
        return price;
    }
    
}
