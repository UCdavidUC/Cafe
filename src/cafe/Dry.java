package cafe;

import java.math.BigDecimal;

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

    @Override
    public BigDecimal price() {
        return new BigDecimal(4.90);
    }

    @Override
    BigDecimal additionalPrice() {
        return new BigDecimal(5.5);
    }
}
