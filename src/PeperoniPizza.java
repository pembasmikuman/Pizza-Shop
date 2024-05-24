public class PeperoniPizza extends Pizza implements Toppable{

    //constructor for child of pizza named Peperoni
    public PeperoniPizza(String size, double price) {
        super(size, price);
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing peperoni pizza..");
    }

    @Override
    public void addToppings(String toppings) {
        System.out.println("The toppings: " + toppings);
    }

    public void pizzaInfo(String size, double price, String toppings) {
        System.out.println("\nPizza Info: ");
        System.out.println("The price for " +size+ " size " +
                "is RM " +price);
        addToppings(toppings);
    }
}
