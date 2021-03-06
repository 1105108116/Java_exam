
public abstract class Member {
	private String name,phone;
	private int age,income;
	Member(String name,String phone,int age,int income){
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.income = income;
	}
	Member(){
		this(null,null,0,0);
	}
	public void setName(String str) {name = str;}
	public void setPhone(String str) {
		phone = (str.charAt(2)!='-' ? null : str);
	}
	public void setAge(int i) {age = i;}
	public void setIncome(int i) {income = i;}
	public String getName() {return name;}
	public String getPhone() {return phone;}
	public int getAge() {return age;}
	public int getIncome() {return income;}
	public abstract void showProfile();
}
