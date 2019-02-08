

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
	    System.out.println("You turned...");
	    if(gumballMachine.total==gumballMachine.price)
	    {
	       gumballMachine.setState(gumballMachine.getSoldState());
	       gumballMachine.total=0;
	   }
	   else
	   {
	       gumballMachine.setState(gumballMachine.getInTransaction());
	       State s = gumballMachine.state;
	       s.insertQuarter();
	   }
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
