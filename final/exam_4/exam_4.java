import java.io.*;
public class exam_4 {
	public static void main (String[] args) throws IOException
	{
		Student[] st = new Student[3];
		Teacher[] tea = new Teacher[2];
		Staff[] sa = new Staff[2];
		st[0] = new Student("�p�L","03-5244389",21,4,"CSIE");
		st[1] = new Student("�p��","07-3895438",21,4,"CC");
		st[2] = new Student("�p��","04-6537524",22,4,"CSIE");
		tea[0] = new Teacher("�Ѥ�","07-3859673",50,"CSIE",12);
		tea[1] = new Teacher("�ѱi","06-3859457",58,"CE",25);
		sa[0] = new Staff("����","04-3645715",33,"�ڨ�ꤣ���D�o�O����:)",1);
		sa[1] = new Staff("����","03-5984625",36,"�ڨ�ꤣ���D�o�O����:)",7);
		System.out.println("�ǥ͸�ơG");
		for(int i = 0;i<3;i++) {
			st[i].showProfile();
			System.out.println();
		}
		System.out.println("�Ѯv��ơG");
		for(int i = 0;i<2;i++) {
			tea[i].showProfile();
			System.out.println();
		}
		System.out.println("¾����ơG");
		for(int i = 0;i<2;i++) {
			sa[i].showProfile();
			System.out.println();
		}
	}
}
