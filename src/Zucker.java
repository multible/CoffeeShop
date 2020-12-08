public class Zucker extends ZutatenDekorator{

	public Zucker(Getr�nk newGetr�nk) {
		super(newGetr�nk);
		
	}
	
	public String getDescription() {
		
		return tempGetr�nk.getDescription() + ", Zucker";
	}
	
	public double getCost() {
		
		return tempGetr�nk.getCost() + 0.2;
	}

}