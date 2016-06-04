
public class TheRace {

	public static void main(String[] args) {
		int maxSpeed = RaceCar.getMaxSpeedForAll();
		int raceLength = 1000;
		RaceCar savan = new RaceCar(60,"Savan");
		
		savan.setSpeed(100);
		
		//savan.getMaxSpeedForAll(); As a static method it should be called using name of class
		
		while (savan.getLocation() < raceLength){
			
			System.out.println(savan + " is in first place");
			
		}
		
	}

}
