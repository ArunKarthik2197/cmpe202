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
        quarter_count=1; 
    }

    public void insertQuarter() {
        if(gumballMachine.type==2)
        {
            System.out.println("you inserted a quarter");
            gumballMachine.total=gumballMachine.total + 25;
            quarter_count++;
            turnCrank();
        }
        else
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Insert the value of coin");
            int coin= s.nextInt();
            if ( coin == 5 || coin == 10 || coin == 25)
            {
                switch(coin){
                    case 5 :  System.out.println("You inserted a nickel");
                              nickel_count++;break;
                    case 10 : System.out.println("You inserted a dime");
                              dime_count++;break;
                    case 25 : System.out.println("You inserted a quarter");
                              quarter_count++;break;
                    
                  }
                gumballMachine.total=gumballMachine.total + coin;
                turnCrank();
              }
              else if(coin == 0){
                  ejectQuarter();
                }
            else
            {
                System.out.println("insert a valid coin");
                insertQuarter();
            }
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
		    reset();
                }
                else
                {
                    System.out.println("total inserted: "+gumballMachine.total+ "\tgumball price : "+ gumballMachine.price);
                    System.out.println("Insert more coins to get a gumball,  if you wish to eject quarter turn the eject or enter 0");
                    insertQuarter();
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
