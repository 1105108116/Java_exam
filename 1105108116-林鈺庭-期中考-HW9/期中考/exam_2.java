package mid_exam;
import java.io.*;
public class exam_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String name,password,checkpass;
		int year,month,date,m,d,p;
		System.out.print("��J�m�W�G");
		name = buf.readLine();
		System.out.print("��J�X�ͦ~���G");
		year = Integer.parseInt(buf.readLine());
		System.out.print("��J�X�ͤ���G");
		month = Integer.parseInt(buf.readLine());
		System.out.print("��J�X�ͤ���G");
		date = Integer.parseInt(buf.readLine());
		System.out.print("��J�@���K�X�G");
		password = buf.readLine();
		System.out.print("�A��J�@���K�X�G");
		checkpass = buf.readLine();
		p = passcheck(password , checkpass);
		m = monthcheck(month);
		d = datecheck(month,date);
		if(p == 1 && m == 1 && d == 1) {
			System.out.println(name + "�z�n�A�w��z�}�l�ϥΥ��K�X�޲z�{���A�z���X�ͦ~��鬰" + year + "�~" + month + "��" + date + "��A�z���K�X���׬�"+password.length()+"�C");
		}
		
	}
	
	
	public static int monthcheck(int m) {
		if(m<=12 &&  m>=1) {
			return 1;
		}else
			System.out.println("�����J���~�I");
			return 0;
	}
	public static int datecheck(int m,int d) {
		if(d<=1) {
			System.out.println("�����J���~�I");
			return 0;
		}
		if(m == 1 | m == 3 | m == 5 | m == 7 | m == 10 | m == 12) {
			if(d >=31) {
				System.out.println("�����J���~�I");
				return 0;
			}else return 1;
		}else if(m == 2) {
			if(d>=28) {
				System.out.println("�����J���~�I");
				return 0;
			}else return 1;
		}else
			if(d>=30) {
				System.out.println("�����J���~�I");
				return 0;
			}else return 1;		
			
	}
	public static int passcheck(String pass, String check) {
		if(check.equals(pass)) {
			return 1;
		}else
			System.out.println("�⦸��J�K�X���P�A�j����{���AByeBye�I");
			return 0;
	}
}