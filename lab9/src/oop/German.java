package oop;

public class German implements Nationality {

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("" + this.getClass().getName().substring(4));
	}

}
