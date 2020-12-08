
public class Milch extends ZutatenDekorator{

	public Milch(Getränk newGetränk) {
		super(newGetränk);
		
	}
	
	public String getDescription() {
		
		return tempGetränk.getDescription() + ", Milch";
	}
	
	public double getCost() {
		
		return tempGetränk.getCost() + 0.5;
	}

}
