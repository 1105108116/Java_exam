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
				System.out.println("��J�Ѯv��ơG");
				System.out.print("��J�m�W�G");
				t[i].setName(buf.readLine());
				System.out.print("��J�q�ܡG");
				t[i].setPhone(buf.readLine());
				System.out.print("��J�~�֡G");
				t[i].setAge(Integer.parseInt(buf.readLine()));
				System.out.print("��J���J�G");
				t[i].setIncome(Integer.parseInt(buf.readLine()));
				System.out.print("��J�����G");
				t[i].setDepartment(buf.readLine());
				System.out.print("��J�~��G");
				t[i].setSeniority(Integer.parseInt(buf.readLine()));
				
			}else if(i>=2) {
				s[i-2] = new Staff(null,null,0,0,null,0);
				System.out.println("��J¾����ơG");
				System.out.print("��J�m�W�G");
				s[i-2].setName(buf.readLine());
				System.out.print("��J�q�ܡG");
				s[i-2].setPhone(buf.readLine());
				System.out.print("��J�~�֡G");
				s[i-2].setAge(Integer.parseInt(buf.readLine()));
				System.out.print("��J���J�G");
				s[i-2].setIncome(Integer.parseInt(buf.readLine()));
				System.out.print("��Junit�G");
				s[i-2].setUnit(buf.readLine());
				System.out.print("��J�~��G");
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
