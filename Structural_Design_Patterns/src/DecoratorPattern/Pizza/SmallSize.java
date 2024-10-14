package DecoratorPattern.Pizza;

public class SmallSize extends Decorator {

    public SmallSize(IPizza pizza) {
        super(pizza);
    }

    @Override
    public float calcPrice() {
        return pizza.calcPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (small)";
    }

}
