
public class Plane extends Vehicle implements Flyer{
	Plane(String name,double speed){
		super.setName(name);
		super.setSpeed(speed);
	}
	public void fly(){
		System.out.println("�ɳt"+getSpeed()+"����/�p�ɪ�"+getName()+"�b�ѤW���C");
	}
}
