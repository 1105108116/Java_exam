
public class Vehicle {
	private String name;
	private double speed;
	Vehicle(){
		name = "z1";
		speed = 110;
	}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setSpeed(double speed) {this.speed = speed;}
	public double getSpeed() {return speed;}
	public void show() {
		System.out.println("¦WºÙ¡G"+getName()+"\n³t«×¡G"+getSpeed());
	}
}
