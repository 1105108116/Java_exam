
public class Shop_account {
	private int KeyID=0,UID;
	private String account,password;
	Shop_account(String account,String password){
		KeyID++;
		UID = KeyID;
		this.account = account;
		setPassword(password);
	}
	public void setPassword(String password) {
		this.password = password;
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
		System.out.println("ÃÑ§O½X¡G"+UID+"\n±b¸¹¡G"+account+"\n±K½X¡G"+getPassword());
	}
	
}
