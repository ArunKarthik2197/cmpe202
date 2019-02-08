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
    private int x;
    GumballMachine gumballMachine;

    /**
     * Constructor for objects of class inTransaction
     */
    public InTransaction(GumballMachine gumballMachine)
    {
        // initialise instance variables
        this.gumballMachine=gumballMachine;
    }

    public void insertQuarter() {
		if(gumballMachine.type==2)
		{
		    System.out.println("you inserted a quarter");
		    gumballMachine.total=gumballMachine.total + 25;
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
		            case 5 : System.out.println("You inserted a nickel");break;
		            case 10 :System.out.println("You inserted a dime");break;
		            case 25 :System.out.println("You inserted a quarter");break;
		          }
		        gumballMachine.total=gumballMachine.total + coin;
		        turnCrank();
		      }
		    else
		    {
		        System.out.println("insert a valid coin");
		        insertQuarter();
		    }
		  }
		}

 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.total >= gumballMachine.price)
		{
		    gumballMachine.total=0;
		    gumballMachine.setState(gumballMachine.getSoldState());
                }
                else
                {
                    System.out.println("total inserted: "+gumballMachine.total+ "\tgumball price : "+ gumballMachine.price);
                    System.out.println("Insert more coins to get a gumball");
                    insertQuarter();
                }
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
