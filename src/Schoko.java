public class Schoko extends ZutatenDekorator{

	public Schoko(Getr�nk newGetr�nk) {
		super(newGetr�nk);
		
	}
	
	public String getDescription() {
		
		return tempGetr�nk.getDescription() + ", Schoko";
	}
	
	public double getCost() {
		
		return tempGetr�nk.getCost() + 0.5;
	}

}