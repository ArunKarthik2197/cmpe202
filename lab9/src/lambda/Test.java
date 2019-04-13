package lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterFactory cf = new CharacterFactory();
		
		Nationality ind=cf.getNationality(Country.India);
		ind.build();
		
		Nationality grm=cf.getNationality(Country.Germany);
		grm.build();
		
		Nationality usa=cf.getNationality(Country.USA);
		usa.build();
		
		Nationality eng=cf.getNationality(Country.England);
		eng.build();
		
	}

}
