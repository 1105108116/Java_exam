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
		System.out.print("���п�b���ƶq�G");
		n = Integer.parseInt(buf.readLine());
		String[] account = new String[n];
		for(int i = 0;i<n;i++) {
			System.out.print("��J�b���G");
			account[i] = buf.readLine();
			for(int j = 0;j<i;j++) {
				while(account[i].compareTo(account[j])==0) {
					System.out.println("�ӱb���w���U�A�Э��s��J�I");
					System.out.print("��J�b���G");
					account[i] = buf.readLine();
				}
			}
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
			Shop_account a_i = new Shop_account(account[i],password,ft.format(dnow));
			a_i.showProfile();
		}
	}

}
