/**
 * Create a PizzaOrder class that allows pizzas to be saved in an order.
 * The class is supposed to store the pizzas using an array.
 * Each pizza saved should be a Pizza object
 */
public class PizzaOrder {
    private int numPizzas;
    private Pizza [] order;

    public PizzaOrder(){
        this.numPizzas = 0;
        this.order = new Pizza[numPizzas];
    }

    public PizzaOrder(int numPizzas){
        this.numPizzas = numPizzas;
        this.order = new Pizza[numPizzas];
    }

    /**
     * Set the number of pizzas in the order.
     * @param numPizzas
     */
    public void setNumPizzas(int numPizzas){
        this.numPizzas = numPizzas;
        this.order = new Pizza[numPizzas];
    }

    public void setPizza(int index, Pizza newPizza){
        this.order[index] = newPizza;
    }

    public int getNumPizzas(){
        return this.numPizzas;
    }

    /**
     * Return the total cost of the order.
     */
    public double calcTotal(){
        double total = 0;
        for(int i =0; i < this.order.length; i++){
            total += this.order[i].calcTotal();
        }
        return total;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 0, 1); //Create a large pizza, 1 cheese, 1 ham Pizza
        Pizza pizza2 = new Pizza("medium", 2,2,0); //Create a medium pizza, 2 cheese, 2 pepperoni
        Pizza pizza3 = new Pizza();
        Pizza pizza4 = new Pizza("small",1,2,3);

        PizzaOrder neworder1 = new PizzaOrder();
        neworder1.setNumPizzas(4);
        neworder1.setPizza(0,pizza1);
        neworder1.setPizza(1,pizza2);
        neworder1.setPizza(2,pizza3);
        neworder1.setPizza(3,pizza4);

        /** Get pizza 1 info */
        System.out.println("---pizza 1---");
        System.out.println(neworder1.order[0].getDescription());
        /** Get pizza 2 info */
        System.out.println("---pizza 2---");
        System.out.println(neworder1.order[1].getDescription());
        System.out.println("---pizza 3---");
        /** Get pizza 3 info */
        System.out.println(neworder1.order[2].getDescription());
        /** Get pizza 4 info */
        System.out.println("---pizza 4---");
        System.out.println(neworder1.order[3].getDescription());

        System.out.println("The number of pizzas in this order (neworder1): " + neworder1.getNumPizzas());
        double total = neworder1.calcTotal();
        System.out.println("The total cost of this order (neworder1) is $" + total);
    }
}
