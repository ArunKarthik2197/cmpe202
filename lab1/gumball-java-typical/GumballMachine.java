
import java.util.Scanner;
public class GumballMachine
{

    protected int num_gumballs;
    protected boolean has_quarter;
    protected int total;
    protected int price1;
    

    public GumballMachine( int size , int price)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.total=0;
        this.price1=price;
        
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 ){
            this.has_quarter = true ;
            this.total=total+coin;}
        
        else 
            this.has_quarter = false ;
    }

    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                if(price1==total)
                {
                    this.num_gumballs-- ;
                    this.has_quarter = false ;
                    total=0;
                    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    insertQuarter(25);
                    turnCrank();
                }
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
