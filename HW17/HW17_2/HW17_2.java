import java.io.*;
import java.text.*;
import java.util.Date;
public class HW17_2 {
	public static void main (String[] args) throws IOException
	{
		Date dnow = new Date();
		int n;
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		String password,passwordcheck;
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("欲創辦帳號數量：");
		n = Integer.parseInt(buf.readLine());
		String[] account = new String[n];
		for(int i = 0;i<n;i++) {
			System.out.print("輸入帳號：");
			account[i] = buf.readLine();
			for(int j = 0;j<i;j++) {
				while(account[i].compareTo(account[j])==0) {
					System.out.println("該帳號已註冊，請重新輸入！");
					System.out.print("輸入帳號：");
					account[i] = buf.readLine();
				}
			}
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
			Shop_account a_i = new Shop_account(account[i],password,ft.format(dnow));
			a_i.showProfile();
		}
	}

}
