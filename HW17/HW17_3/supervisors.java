
public class supervisors extends Employee {
	private String name,sex,phone,address;
	private int salary,year;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setSalary() {
		salary = 50000+5000+(getYear()*3000);
	}
	public int getSalary() {
		return salary;
	}
	public void show() {
		System.out.print("�~��G"+getSalary());
	}

	
}
