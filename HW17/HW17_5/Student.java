
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
		System.out.print("姓名："+name+"\n性別："+sex+"\n年齡："+age+"\n科系："+major+"\n身高："+height+"\n體重："+weight);
	}

}
