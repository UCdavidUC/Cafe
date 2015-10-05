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
