package DecoratorPattern.Pizza;

public class BigSize extends Decorator {

    public BigSize(IPizza pizza) {
        super(pizza);
        // TODO Auto-generated constructor stub
    }

    @Override
    public float calcPrice() {
        return pizza.calcPrice() + (0.5f * pizza.calcPrice());
        
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (big)";
    }

}
