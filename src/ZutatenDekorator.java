
public abstract class ZutatenDekorator implements Getr�nk{

	protected Getr�nk tempGetr�nk;
	
	public ZutatenDekorator(Getr�nk newGetr�nk) {
		
		tempGetr�nk = newGetr�nk;
	}
	
	public String getDescription() {
	
		return tempGetr�nk.getDescription();
	}
	
	public double getCost() {
		
		return tempGetr�nk.getCost();
	}
	
	
	
}
