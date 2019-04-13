package oop;

enum Country{
	India,Germany,America
}
public class CharacterFactory {

	public Nationality getNationality(Country country)
	{
		if(country==Country.India) {return new Indian();}
		else if(country==Country.Germany) {return new German();}
		else if(country==Country.America) {return new American();}
		
		else return null;
	}
}
