
public abstract class ZutatenDekorator implements Getränk{

	protected Getränk tempGetränk;
	
	public ZutatenDekorator(Getränk newGetränk) {
		
		tempGetränk = newGetränk;
	}
	
	public String getDescription() {
	
		return tempGetränk.getDescription();
	}
	
	public double getCost() {
		
		return tempGetränk.getCost();
	}
	
	
	
}
