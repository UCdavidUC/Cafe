package cafe;

import java.math.BigDecimal;

/**
 *
 * @author David
 */
public abstract class Decorator implements Drink {
    public final Drink drink;
    public Decorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public String description(){
        return drink.description() + " " + condiments();
    }
    abstract String condiments();
    
    @Override
    public BigDecimal price() {
        BigDecimal p = drink.price();
        return p.add(additionalPrice());
    }
    abstract BigDecimal additionalPrice();
}
