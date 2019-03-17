import java.util.ArrayList;
import java.text.DecimalFormat;
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
    Order o;
    ArrayList<Order.OrderItem> order;
    Order.OrderItem sandwichOrder;
    Order.OrderItem sideOrder;
    DecimalFormat fmt;

    /**
     * Constructor for objects of class ReceiptStrategy
     */
    public ReceiptStrategy(Order o)
    {
        // initialise instance variables
        this.o=o;
         order = o.getOrderItems();
         sandwichOrder = order.get(0);
         sideOrder = order.get(1);
         fmt = new DecimalFormat("0.00");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void display()
    {
        
        System.out.println("\t\t\tRECEIPT\n");
        System.out.println(o.header);
        System.out.println("Order Number : "+o.ordersCount+"\n");
        System.out.println(sandwichOrder.getQuantity()+" "+sandwichOrder.getName()+"\t\t\t"+sandwichOrder.getPrice());

        ArrayList<String> s = new ArrayList();
        s.add("{{{{ "+sandwichOrder.meatType+" }}}}");
        s.addAll(sandwichOrder.toppings);
        s.addAll(sandwichOrder.meatTops);
        
        //prints the condiments
        for(String element : s)
        {
            System.out.println("   "+element);
        }
       
        //prints the side dish order
        System.out.println("\n"+sideOrder.getQuantity()+" "+sideOrder.getName()+"\t\t"+sideOrder.getPrice());
        double [] prices = pricing(sandwichOrder,sideOrder);
        
        System.out.println("\n\nSub.Total\t\t$"+(prices[0]));
        System.out.println("Tax\t\t\t$"+prices[1]);
        System.out.println("Total\t\t\t$"+prices[2]);
        System.out.println("\n"+o.footer);
        System.out.println("  ******************************  ");
    }
    
    public double[] pricing(Order.OrderItem sandW, Order.OrderItem fries)
    {
        double san=sandW.getPrice();
        double fr =fries.getPrice();
        x=san+fr;
        double tax = (9.00/100.00)*x;
        double total = x+tax;
        x=Double.valueOf(fmt.format(x));
        tax=Double.valueOf(fmt.format(tax));
        total=Double.valueOf(fmt.format(total));
        double[] prices = {x,tax,total};
        return prices;
    }
}
