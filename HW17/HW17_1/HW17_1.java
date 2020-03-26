import java.io.*;

public class HW17_1 {
	public static void main (String[] args) throws IOException
	{
		String account,password,passwordcheck;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入帳號：");
		account = buf.readLine();
		System.out.print("輸入密碼：");
		password = buf.readLine();
		System.out.print("再輸入一次密碼：");
		passwordcheck = buf.readLine();
		while(passwordcheck.compareTo(password)!=0) {
			System.out.println("兩次密碼輸入錯誤，請重新輸入密碼！");
			System.out.print("輸入密碼：");
			password = buf.readLine();
			System.out.print("再輸入一次密碼：");
			passwordcheck = buf.readLine();
		}
		Shop_account a = new Shop_account(account,password);
		a.showProfile();
	}
}
