
/**
 * Write a description of class PremiumCheese here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumCheese extends LeafDecorator
{
    private String[] options ;
    
    
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    
    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        //String[] premium= {"Danish Blue Cheese","Gruyere","Vegan Cheddar","Herbed Goat Cheese Spread","Fresh Mozarella","Soft Ripened Brie","Machengo"};
        if ( options.length > 0)
            this.price+=(options.length-1) * 1.50;
            
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}
