import java.io.*;

public class HW17_5 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student[] s;
		int data;
		while(true) {
			try {
				System.out.print("����J��Ƶ��ơG");
				data = Integer.parseInt(buf.readLine());
				s = new Student[data];
				break;
			}
			catch(NegativeArraySizeException n) {
				System.out.println(n+"��J�L�ļƭȡA�Э��s��J�I");
			}
			catch(IllegalArgumentException i) {
				System.out.println(i+"��J�L�ļƭȡA�Э��s��J�I");
			}
		}
		for(int i = 0;i<data;i++) {
			System.out.println("��J��"+(i+1)+"�Ӿǥ͸�ơG");
			s[i] = new Student();
			while(true) {
				try {	
					System.out.print("�m�W�G");
					s[i].name = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
			while(true) {
				try {	
					System.out.print("�ʧO�G");
					s[i].sex = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
			while(true) {
				try {	
					System.out.print("�~�֡G");
					s[i].age = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
			while(true) {
				try {	
					System.out.print("��t�G");
					s[i].major = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
			while(true) {
				try {	
					System.out.print("�����G");
					s[i].height = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
			while(true) {
				try {	
					System.out.print("�魫�G");
					s[i].weight = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
				}
			}
		}
		while(true) {
			System.out.print("\n��ܱ����檺�ʧ@�G�]A.��ܩҦ����/B.�d�߳浧���/C.���}�{���^");
			String action = buf.readLine();
			switch(action){
				case "A" :
					for(int p = 0; p<data;p++) {
						System.out.println("\n��"+(p+1)+"��ǥ͸��");
						s[p].show();
					}
					break;
				case "B":
					while(true) {
						try {
							System.out.print("���d�߲ĴX��ǥ͡H");
							int nuber = Integer.parseInt(buf.readLine());
							s[nuber-1].show();
							break;
						}
						catch(NegativeArraySizeException n) {
							System.out.println(n+"��J�L�ļƭȡA�Э��s��J�I");
						}
						catch(IllegalArgumentException i) {
							System.out.println(i+"��J�L�ļƭȡA�Э��s��J�I");
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println(e+"��J�L�ļƭȡA�Э��s��J�I");
						}
					}
					break;
				case "C":
					System.exit(0);
			}
		}
	}
		
}
