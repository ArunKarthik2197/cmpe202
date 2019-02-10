import java.util.Scanner;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    Scanner scn = new Scanner(System.in);
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
	    if(gumballMachine.type==1 || gumballMachine.type==2){
	        System.out.println("You inserted a quarter");
		gumballMachine.total=gumballMachine.total + 25;
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		State s = gumballMachine.getState();
		s.insertQuarter();
            }
            else
            {
                System.out.println("insert a coin");
                int cn = scn.nextInt();
                switch(cn){
                    case 5 : System.out.println("You inserted a nickel");
                             break;
                    case 10: System.out.println("You inserted a dime");
                             break;
                    case 25: System.out.println("You inserted a quarter");
                             break;
                    default :System.out.println("insert valid coin");
                             break;
                }
                //System.out.println("You inserted a quarter");
		gumballMachine.total=gumballMachine.total + cn;
		gumballMachine.setState(gumballMachine.getInTransaction());
		State s = gumballMachine.state;
		s.insertQuarter();
            }
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
