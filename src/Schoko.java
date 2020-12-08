public class Schoko extends ZutatenDekorator{

	public Schoko(Getränk newGetränk) {
		super(newGetränk);
		
	}
	
	public String getDescription() {
		
		return tempGetränk.getDescription() + ", Schoko";
	}
	
	public double getCost() {
		
		return tempGetränk.getCost() + 0.5;
	}

}