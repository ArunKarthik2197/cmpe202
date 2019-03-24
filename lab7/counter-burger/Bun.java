
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String s;
    private String[] options;
    /**
     * Constructor for objects of class Bun
     */
    public Bun(String d)
    {
        // initialise instance variables
        super(d);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i=0;i<options.length;i++)
        {
        if ( "Gluten Free Bun".equals(options[i]) || "Hawaiian Bun".equals(options[i])|| "Pretzel Bun".equals(options[i]))
            this.price += (options.length-1) * 1.00 ;
        }
    }
    public String getDescription()
    {
        // put your code here
         s = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) s += " + " + options[i] ;
            else s = options[i] ;
        }        
        return s ;
    }
    
}
