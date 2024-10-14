package DecoratorPattern.Pizza;

public class OriginalPizza implements IPizza {

    @Override
    public float calcPrice() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }

}
