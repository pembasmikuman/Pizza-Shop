public abstract class Pizza {

    //pizza attributes
    private String size;
    private double price;

    //constructor
    public Pizza(String size, double price) {
        this.size = size;
        this.price = price;
    }

    //all the function of pizza
    public abstract void prepare();

    public abstract void pizzaInfo(String size, double price, String toppings);

    public void bake() {
        System.out.println("Baking pizza...");
    }

    public void box() {
        System.out.println("Boxing pizza...");
    }

}
