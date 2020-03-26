
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
			return "�g�z";
		}else if(workyear>=3) {
			return "�ժ�";
		}else if(workyear>=1) {
			return "�Ʋժ�";
		}else
			return "���q���u";
	}
	public void setUnit(String str) {unit = str;}
	public void setWorkyear(int i) {workyear = i;}
	public String getUnit() {return unit;}
	public int getWorkyear() {return workyear;}
	public float getAmount(int income) {
		return 0;
	}
	public void showProfile() {
		System.out.print("\nName�G"+super.getName()+"\nPhone�G"+super.getPhone()+"\nAge�G"+super.getAge()+"\nUnit�G"+getUnit()+"\nWorkyear�G"+getWorkyear()+"\nPosition�G"+getStaff(getWorkyear())+"\nIncome�G"+super.getIncome()+"\nHealthInsurance�G"+getAmount(super.getIncome())+"�L��ú�ǰ��O�B�~�ɥR�t��");
	}
}
