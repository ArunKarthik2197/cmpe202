import java.util.Scanner;

public class Main {
        //GumballMachine gumballMachine;
	public static void main(String[] args) {
	    
	        System.out.println(" Enter the type of machine");
	        System.out.println(" Menu");
	        System.out.println(" 1 ) cost : 25 | accepts : Quarters only");
	        System.out.println(" 2 ) cost : 50 | accepts : Quarters only");
	        System.out.println(" 3 ) cost : 50 | accepts : Nickels,Dimes and Quarters");
	        Scanner s = new Scanner(System.in);
	        int ch = s.nextInt();
	        switch(ch){
	            
	            case 1 :   GumballMachine gumballMachine = new GumballMachine(5,25,1);
	                       gumballMachine.insertQuarter();
	                       gumballMachine.turnCrank();
	                       break;
	            case 2 :   GumballMachine gumballMachine1 = new GumballMachine(5,50,2);
	                       gumballMachine1.insertQuarter();
	                       gumballMachine1.turnCrank();
	                       break;
	            
	            case 3 :   GumballMachine gumballMachine2 = new GumballMachine(5,50,3);
	            	       gumballMachine2.insertQuarter();
	                       gumballMachine2.turnCrank();
	                       break;
	           }
	        

	}
}
