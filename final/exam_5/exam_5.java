import java.io.*;

public class exam_5 {
	public static void main (String[] args) throws IOException
	{
		Teacher[] t = new Teacher[2];
		Staff[] s = new Staff[2];
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0;i<4;i++) {
			if(i<2) {
				t[i] = new Teacher(null,null,0,0,null,0);
				System.out.println("輸入老師資料：");
				System.out.print("輸入姓名：");
				t[i].setName(buf.readLine());
				System.out.print("輸入電話：");
				t[i].setPhone(buf.readLine());
				System.out.print("輸入年齡：");
				t[i].setAge(Integer.parseInt(buf.readLine()));
				System.out.print("輸入收入：");
				t[i].setIncome(Integer.parseInt(buf.readLine()));
				System.out.print("輸入部門：");
				t[i].setDepartment(buf.readLine());
				System.out.print("輸入年資：");
				t[i].setSeniority(Integer.parseInt(buf.readLine()));
				
			}else if(i>=2) {
				s[i-2] = new Staff(null,null,0,0,null,0);
				System.out.println("輸入職員資料：");
				System.out.print("輸入姓名：");
				s[i-2].setName(buf.readLine());
				System.out.print("輸入電話：");
				s[i-2].setPhone(buf.readLine());
				System.out.print("輸入年齡：");
				s[i-2].setAge(Integer.parseInt(buf.readLine()));
				System.out.print("輸入收入：");
				s[i-2].setIncome(Integer.parseInt(buf.readLine()));
				System.out.print("輸入unit：");
				s[i-2].setUnit(buf.readLine());
				System.out.print("輸入年資：");
				s[i-2].setWorkyear(Integer.parseInt(buf.readLine()));
			}
				
		}
		for(int j = 0;j<4;j++) {
			if(j<2) {
				t[j].showProfile();
			}else if(j>=2) {
				s[j-2].showProfile();
			}
		}
	}
}
