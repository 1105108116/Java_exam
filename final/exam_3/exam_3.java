import java.io.*;

public class exam_3 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student(null,null,0,0,null);
		System.out.print("輸入姓名：");
		s.setName(buf.readLine());
		System.out.print("輸入電話：");
		s.setPhone(buf.readLine());
		while(s.getPhone()==null) {
			System.out.print("電話格式輸入錯誤，請重新輸入：");
			s.setPhone(buf.readLine());
		}
		System.out.print("輸入年齡：");
		s.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("輸入年級：");
		s.setGrade(Integer.parseInt(buf.readLine()));
		System.out.print("輸入主修科系：");
		s.setMajor(buf.readLine());
		s.showProfile();
	}

}
