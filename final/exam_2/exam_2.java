import java.io.*;

public class exam_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Teacher t = new Teacher(null,null,0,null,0);
		System.out.print("��J�m�W�G");
		t.setName(buf.readLine());
		System.out.print("��J�q�ܡG");
		t.setPhone(buf.readLine());
		System.out.print("��J�~�֡G");
		t.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("��J�����G");
		t.setDepartment(buf.readLine());
		System.out.print("��J�~��G");
		t.setSeniority(Integer.parseInt(buf.readLine()));
		t.showProfile();
	}

}
