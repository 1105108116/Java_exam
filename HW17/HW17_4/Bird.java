
public class Bird extends Animal implements Flyer{
	Bird(String name,String color){
		super.setName(name);
		super.setColor(color);
	}
	public void fly() {
		System.out.println(getColor()+"�⪺"+getName()+"�b�ѤW���C");
	}

}
