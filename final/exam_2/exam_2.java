import java.io.*;

public class exam_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Teacher t = new Teacher(null,null,0,null,0);
		System.out.print("輸入姓名：");
		t.setName(buf.readLine());
		System.out.print("輸入電話：");
		t.setPhone(buf.readLine());
		System.out.print("輸入年齡：");
		t.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("輸入部門：");
		t.setDepartment(buf.readLine());
		System.out.print("輸入年資：");
		t.setSeniority(Integer.parseInt(buf.readLine()));
		t.showProfile();
	}

}
