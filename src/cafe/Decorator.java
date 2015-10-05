package cafe;

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
    String condiments() {
        return "Condiments :";
    }
}
