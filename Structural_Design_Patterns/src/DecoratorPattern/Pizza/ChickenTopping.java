package DecoratorPattern.Pizza;

public class ChickenTopping extends Decorator {
//Topping means اضافة

    public ChickenTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public float calcPrice() {
        //return super.calcPrice => wrong, thats not a subclass.
        return pizza.calcPrice() + 4;
        //pizza.calcPrice() => the original
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + chicken topping";
    }

}
