import java.io.*;

public class exam_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Member m = new Member();
		System.out.print("輸入姓名：");
		m.setName(buf.readLine());
		System.out.print("輸入電話：");
		m.setPhone(buf.readLine());
		System.out.print("輸入年齡：");
		m.setAge(Integer.parseInt(buf.readLine()));
		m.showProfile();
	}
}
