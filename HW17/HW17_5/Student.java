
public class Student {
	public String name,sex,major;
	public int age,height,weight;
	Student(String name,String sex,int age,String major,int height,int weight){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.major = major;
		this.height = height;
		this.weight = weight;
	}
	Student(){
		this(null,null,0,null,0,0);
	}
	public void show() {
		System.out.print("�m�W�G"+name+"\n�ʧO�G"+sex+"\n�~�֡G"+age+"\n��t�G"+major+"\n�����G"+height+"\n�魫�G"+weight);
	}

}
