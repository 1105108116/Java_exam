package mid_exam;
import java.io.*;
public class exam_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String name,password;
		int year,month,date;
		
		System.out.print("��J�m�W�G");
		name = buf.readLine();
		System.out.print("��J�X�ͦ~���G");
		year = Integer.parseInt(buf.readLine());
		System.out.print("��J�X�ͤ���G");
		month = Integer.parseInt(buf.readLine());
		System.out.print("��J�X�ͤ���G");
		date = Integer.parseInt(buf.readLine());
		System.out.print("��J�K�X�G");
		password = buf.readLine();
		
		System.out.println(name + "�z�n�A�w��z�}�l�ϥΥ��K�X�޲z�{���A�z���X�ͦ~��鬰" + year + "�~" + month + "��" + date + "��A�z���K�X���׬�"+password.length()+"�C");
	}

}
