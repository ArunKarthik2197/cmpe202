package lambda;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

enum Country{
	India,Germany,USA,England
}
public class CharacterFactory {
	final static Map<Country,Supplier<Nationality>> hm = new HashMap<Country,Supplier<Nationality>>();
	
	public CharacterFactory() {
		setter();
	}
	private void setter(){
	hm.put(Country.India, Indian::new);
	hm.put(Country.Germany, German::new);
	hm.put(Country.USA, American::new);
	hm.put(Country.England, English::new);
	}
	
	public Nationality getNationality(Country country)
	{
		Supplier<Nationality> n = hm.get(country);
		if(n!=null)
		return n.get();
		
		throw new IllegalArgumentException("Country not found");
	}
}
