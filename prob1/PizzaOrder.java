/**
 * Create a PizzaOrder class that allows up to three pizzas to be saved in an order.
 * Each pizza saved should be a Pizza object
 */
public class PizzaOrder {
    private int numPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder(){
        this.numPizzas = 0;
        this.pizza1 = null;
        this.pizza2 = null;
        this.pizza3 = null;
    }
    /**
     * Create appropriate instance variables and constructors
     * @param numPizzas the number of pizzas in the order. Must be between 1 and 3.
     * @param pizza1 the first pizza in the order.
     * @param pizza2 the second pizza in the order.
     * @param pizza3 the third pizza in the order.
     */
    public PizzaOrder(int numPizzas, Pizza pizza1, Pizza pizza2, Pizza pizza3){
        setNumPizzas(numPizzas);
        setPizza1(pizza1);
        setPizza2(pizza2);
        setPizza3(pizza3);

    }

    /**
     * A copy constructor that takes another PizzaOrder object and makes an independent copy of its pizzas.
     * This might be useful if using an old order as a starting point for a new order.
     * @param order the PizzaOrder object
     */
    public PizzaOrder(PizzaOrder order){
        if(order == null)
            return;
        numPizzas = order.numPizzas;

        if(order.pizza1 == null)
            pizza1 = null;
        else
            pizza1 = new Pizza(order.pizza1);

        if(order.pizza2 == null)
            pizza2 = null;
        else
            pizza2 = new Pizza(order.pizza2);

        if(order.pizza3 == null)
            pizza3 = null;
        else
            pizza3 = new Pizza(order.pizza3);
    }
    /**
     * Set the number of pizzas in the order. numPizzas must be between 1 and 3.
     * @param numPizzas
     */
    public void setNumPizzas(int numPizzas){
        if (numPizzas < 1 || numPizzas > 3)
            System.out.println("Invalid number of pizzas.");
        else
            this.numPizzas = numPizzas;
    }

    /**
     * Set the first pizza in the order.
     * @param pizza1
     */
    public void setPizza1(Pizza pizza1){
        if (numPizzas < 1 ) {
            this.pizza1 = null;
        }
        else
            this.pizza1 = pizza1;
    }

    /**
     * Set the second pizza in the order.
     * @param pizza2
     */
    public void setPizza2(Pizza pizza2){
        if (numPizzas < 2) {
            this.pizza2 = null;
        }
        else
            this.pizza2 = pizza2;
    }

    /**
     * Set the third pizza in the order.
     * @param pizza3
     */
    public void setPizza3(Pizza pizza3){
        if (numPizzas < 3){
            this.pizza3 = null;
        }
        else
            this.pizza3 = pizza3;
    }

    /**
     * Return the total cost of the order.
     */
    public double calcTotal(){
        double total = 0;
        if (pizza1 != null)
            total += pizza1.calcCost();
        if (pizza2 != null)
            total += pizza2.calcCost();
        if (pizza3 != null)
            total += pizza3.calcCost();
        return total;
    }

    /**
     * @return the number of pizzas in the order.
     */
    public int getNumPizzas(){
        return this.numPizzas;
    }

    /**
     * @return the first pizza in the order or null if pizza1 is not set.
     */
    public Pizza getPizza1(){
        return pizza1;
    }
    /**
     * @return the second pizza in the order or null if pizza1 is not set.
     */
    public Pizza getPizza2(){
        return pizza2;
    }
    /**
     * @return the third pizza in the order or null if pizza1 is not set.
     */
    public Pizza getPizza3(){
        return pizza3;
    }

    public static void main(String[] args) {
        /**
         * Create a large pizza, 1 cheese, 1 ham Pizza
         */
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        /**
         * Create a medium pizza, 2 cheese, 2 pepperoni
         */
        Pizza pizza2 = new Pizza("medium", 2,2,0);
        /**
         * create an order
         */
        PizzaOrder order1= new PizzaOrder();
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); //  Set second pizza
        double total = order1.calcTotal(); // Should be 18+20 = 38
        System.out.println("The total of order1 is: $" + total);

        PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor
        order2.getPizza1().setNumOfCheese(3); // Change toppings
        double total2 = order2.calcTotal(); // Should be 22 + 20 = 42
        System.out.println("The total of order2 is: $" + total2);

        double origTotal = order1.calcTotal(); //Should still be 38
        System.out.println("The total of order1 is: $" + origTotal);
    }
}
