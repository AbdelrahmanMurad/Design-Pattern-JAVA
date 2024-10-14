package DecoratorPattern.Pizza;

public abstract class Decorator implements IPizza {

    //instead of making decorator part in each type of pizza. Here is it in one abstract class.
    
//abstract class 
    IPizza pizza;

    public Decorator(IPizza pizza) {
        this.pizza = pizza;
    }

//    @Override
//    public float calcPrice() {
//        return this.pizza.calcPrice();
//    }
//
//    @Override
//    public String getDescription() {
//        return this.pizza.getDescription();
//    }
    // Ipizzaمن الmethodsوبتم استدعاء الabstractالى classلانو ممكن نعمل الmethods مش حتفرق لو استدعينا ال
}
