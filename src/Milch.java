
public class Milch extends ZutatenDekorator{

	public Milch(Getr�nk newGetr�nk) {
		super(newGetr�nk);
		
	}
	
	public String getDescription() {
		
		return tempGetr�nk.getDescription() + ", Milch";
	}
	
	public double getCost() {
		
		return tempGetr�nk.getCost() + 0.5;
	}

}
