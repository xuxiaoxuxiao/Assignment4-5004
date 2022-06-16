import static org.junit.Assert.*;

public class PizzaOrderTest {
    private int numPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private  PizzaOrder order1;

    @org.junit.Before
    public void setUp() throws Exception {
        pizza1 = new Pizza("large", 1, 0, 1);
        pizza2 = new Pizza("medium", 2,2,0);
        pizza3 = new Pizza("small", 3,1,0);
        order1= new PizzaOrder();
        order1.setNumPizzas(3); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza
        order1.setPizza3(pizza3); // Set third pizza
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getNumPizzas() {
        order1.setNumPizzas(1);
        assertEquals(1, order1.getNumPizzas());
        order1.setNumPizzas(5);
        assertEquals(1,order1.getNumPizzas());
    }

    @org.junit.Test
    public void getPizza1() {
        assertEquals(pizza1,order1.getPizza1());
        assertEquals(pizza1.getDescription(),order1.getPizza1().getDescription());

        System.out.println(pizza1.getDescription());
        System.out.println(order1.getPizza1().getDescription());
    }

    @org.junit.Test
    public void getPizza2() {
        assertEquals(pizza2, order1.getPizza2());
        assertEquals(pizza2.getDescription(),order1.getPizza2().getDescription());

        System.out.println(pizza2.getDescription());
        System.out.println(order1.getPizza2().getDescription());
    }

    @org.junit.Test
    public void getPizza3() {
        assertEquals(pizza3, order1.getPizza3());
        assertEquals(pizza3.getDescription(),order1.getPizza3().getDescription());

        System.out.println(pizza3.getDescription());
        System.out.println(order1.getPizza3().getDescription());
    }

    @org.junit.Test
    public void main() {
    }
}