
public class KaffeeMaschine {

	public static void main(String[] args) {
		
		Getr�nk Bestellung = new Milch(new Zucker(new Kaffee()));
		
		System.out.println("Zutaten: " + Bestellung.getDescription());
		
		System.out.println("Preis: " + Bestellung.getCost());

		Getr�nk Bestellung2 = new Schoko(new Milch(new Zucker(new Zucker(new Kaffee()))));
		
		System.out.println("Zutaten: " + Bestellung2.getDescription());
		
		System.out.println("Preis: " + Bestellung2.getCost());
		
	}

}
