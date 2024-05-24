public class VeggiesPizza extends Pizza implements Toppable {

    //constructor for child of pizza named Veggies
    public VeggiesPizza(String size, double price) {
        super(size, price);
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing veggies pizza..");
    }

    @Override
    public void addToppings(String toppings) {
        System.out.println("The toppings: " + toppings);
    }

    @Override
    public void pizzaInfo(String size, double price, String toppings) {
        System.out.println("\nPizza Info: ");
        System.out.println("The price for " +size+ " size " +
                "is RM " +price);
        addToppings(toppings);
    }
}
