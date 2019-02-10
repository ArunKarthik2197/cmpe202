import java.util.Scanner;
/**
 * Write a description of class inTransaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class InTransaction implements State
{
    // instance variables - replace the example below with your own
    private int nickel_count;
    private int dime_count;
    private int quarter_count;
    GumballMachine gumballMachine;
    

    /**
     * Constructor for objects of class inTransaction
     */
    public InTransaction(GumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine=gumballMachine;
            nickel_count=0;
            dime_count=0;
            quarter_count=0;

    }

    public void insertQuarter() {
            switch(gumballMachine.total){
            case 5 : nickel_count=1;break;
            case 10 : dime_count=1;break;
            case 25 : quarter_count=1;break;
    }
            Scanner s = new Scanner(System.in);
            if(gumballMachine.total<gumballMachine.price){
            System.out.println("Insert the value of coin or enter 0 to eject coin");
            int coin= s.nextInt();
            if ( coin == 5 || coin == 10 || coin == 25)
            {
                gumballMachine.total=gumballMachine.total + coin;
                switch(coin){
                    case 5 :  System.out.println("You inserted a nickel");
                              nickel_count++;break;
                    case 10 : System.out.println("You inserted a dime");
                              dime_count++;break;
                    case 25 : System.out.println("You inserted a quarter");
                              quarter_count++;break;
                    
                  }
                    System.out.println("total inserted: "+gumballMachine.total+ "\tgumball price : "+ gumballMachine.price);
                    
                insertQuarter();
                //gumballMachine.total=gumballMachine.total + coin;
                //turnCrank();
              }
              else if(coin == 0){
                  ejectQuarter();
                }
            else
            {
                System.out.println("insert a valid coin");
                insertQuarter();
            }}
            else
            {
                
            }
          }
        

 
    public void ejectQuarter() {
        System.out.println(" "+quarter_count + " quarter(s) returned  " +nickel_count+" nickel(s) returned  "+dime_count+" dime(s) returned" );
        gumballMachine.total=gumballMachine.total-25;
        reset();
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(gumballMachine.total >= gumballMachine.price)
        {
            gumballMachine.setState(gumballMachine.getSoldState());
            System.out.println("Change returned: "+(gumballMachine.total-gumballMachine.price));
            reset();
                }
                else
                {
                  System.out.println("Not enough money");
                  gumballMachine.setState(gumballMachine.getNoQuarterState());
                }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
    public void reset(){
        nickel_count=0;
        quarter_count=0;
        dime_count=0;
        gumballMachine.total=0;
       }
}
