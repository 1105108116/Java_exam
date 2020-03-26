
public class Staff extends Member {
	private String unit;
	private int workyear;
	Staff(String name,String phone,int age,String unit,int workyear){
		super(name,phone,age);
		this.unit = unit;
		this.workyear = workyear;
	}
	Staff(String name,String phone,int age,String unit){
		super(name,phone,age);
		this.unit = unit;
	}
	Staff(String name,String phone,int age){
		super(name,phone,age);;
	}
	Staff(String name,int age){
		super.setName(name);
		super.setAge(age);
	}
	Staff(String name){
		super.setName(name);
	}
	public String getStaff(int workyear) {
		if(workyear>=6) {
			return "經理";
		}else if(workyear>=3) {
			return "組長";
		}else if(workyear>=1) {
			return "副組長";
		}else
			return "普通員工";
	}
	public void setUnit(String str) {unit = str;}
	public void setWorkyear(int i) {workyear = i;}
	public String getUnit() {return unit;}
	public int getWorkyear() {return workyear;}
	public void showProfile() {
		System.out.print("\nName："+super.getName()+"\nPhone："+super.getPhone()+"\nAge："+super.getAge()+"\nUnit："+getUnit()+"\nWorkyear："+getWorkyear()+"\nPosition："+getStaff(getWorkyear()));
	}
}
