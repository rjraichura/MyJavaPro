package day6ronit;

public abstract class BuilderHouse {
	
	public BuilderHouse() {
		System.out.println("Builder Flat");
	}
	
	public void livingRoom() {
		System.out.println("Living Room");
		
	}
	public void bedRoom() {
		
		System.out.println("Bed Room");
		
	}
	
	public void kitchen() {
		System.out.println("Kitchen");
	}
	public void washRoom() {};// will not give door//how is this possible

}
