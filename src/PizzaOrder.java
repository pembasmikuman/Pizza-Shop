import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pizza[] pizza = new Pizza[2];
        String size = "", toppings = "";
        double price;

        System.out.println("Welcome to Berg's Pizza Hut");
        System.out.println("Pizza selection: \n1. Veggies\n2. Peperoni");
        System.out.print("\nInput your choice: ");

        int choice = input.nextInt();
        input.nextLine();
        System.out.print("Choose size, M or L : ");
        size = input.nextLine();
        System.out.print("Input 2 toppings, seperated by and: ");
        toppings = input.nextLine();

        if(size.equals("M")) {
            size = "Medium";
            price = 12.99; }
        else {
            size = "Large";
            price = 16.99; }
        PizzaSelection(choice, pizza, size, toppings, price);
    }

    public static void PizzaSelection(int choice, Pizza[] pizza, String size, String toppings, double price) {
        pizza[0] = new VeggiesPizza(size, price);
        pizza[1] = new PeperoniPizza(size, price);
        pizza[choice-1].prepare();
        pizza[choice-1].bake();
        pizza[choice-1].box();
        pizza[choice-1].pizzaInfo(size, price, toppings);
    }
}
