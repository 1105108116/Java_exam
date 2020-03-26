
public class Member {
	private String name,phone;
	private int age;
	Member(String name,String phone,int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	Member(){
		this(null,null,0);
	}
	public void setName(String str) {name = str;}
	public void setPhone(String str) {phone = str;}
	public void setAge(int i) {age = i;}
	public String getName() {return name;}
	public String getPhone() {return phone;}
	public int getAge() {return age;}
	public void showProfile() {
		System.out.println("姓名："+getName()+"\n電話："+getPhone()+"\n年齡："+getAge());
	}
}
