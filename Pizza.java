/**
 * Create a class named Pizza that stores information about a single pizza.
 * The class store the size of the pizza, the number of cheese toppings,
 * the number of pepperoni toppings, and the number of ham toppings.
 */
public class Pizza {
    private String size;
    private int numOfCheese;
    private int numOfPepp;
    private int numOfHam;

    public Pizza(){
        this.size = "small";
        this.numOfCheese = 0;
        this.numOfPepp = 0;
        this.numOfHam = 0;
    }

    /**Constructor(s) that set all the instance variables.
     * @param size the size of the pizza
     * @param numOfCheese the number of cheese toppings
     * @param numOfPepp the number of pepperoni toppings,
     * @param numOfHam the number of ham toppings
     */
    public Pizza(String size, int numOfCheese, int numOfPepp, int numOfHam){
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepp = numOfPepp;
        this.numOfHam = numOfHam;
    }

    /**
     * A constructor that takes a pizza object
     * @param pizza, a Pizza object
     */
    public Pizza(Pizza pizza){
        if (pizza == null)
                return;
        this.size = pizza.getSize();
        this.numOfCheese = pizza.getNumOfCheese();
        this.numOfPepp = pizza.getNumOfPepp();
        this.numOfHam = pizza.getNumOfHam();
    }

    /**
     * @return the size of this pizza
     */
    public String getSize(){
        return this.size;
    }
    /**
     * Set the size of this pizza
     */
    public void setSize(String size){
        this.size = size;
    }
    /**
     * @return the number of cheese toppings of this pizza
     */
    public int getNumOfCheese(){
        return this.numOfCheese;
    }
    /**
     * Set the number of cheese toppings of this pizza
     * @param numOfCheese the number of cheese toppings of this pizza
     */
    public void setNumOfCheese(int numOfCheese){
        this.numOfCheese = numOfCheese;
    }

    /**
     * @return  Return the number of pepperoni toppings of this pizza
     */
    public int getNumOfPepp() {
        return numOfPepp;
    }
    /**
     * Set the number of pepperoni toppings of this pizza
     * @param numOfPepp, the number of pepperoni toppings of this pizza
     */
    public void setNumOfPepp(int numOfPepp) {
        this.numOfPepp = numOfPepp;
    }
    /**
     * @return the number of ham toppings of this pizza
     */
    public int getNumOfHam() {
        return numOfHam;
    }
    /**
     * Set the number of ham toppings of this pizza
     * @param numOfHam the number of ham toppings of this pizza
     */
    public void setNumOfHam(int numOfHam) {
        this.numOfHam = numOfHam;
    }

    /**
     * Create a public method named calcCost( ) that returns a double that is the cost of the pizza.
     * @return the cost of the pizza
     */
    public double calcCost(){
        double price;
        if (size == "small")
            price = 10 + 2 * numOfCheese + 2 * numOfPepp + 2 * numOfHam;
        else if (size == "medium") {
            price = 12 + 2 * numOfCheese + 2 * numOfPepp + 2 * numOfHam;
        }
        else {
            price = 14 + 2 * numOfCheese + 2 * numOfPepp + 2 * numOfHam;
        }
        return price;
    }

    /**
     * Create a public method getDescription( ).
     * @Return the String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost( ).
     */
    public String getDescription(){
        String str = "Pizza size: " + this.size + "\n" +
                "The number of cheese toppings: " + numOfCheese +  "\n"  +
                "The number of pepperoni toppings: " + numOfPepp + "\n" +
                "The number of ham toppings: " + numOfHam + "\n" +
                "Total cost: $" + calcCost();
        return str;
    }

    public static void main(String[] args) {
        /**
         * A small pizza with one cheese, one pepperoni, and one ham. Total cost should be $16.
         */
        Pizza pizza1 = new Pizza("small", 1,1,1);
        System.out.println("---pizza1---" + "\n" + pizza1.getDescription());


        /**
         * A medium pizza with two cheese, three pepperoni, and one ham. Total cost should be $24.
         */
        Pizza pizza2 = new Pizza("medium", 2,3,1);
        System.out.println("---pizza2---" + "\n" + pizza2.getDescription());

        /**
         * A large pizza with one cheese, one pepperoni, and two ham. Total cost should be $22.
         */
        Pizza pizza3 = new Pizza("large", 1, 1, 2);
        System.out.println("---pizza3 (example stated in the description))---" + "\n" + pizza3.getDescription());
    }
}


