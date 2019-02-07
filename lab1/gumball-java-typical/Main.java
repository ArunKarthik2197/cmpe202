import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the machine type");
	    int machineNumber= s.nextInt();
	    switch(machineNumber){
	    case 1 : 
	               GumballMachine gumballMachine = new GumballMachine(5 , 25);

	               System.out.println(gumballMachine);

	               gumballMachine.insertQuarter( 25 );
	               gumballMachine.turnCrank();
	               break;
	    case 2 : 
	               GumballMachine gumballMachine2 = new GumballMachine(5 , 50);
	               //int coin = s.nextInt();
	               System.out.println(gumballMachine2);

	               gumballMachine2.insertQuarter( 25 );
	               gumballMachine2.turnCrank();
	               break;
	               
	    case 3 :
	    	       GM3 gumballMachine3 = new GM3(5 , 50);

	               System.out.println(gumballMachine3);
	               System.out.println("Insert a coin");
	               int coin1 = s.nextInt();
	               gumballMachine3.insertQuarter( coin1);
	               gumballMachine3.turnCrank();
	               break;
	           }
	         
	}
}
