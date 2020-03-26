
public class Teacher extends Member {
	private String department;
	private int seniority;
	Teacher(String name,String phone, int age, String department, int seniority){
		super(name,phone,age);
		this.department = department;
		this.seniority = seniority;
	}
	Teacher(String name,String phone, int age, String department){
		super(name,phone,age);
		this.department = department;		
	}
	Teacher(String name,String phone, int age){
		super(name,phone,age);	
	}
	Teacher(String name, int age){
		super.setName(name);
		super.setAge(age);
	}
	Teacher(String name){
		super.setName(name);
	}
	public void setDepartment(String str) {department = str;}
	public void setSeniority(int i) {seniority = i;}
	public String getDepartment() {return department;}
	public int getSeniority() {return seniority;}
	public void showProfile() {
		System.out.print("\n�m�W�G"+super.getName()+"\n�q�ܡG"+super.getPhone()+"\n�~�֡G"+super.getAge()+"\n�����G"+getDepartment()+"\n�~��G"+getSeniority());
	}

}
