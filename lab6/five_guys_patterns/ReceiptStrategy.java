import java.util.ArrayList;
/**
 * Write a description of class ReceiptStrategy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReceiptStrategy implements PrintingStrategy
{
    // instance variables - replace the example below with your own
    private double x;
    ArrayList<Order.OrderItem> order;
    Order.OrderItem sandwichOrder;
    Order.OrderItem sideOrder;

    /**
     * Constructor for objects of class ReceiptStrategy
     */
    public ReceiptStrategy(Order o)
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
        System.out.println("\t{{{{ "+sandwichOrder.meatType+" }}}}");
        System.out.println("\t"+sandwichOrder.toppings);
        System.out.println("\t->|"+sandwichOrder.meatTops);
        System.out.println(sideOrder.getName()+"\t"+sideOrder.getPrice());
        double [] prices = pricing(sandwichOrder,sideOrder);
        System.out.println("Sub.Total\t"+prices[0]);
        System.out.println("Tax\t"+prices[1]);
        System.out.println("Total\t"+prices[2]);
        System.out.println("");
    }
    public double[] pricing(Order.OrderItem sandW, Order.OrderItem fries)
    {
        double san=sandW.getPrice();
        double fr =fries.getPrice();
        x=san+fr;
        double tax = (9/100)*x;
        double total = x+tax;
        double[] prices = {x,tax,total};
        return prices;
    }
}
