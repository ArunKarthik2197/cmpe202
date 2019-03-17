import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class orders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Order
{
    public class OrderItem{
        private String name;
        private double price;
        ArrayList<String> toppings;
        ArrayList<String> meatTops;
        String meatType;
        private int qty ;
        public OrderItem(String name, double price,int quantity){
            this.name = name;
            this.price = price;
            toppings = new ArrayList();
            meatTops=new ArrayList();
            this.qty=quantity;
        }
        
        public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return qty;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
        
    }
    // instance variables - replace the example below with your own
    protected int ordersCount;
    private PrintingStrategy p;
    private ArrayList<OrderItem> orders;
    String header;
    String footer;

    /**
     * Constructor for objects of class orders
     */
    public Order()
    {
        // initialise instance variables
        orders= new ArrayList();
        ordersCount = 0;
        header="\t\tFIVE GUYS\t\t";
        footer="Register:1\t\t\t\t TranSeq no:####\nCashier:Nura\t\t\t\t";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addOrders()
    {
        String[] availmeatTops={"G Onion","Jala Grilled"};
        String[] availtoppings = {"Lettuce","Tomato","Mayo","Pickles","Grilled Onion"};
        
        Order.OrderItem o1 = new OrderItem("LBB", 5.59,1);
        o1.toppings.addAll(Arrays.asList("Lettuce","Tomato"));
        o1.meatTops.addAll(Arrays.asList("G Onion","Jala Grilled"));
        for(int i=0;i<o1.meatTops.size();i++)
        {
            o1.meatTops.set(i,"->|"+o1.meatTops.get(i));
           
        }
        o1.meatType="Bacon";
        orders.add(o1);
        
        Order.OrderItem o2 = new OrderItem("LTL CAJ", 2.79,1);
        orders.add(o2);
        
        ordersCount++;
    }
    public  ArrayList getOrderItems()
    {
        return  orders;
    }


    public void printReceipt(Order order)
    {
        // put your code here
        System.out.println(order);
        p= new ReceiptStrategy(order);
        p.display();
    }
    public void printPackingSlip(Order order)
    {
        p= new PackingSlipStrategy(order);
        p.display();
    }
}
