
public class RaceCar {
	private int speed;
	private String name;
	private int location = 0;
	
	//access location
	public int getLocation() {
		return location;
	}
	//set location
	public void setLocation(int location) {
		this.location = location;
	}
	
	private static int maxSpeedForAll = 120;
	
	public RaceCar (int speed, String name){
		setSpeed(speed);
		setName (name);
	}
	//Access MaxSpeedForAll for class RaceCar
	public static int getMaxSpeedForAll(){
		return maxSpeedForAll;
	}
	//Set MaxSpeedForAll for class RaceCar
	public static void setMaxSpeedForAll(int maxSpeedForAll){
		RaceCar.maxSpeedForAll= maxSpeedForAll;
	}
	
	//Access Speed for RaceCar object
	public int getSpeed(){
		return speed;
	}
	//Set Speed for RaceCar object
	public void setSpeed(int speed){
		if (speed <= maxSpeedForAll){
			this.speed= speed;
		}else{
			this.speed = maxSpeedForAll;
		}
	}
	//Access Name for RaceCar Object
	public String getName(){
		return name;
	}
	//Set Name for Race Car object
	public void setName(String name){
		this.name = name;
	}
}
