import java.io.*;

public class exam_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Member m = new Member();
		System.out.print("��J�m�W�G");
		m.setName(buf.readLine());
		System.out.print("��J�q�ܡG");
		m.setPhone(buf.readLine());
		System.out.print("��J�~�֡G");
		m.setAge(Integer.parseInt(buf.readLine()));
		m.showProfile();
	}
}
