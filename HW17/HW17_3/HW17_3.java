import java.io.*;

public class HW17_3 {
	public static void main (String[] args) throws IOException
	{
		int total=0;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��J�@��¾���ƶq�G");
		int x = Integer.parseInt(buf.readLine());
		Basic_Employee[] be;
		be = new Basic_Employee[x];
		System.out.print("��J�@�ťD�޼ƶq�G");
		int y = Integer.parseInt(buf.readLine());
		manager[] m;
		m = new manager[y];
		System.out.print("��J�G�ťD�޼ƶq�G");
		int z = Integer.parseInt(buf.readLine());
		supervisors[] s;
		s = new supervisors[z];
		for(int i = 0; i < x;i++) {
			System.out.println("\n��J��"+(i+1)+"��¾����ơG");
			be[i]=new Basic_Employee();
			System.out.print("�m�W�G");
			be[i].setName(buf.readLine());
			System.out.print("�ʧO�G");
			be[i].setSex(buf.readLine());
			System.out.print("�q�ܡG");
			be[i].setPhone(buf.readLine());
			System.out.print("�a�}�G");
			be[i].setAddress(buf.readLine());
			System.out.print("�~��G");
			be[i].setYear(Integer.parseInt(buf.readLine()));
			be[i].setSalary();
			total += be[i].getSalary();
			be[i].show();
		}
		for(int j = 0;j < y;j++) {
			System.out.println("\n��J��"+(j+1)+"��@�ťD�޸�ơG");
			m[j] = new manager();
			System.out.print("�m�W�G");
			m[j].setName(buf.readLine());
			System.out.print("�ʧO�G");
			m[j].setSex(buf.readLine());
			System.out.print("�q�ܡG");
			m[j].setPhone(buf.readLine());
			System.out.print("�a�}�G");
			m[j].setAddress(buf.readLine());
			System.out.print("�~��G");
			m[j].setYear(Integer.parseInt(buf.readLine()));
			m[j].setSalary();
			total += m[j].getSalary();
			m[j].show();
		}
		for(int k = 0;k < z ;k++) {
			System.out.println("\n��J��"+(k+1)+"��G�ťD�޸�ơG");
			s[k] = new supervisors();
			System.out.print("�m�W�G");
			s[k].setName(buf.readLine());
			System.out.print("�ʧO�G");
			s[k].setSex(buf.readLine());
			System.out.print("�q�ܡG");
			s[k].setPhone(buf.readLine());
			System.out.print("�a�}�G");
			s[k].setAddress(buf.readLine());
			System.out.print("�~��G");
			s[k].setYear(Integer.parseInt(buf.readLine()));
			s[k].setSalary();
			total += s[k].getSalary();
			s[k].show();
		}
		System.out.print("\n�`�H�Ʀ����G"+total);
	}

}
