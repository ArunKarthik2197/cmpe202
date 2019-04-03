/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends CardDecorator implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if(ch.length()==1) {
		if ( cnt >= 17 && cnt <= 20  ) {
			date += ch ;
			getDescription(cnt);
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}else return;
		System.err.println("Count: "+cnt);
	}
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	@Override
	public void getDescription(int c) {
		if(c%2==0 && c<20)
			date+="/";
	}

}