import java.io.*;

public class HW17_1 {
	public static void main (String[] args) throws IOException
	{
		String account,password,passwordcheck;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��J�b���G");
		account = buf.readLine();
		System.out.print("��J�K�X�G");
		password = buf.readLine();
		System.out.print("�A��J�@���K�X�G");
		passwordcheck = buf.readLine();
		while(passwordcheck.compareTo(password)!=0) {
			System.out.println("�⦸�K�X��J���~�A�Э��s��J�K�X�I");
			System.out.print("��J�K�X�G");
			password = buf.readLine();
			System.out.print("�A��J�@���K�X�G");
			passwordcheck = buf.readLine();
		}
		Shop_account a = new Shop_account(account,password);
		a.showProfile();
	}
}
