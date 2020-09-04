package day6ronit;

//to use instance of abstract class

class SampleFlat extends BuilderHouse{
	
	public SampleFlat() {
		System.out.println("Sample Flat");
	}


	//Unemplemented method added here
	@Override
	public void washRoom() {
	System.out.println("Wash Room of sample flat");}
	
	@Override
	public void livingRoom() {
	System.out.println("Living Room of sample flat");}
	
	@Override
	public void bedRoom() {
	System.out.println("Bed Room of sample flat");}
	
	}
	
	


class RahulHouse extends BuilderHouse{
	
}



class Myhouse extends SampleFlat{
	
	public Myhouse(){
		System.out.println("My house");
		
	}
	
	
}


public class CheckBuilderHouse {
	
	public static void main(String[] args) {
		
		
		// As the class is abstract
		//BuilderHouse house = new BuilderHouse() ;
		
		//Thus here sample flat can be checked
		
		SampleFlat flat = new SampleFlat();
		flat.bedRoom();
		flat.livingRoom();
		flat.washRoom();
		
	}

}
