
public class Staff extends Member implements HealthInsurance {
	private String unit;
	private int workyear;
	Staff(String name,String phone,int age,int income,String unit,int workyear){
		super(name,phone,age,income);
		this.unit = unit;
		this.workyear = workyear;
	}
	Staff(String name,String phone,int age,int income,String unit){
		super(name,phone,age,income);
		this.unit = unit;
	}
	Staff(String name,String phone,int age,int income){
		super(name,phone,age,income);
	}
	Staff(String name,String phone,int age){
		super.setName(name);
		super.setPhone(phone);
		super.setAge(age);
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
	public float getAmount(int income) {
		return 0;
	}
	public void showProfile() {
		System.out.print("\nName："+super.getName()+"\nPhone："+super.getPhone()+"\nAge："+super.getAge()+"\nUnit："+getUnit()+"\nWorkyear："+getWorkyear()+"\nPosition："+getStaff(getWorkyear())+"\nIncome："+super.getIncome()+"\nHealthInsurance："+getAmount(super.getIncome())+"無須繳納健保額外補充負擔");
	}
}
