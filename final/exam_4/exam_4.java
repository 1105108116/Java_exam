import java.io.*;
public class exam_4 {
	public static void main (String[] args) throws IOException
	{
		Student[] st = new Student[3];
		Teacher[] tea = new Teacher[2];
		Staff[] sa = new Staff[2];
		st[0] = new Student("小林","03-5244389",21,4,"CSIE");
		st[1] = new Student("小王","07-3895438",21,4,"CC");
		st[2] = new Student("小黃","04-6537524",22,4,"CSIE");
		tea[0] = new Teacher("老王","07-3859673",50,"CSIE",12);
		tea[1] = new Teacher("老張","06-3859457",58,"CE",25);
		sa[0] = new Staff("莉莉","04-3645715",33,"我其實不知道這是什麼:)",1);
		sa[1] = new Staff("阿興","03-5984625",36,"我其實不知道這是什麼:)",7);
		System.out.println("學生資料：");
		for(int i = 0;i<3;i++) {
			st[i].showProfile();
			System.out.println();
		}
		System.out.println("老師資料：");
		for(int i = 0;i<2;i++) {
			tea[i].showProfile();
			System.out.println();
		}
		System.out.println("職員資料：");
		for(int i = 0;i<2;i++) {
			sa[i].showProfile();
			System.out.println();
		}
	}
}
