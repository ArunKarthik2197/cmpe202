import java.util.Scanner;
/**
 * Write a description of class GM3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GM3 extends GumballMachine
{
    // instance variables - replace the example below with your own

    private boolean has_dime;
    private boolean has_nickel;

    

    /**
     * Constructor for objects of class GM3
     */
    public GM3(int size, int price)
    {
        // initialise instance variables
        super(size,price);
        num_gumballs=size;
        has_quarter=false;
        has_dime=false;
        has_nickel=false;
        total=0;
        price1=price;
       
    }
        public void insertQuarter(int coin)
    {
        switch(coin)
        {
            case 5 :
                        has_nickel=true;
                        total=total+coin;
                        //turnCrank();
                        break;
            case 10 :
                        has_dime=true;
                        total=total+coin;
                        //turnCrank();
                        break;
            case 25 :
                        has_quarter=true;
                        total=total+coin;
                        //turnCrank();
                        break;
            default :
                        System.out.println("please insert a valid coin");
                        break;
        }
    }

    
    public void turnCrank()
    {
        if ( this.has_quarter || this.has_nickel || this.has_dime )
        {
            if ( this.num_gumballs > 0 )
            {
                if(price1==total)
                {
                    this.num_gumballs-- ;
                    reset();
                    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else if(total<price1)
                {
                    System.out.println(" you inserted "+total+" cents, please insert more "+(price1-total)+" cents to get a gumball");
                    Scanner scn=new Scanner(System.in);
                    int t=scn.nextInt();
                    insertQuarter(t);
                    turnCrank();
                }
                else
                {
                this.num_gumballs--;
                System.out.println("Gumball ejected, please take the remaining change of "+ (total-price1)+" cents");
                reset();
            }
            }
            else
            {
                reset();
                System.out.println( "No More Gumballs!  please take back your coin(s)." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
    public void reset(){
        has_quarter=false;has_dime=false;has_nickel=false;total=0;
    }

}
