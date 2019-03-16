import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class PackingSlipStrategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PackingSlipStrategy implements PrintingStrategy
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList<Order.OrderItem> order;
    Order.OrderItem sandwichOrder;
    Order.OrderItem sideOrder;
    /**
     * Constructor for objects of class PackingSlipStrategy
     */
    public PackingSlipStrategy(Order o)
    {
        // initialise instance variables
        //o= new Order();
         order = o.getOrderItems();
         sandwichOrder = order.get(0);
         sideOrder = order.get(1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void display()
    {
        // put your code here
        System.out.println("");
        System.out.println(sandwichOrder.getName()+"\t"+sandwichOrder.getPrice());
        Collections.sort(sandwichOrder.toppings);
        Collections.sort(sandwichOrder.meatTops);
        System.out.println("\t"+sandwichOrder.toppings);
        System.out.println("\t->|"+sandwichOrder.meatTops);
        System.out.println("\t{{{{ "+sandwichOrder.meatType+" }}}}");
        System.out.println(sideOrder.getName()+"\t"+sideOrder.getPrice());
       
        System.out.println("");
        System.out.println();
    }
}
