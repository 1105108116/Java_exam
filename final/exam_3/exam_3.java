import java.io.*;

public class exam_3 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student(null,null,0,0,null);
		System.out.print("��J�m�W�G");
		s.setName(buf.readLine());
		System.out.print("��J�q�ܡG");
		s.setPhone(buf.readLine());
		while(s.getPhone()==null) {
			System.out.print("�q�ܮ榡��J���~�A�Э��s��J�G");
			s.setPhone(buf.readLine());
		}
		System.out.print("��J�~�֡G");
		s.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("��J�~�šG");
		s.setGrade(Integer.parseInt(buf.readLine()));
		System.out.print("��J�D�׬�t�G");
		s.setMajor(buf.readLine());
		s.showProfile();
	}

}
