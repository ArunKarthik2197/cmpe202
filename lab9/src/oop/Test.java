package oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterFactory cfr = new CharacterFactory();
		Nationality ind =cfr.getNationality(Country.India);
		ind.build();
		
		Nationality grm =cfr.getNationality(Country.Germany);
		grm.build();
		
		Nationality usa =cfr.getNationality(Country.America);
		usa.build();
		
	}

}
