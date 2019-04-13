package oop;

public class Indian  implements Nationality {


	@Override
	public void build() {
		System.out.println(""+this.getClass().getName().substring(4));
	}


}
