package mid_exam;
import java.io.*;
public class exam_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String name,password,checkpass;
		int year,month,date,m,d,p;
		System.out.print("輸入姓名：");
		name = buf.readLine();
		System.out.print("輸入出生年份：");
		year = Integer.parseInt(buf.readLine());
		System.out.print("輸入出生月份：");
		month = Integer.parseInt(buf.readLine());
		System.out.print("輸入出生日期：");
		date = Integer.parseInt(buf.readLine());
		System.out.print("輸入一次密碼：");
		password = buf.readLine();
		System.out.print("再輸入一次密碼：");
		checkpass = buf.readLine();
		p = passcheck(password , checkpass);
		m = monthcheck(month);
		d = datecheck(month,date);
		if(p == 1 && m == 1 && d == 1) {
			System.out.println(name + "您好，歡迎您開始使用本密碼管理程式，您的出生年月日為" + year + "年" + month + "月" + date + "日，您的密碼長度為"+password.length()+"。");
		}
		
	}
	
	
	public static int monthcheck(int m) {
		if(m<=12 &&  m>=1) {
			return 1;
		}else
			System.out.println("月份輸入錯誤！");
			return 0;
	}
	public static int datecheck(int m,int d) {
		if(d<=1) {
			System.out.println("日期輸入錯誤！");
			return 0;
		}
		if(m == 1 | m == 3 | m == 5 | m == 7 | m == 10 | m == 12) {
			if(d >=31) {
				System.out.println("日期輸入錯誤！");
				return 0;
			}else return 1;
		}else if(m == 2) {
			if(d>=28) {
				System.out.println("日期輸入錯誤！");
				return 0;
			}else return 1;
		}else
			if(d>=30) {
				System.out.println("日期輸入錯誤！");
				return 0;
			}else return 1;		
			
	}
	public static int passcheck(String pass, String check) {
		if(check.equals(pass)) {
			return 1;
		}else
			System.out.println("兩次輸入密碼不同，強制結束程式，ByeBye！");
			return 0;
	}
}