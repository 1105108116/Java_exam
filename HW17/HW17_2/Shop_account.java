
public class Shop_account {
	private int KeyID=0,UID;
	private final String account,date;
	private String password;
	
	Shop_account(String account,String password,String date){
		KeyID++;
		UID = KeyID;
		this.date = date;
		this.account = account;
		setPassword(password);
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate() {
		return date;
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	public int getUID() {
		return UID;
	}
	public void showProfile() {
		System.out.println("�ѧO�X�G"+getUID()+"\n�b���G"+account+"\n�K�X�G"+getPassword()+"\n�إ߮ɶ��G"+getDate());
	}
	
}
