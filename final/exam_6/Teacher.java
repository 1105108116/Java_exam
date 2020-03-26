
public class Teacher extends Member implements HealthInsurance{
	private String department;
	private int seniority;
	Teacher(String name,String phone, int age,float income, String department, int seniority){
		super(name,phone,age,income);
		this.department = department;
		this.seniority = seniority;
	}
	Teacher(String name,String phone, int age,float income, String department){
		super(name,phone,age,income);
		this.department = department;		
	}
	Teacher(String name,String phone, int age,float income){
		super(name,phone,age,income);	
	}
	Teacher(String name,String phone, int age){
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
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
	public float getAmount(float income) {
		return (float)((float)income*(float)getSeniority()*0.02);
	}
	public void showProfile() {
		System.out.print("\n姓名："+super.getName()+"\n電話："+super.getPhone()+"\n年齡："+super.getAge()+"\n部門："+getDepartment()+"\n年資："+getSeniority()+"\n收入："+(super.getIncome()*getSeniority())+"\n勞健保："+getAmount(super.getIncome()));
	}

}
