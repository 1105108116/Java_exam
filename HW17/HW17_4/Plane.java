
public class Plane extends Vehicle implements Flyer{
	Plane(String name,double speed){
		super.setName(name);
		super.setSpeed(speed);
	}
	public void fly(){
		System.out.println("時速"+getSpeed()+"公里/小時的"+getName()+"在天上飛。");
	}
}
