package mid_exam;
import java.io.*;
import java.util.*;
public class exam_5 {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int n = 0,account,action1,action_re;
		String action,pwsearch;
		Date foundtime = new Date();
		String name,password,checkpass;
		int year,month,date,m,d,p;
		System.out.print("輸入姓名：");
		name = buf.readLine();
		System.out.print("輸入出生年份：");
		year = Integer.parseInt(buf.readLine());
		do {
			System.out.print("輸入出生月份：");
			month = Integer.parseInt(buf.readLine());
			m = monthcheck(month);
		}while(m == 0);
		do {
			System.out.print("輸入出生日期：");
			date = Integer.parseInt(buf.readLine());
			d = datecheck(month,date);
		}while(d == 0);
		do {
			System.out.print("輸入一次密碼（密碼長度至少8字元）：");
			password = buf.readLine();
			System.out.print("再輸入一次密碼：");
			checkpass = buf.readLine();
			p = passcheck(password , checkpass);
		}while(p == 0);
		System.out.println(name + "您好，歡迎您開始使用本密碼管理程式，您的出生年月日為" + year + "年" + month + "月" + date + "日，您的密碼長度為"+password.length()+"。");
		
		System.out.print("欲輸入的資料數量：");
		account = Integer.parseInt(buf.readLine());
		String S_name[] = new String[account];
		String S_password[] = new String[account];
		String found[] = new String[account];
		while(n<account){
				
			System.out.print("請輸入網站或系統名稱：");
			S_name[n] = buf.readLine();
			System.out.print("請輸入要儲存的密碼：");
			S_password[n] = buf.readLine();
			found[n] = foundtime.toGMTString();
			System.out.print("是否繼續輸入下一筆資料？（Y/N）：");
			action = buf.readLine();
			if(action.equals("Y")) {
				n++;
			}else break;
		}	
		
		System.out.print("輸入欲執行的動作（1.查詢密碼／2.新增／3.修改／4.顯示所有資訊／5.離開程式。）：");
		action1 = Integer.parseInt(buf.readLine());
		switch(action1) {
			case 1 :
				System.out.print("請輸入系統帳號：");
				pwsearch = buf.readLine();
				search(S_name,S_password,pwsearch);
				break;
			case 2 :
				
				
			case 3 :
				System.out.print("請輸入系統帳號：");
				action_re = Integer.parseInt(buf.readLine());
				
			case 4 :
				show(S_name,S_password,found);
				break;
			case 5 :
				break;
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
		if(pass.length()<8) {
			System.out.println("長度需大於8個字元，請再輸入一次！");
			return 0;
		}
		if(check.equals(pass)) {
			return 1;
		}else
			System.out.println("兩次輸入密碼不同，請再輸入一次！");
			return 0;
	}
	public static void show(String[] name,String[] password,String[] found) {
		for(int i = 0;i<name.length;i++) {
			System.out.println("系統名稱："+name[i]+ "\n系統密碼："+password[i]+ "\n系統建立時間（dd MM YYYY ss:mm:hh）："+found[i]);
		}
		
	}
	public static void add() {
		
	}
	public static void rewrite() {
		
	}
	public static void search(String S_name[], String S_password[],String searchAC) {
		for(int i = 0;i<S_name.length;i++) {
			if(searchAC.equals(S_name[i])) {
				System.out.println("該系統密碼為："+S_password[i]);
			}
		}
		
	}
}