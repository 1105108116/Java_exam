package mid_exam;
import java.io.*;
import java.util.*;
public class exam_4 {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int n = 0,account;
		String action;
		Date foundtime = new Date();
		String name,password,checkpass;
		int year,month,date,m,d,p;
		System.out.print("��J�m�W�G");
		name = buf.readLine();
		System.out.print("��J�X�ͦ~���G");
		year = Integer.parseInt(buf.readLine());
		do {
			System.out.print("��J�X�ͤ���G");
			month = Integer.parseInt(buf.readLine());
			m = monthcheck(month);
		}while(m == 0);
		do {
			System.out.print("��J�X�ͤ���G");
			date = Integer.parseInt(buf.readLine());
			d = datecheck(month,date);
		}while(d == 0);
		do {
			System.out.print("��J�@���K�X�]�K�X���צܤ�8�r���^�G");
			password = buf.readLine();
			System.out.print("�A��J�@���K�X�G");
			checkpass = buf.readLine();
			p = passcheck(password , checkpass);
		}while(p == 0);
		System.out.println(name + "�z�n�A�w��z�}�l�ϥΥ��K�X�޲z�{���A�z���X�ͦ~��鬰" + year + "�~" + month + "��" + date + "��A�z���K�X���׬�"+password.length()+"�C");
		System.out.print("����J����Ƽƶq�G");
		account = Integer.parseInt(buf.readLine());
		String S_name[] = new String[account];
		String S_password[] = new String[account];
		String found[] = new String[account];
		while(n<account){
				
			System.out.print("�п�J�����Ψt�ΦW�١G");
			S_name[n] = buf.readLine();
			System.out.print("�п�J�n�x�s���K�X�G");
			S_password[n] = buf.readLine();
			found[n] = foundtime.toGMTString();
			System.out.print("�O�_�~���J�U�@����ơH�]Y/N�^�G");
			action = buf.readLine();
			if(action.equals("Y")) {
				n++;
			}else break;
		}	
		show(S_name,S_password,found);
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
		if(pass.length()<8) {
			System.out.println("���׻ݤj��8�Ӧr���A�ЦA��J�@���I");
			return 0;
		}
		if(check.equals(pass)) {
			return 1;
		}else
			System.out.println("�⦸��J�K�X���P�A�ЦA��J�@���I");
			return 0;
	}
	
	public static void show(String[] name,String[] password,String[] found) {
		for(int i = 0;i<name.length;i++) {
			System.out.println("�t�ΦW�١G"+name[i]+ "\n�t�αK�X�G"+password[i]+ "\n�t�Ϋإ߮ɶ��]dd MM YYYY ss:mm:hh�^�G"+found[i]);
		}
		
	}
	
}