  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        /*order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));*/
        
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Fresh Mozarella" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Thai Peanut Sauce","Mayonnaise" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        Bun bn = new Bun("Bun Options");
        String[] bno= {"Ciabatta"};
        bn.setOptions(bno);
        bn.wrapDecorator(s);
        
        Side sd= new Side("Side Options");
        String[] sdo={"Shoestring Fries"};
        sd.setOptions(sdo);
        sd.wrapDecorator(bn);
        
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( sd ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( p ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( bn ) ;
        customBurger1.addChild( sd ) ;
        
        order.addChild( customBurger1 );
        
        
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
        b1.setOptions( bo2 ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Greek Feta", "Smoked Gouda" } ;
        c1.setOptions( co2 ) ;
        c1.wrapDecorator( b ) ;
        
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozarella" } ;
        pc1.setOptions( pco2 ) ;
        pc1.wrapDecorator( c1 ) ;
        
        //  toppings free,
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t1.setOptions( to2 ) ;
        t1.wrapDecorator( pc1 ) ;
        
        // premium topping +1.50
        Premium p1 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg","Marinated Tomatoes" } ;
        p1.setOptions( po2 ) ;
        p1.wrapDecorator( t1 ) ;
        
        // 1 sauce free, extra +.75
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s1.setOptions( so2 ) ;
        s1.wrapDecorator( p1 ) ;
        
        Bun bn1 = new Bun( "Bun Options" ) ;
        String[] bno2= {"Gluten Free Bun"};
        bn1.setOptions(bno2);
        bn1.wrapDecorator(s1);
        
        Side sd1 = new Side( "Side Options" ) ;
        String[] sdo2={"Shoestring Fries"};
        sd1.setOptions(sdo2);
        sd1.wrapDecorator(bn1);
        
        
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( sd1 ) ;
        customBurger2.addChild( b1 ) ;
        customBurger2.addChild( c1 ) ;
        customBurger2.addChild( pc1 ) ;
        customBurger2.addChild( t1 ) ;
        customBurger2.addChild( p1 ) ;
        customBurger2.addChild( s1 ) ;
        customBurger2.addChild( bn1 ) ;
        customBurger2.addChild( sd1 ) ;
        // Add Custom Burger to the ORder
        
        order.addChild(customBurger2);
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/