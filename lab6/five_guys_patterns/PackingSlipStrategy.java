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
    Order o;
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
        this.o=o;
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
        System.out.println("\n\t\tPacking Slip\n");
        System.out.println("Patties-"+1+"\n");
        System.out.println("Order Number: "+o.ordersCount+"\n");
        System.out.println(o.header);
        System.out.println("Sandwich#"+1);
        //prints the sandwich order
        System.out.println("******************************************");
        System.out.println(sandwichOrder.getQuantity()+" "+sandwichOrder.getName());
        System.out.println("******************************************");
        Collections.sort(sandwichOrder.toppings);
        Collections.sort(sandwichOrder.meatTops);
        
        ArrayList<String> s = new ArrayList();
        s.addAll(sandwichOrder.toppings);
        s.addAll(sandwichOrder.meatTops);
        s.add("{{{{ "+sandwichOrder.meatType+" }}}}");
        //prints the toppings and bun components
        for(String element : s)
        {
            System.out.println(" "+element);
        }
        //prints the side dish order
        System.out.println("******************************************");
        System.out.println(sideOrder.getQuantity()+" "+sideOrder.getName());
        System.out.println("******************************************");
        //prints the footer
        System.out.println("\n"+o.footer);
    }
}
