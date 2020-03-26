import java.io.*;

public class HW17_3 {
	public static void main (String[] args) throws IOException
	{
		int total=0;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入一般職員數量：");
		int x = Integer.parseInt(buf.readLine());
		Basic_Employee[] be;
		be = new Basic_Employee[x];
		System.out.print("輸入一級主管數量：");
		int y = Integer.parseInt(buf.readLine());
		manager[] m;
		m = new manager[y];
		System.out.print("輸入二級主管數量：");
		int z = Integer.parseInt(buf.readLine());
		supervisors[] s;
		s = new supervisors[z];
		for(int i = 0; i < x;i++) {
			System.out.println("\n輸入第"+(i+1)+"位職員資料：");
			be[i]=new Basic_Employee();
			System.out.print("姓名：");
			be[i].setName(buf.readLine());
			System.out.print("性別：");
			be[i].setSex(buf.readLine());
			System.out.print("電話：");
			be[i].setPhone(buf.readLine());
			System.out.print("地址：");
			be[i].setAddress(buf.readLine());
			System.out.print("年資：");
			be[i].setYear(Integer.parseInt(buf.readLine()));
			be[i].setSalary();
			total += be[i].getSalary();
			be[i].show();
		}
		for(int j = 0;j < y;j++) {
			System.out.println("\n輸入第"+(j+1)+"位一級主管資料：");
			m[j] = new manager();
			System.out.print("姓名：");
			m[j].setName(buf.readLine());
			System.out.print("性別：");
			m[j].setSex(buf.readLine());
			System.out.print("電話：");
			m[j].setPhone(buf.readLine());
			System.out.print("地址：");
			m[j].setAddress(buf.readLine());
			System.out.print("年資：");
			m[j].setYear(Integer.parseInt(buf.readLine()));
			m[j].setSalary();
			total += m[j].getSalary();
			m[j].show();
		}
		for(int k = 0;k < z ;k++) {
			System.out.println("\n輸入第"+(k+1)+"位二級主管資料：");
			s[k] = new supervisors();
			System.out.print("姓名：");
			s[k].setName(buf.readLine());
			System.out.print("性別：");
			s[k].setSex(buf.readLine());
			System.out.print("電話：");
			s[k].setPhone(buf.readLine());
			System.out.print("地址：");
			s[k].setAddress(buf.readLine());
			System.out.print("年資：");
			s[k].setYear(Integer.parseInt(buf.readLine()));
			s[k].setSalary();
			total += s[k].getSalary();
			s[k].show();
		}
		System.out.print("\n總人事成本："+total);
	}

}
