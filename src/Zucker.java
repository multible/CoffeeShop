public class Zucker extends ZutatenDekorator{

	public Zucker(Getränk newGetränk) {
		super(newGetränk);
		
	}
	
	public String getDescription() {
		
		return tempGetränk.getDescription() + ", Zucker";
	}
	
	public double getCost() {
		
		return tempGetränk.getCost() + 0.2;
	}

}