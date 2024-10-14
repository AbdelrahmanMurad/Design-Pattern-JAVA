package DecoratorPattern.Pizza;

public class Main {

    public Main() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
//        IPizza pizza = new BigSize(new ChickenTopping(new OriginalPizza())); //good
        IPizza pizza = new ChickenTopping(new BigSize(new OriginalPizza())); //good
//        IPizza pizza = new OriginalPizza(new BigSize(new ChickenTopping())); //bad because OriginalPizza constructor dont take argumants.
        System.out.println(pizza.getDescription());
        System.out.println(pizza.calcPrice());

        IPizza pizza2 = new BigSize(new ChickenTopping(new MashroomTopping(new TunaTopping(new OriginalPizza()))));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.calcPrice());
    }

}