
public class Student extends Member {
	private int grade;
	private String major;
	Student(String name,String phone,int age,int grade,String major){
		super(name,phone,age);
		this.grade = grade;
		this.major = major;
	}
	Student(String name,String phone,int age,int grade){
		super(name,phone,age);
		this.grade = grade;
	}
	Student(String name,String phone,int age){
		super(name,phone,age);
	}
	Student(String name,int age){
		super.setName(name);
		super.setAge(age);
	}
	Student(String name){
		super.setName(name);
	}
	public void setGrade(int i) {grade = i;}
	public void setMajor(String str) {major = str;}
	public int getGrade() {return grade;}
	public String getMajor() {return major;}
	public void showProfile() {
		System.out.print("�m�W�G"+super.getName()+"\n�q�ܡG"+super.getPhone()+"\n�~�֡G"+super.getAge()+"\n�~�šG"+getGrade()+"\n�D�סG"+getMajor());
	}
}
