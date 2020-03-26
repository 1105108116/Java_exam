import java.io.*;

public class HW17_5 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student[] s;
		int data;
		while(true) {
			try {
				System.out.print("欲輸入資料筆數：");
				data = Integer.parseInt(buf.readLine());
				s = new Student[data];
				break;
			}
			catch(NegativeArraySizeException n) {
				System.out.println(n+"輸入無效數值，請重新輸入！");
			}
			catch(IllegalArgumentException i) {
				System.out.println(i+"輸入無效數值，請重新輸入！");
			}
		}
		for(int i = 0;i<data;i++) {
			System.out.println("輸入第"+(i+1)+"個學生資料：");
			s[i] = new Student();
			while(true) {
				try {	
					System.out.print("姓名：");
					s[i].name = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
			while(true) {
				try {	
					System.out.print("性別：");
					s[i].sex = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
			while(true) {
				try {	
					System.out.print("年齡：");
					s[i].age = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
			while(true) {
				try {	
					System.out.print("科系：");
					s[i].major = buf.readLine();
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
			while(true) {
				try {	
					System.out.print("身高：");
					s[i].height = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
			while(true) {
				try {	
					System.out.print("體重：");
					s[i].weight = Integer.parseInt(buf.readLine());
					break;
				}
				catch(IllegalArgumentException e) {
					System.out.println(e+"輸入無效數值，請重新輸入！");
				}
			}
		}
		while(true) {
			System.out.print("\n選擇欲執行的動作：（A.顯示所有資料/B.查詢單筆資料/C.離開程式）");
			String action = buf.readLine();
			switch(action){
				case "A" :
					for(int p = 0; p<data;p++) {
						System.out.println("\n第"+(p+1)+"位學生資料");
						s[p].show();
					}
					break;
				case "B":
					while(true) {
						try {
							System.out.print("欲查詢第幾位學生？");
							int nuber = Integer.parseInt(buf.readLine());
							s[nuber-1].show();
							break;
						}
						catch(NegativeArraySizeException n) {
							System.out.println(n+"輸入無效數值，請重新輸入！");
						}
						catch(IllegalArgumentException i) {
							System.out.println(i+"輸入無效數值，請重新輸入！");
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println(e+"輸入無效數值，請重新輸入！");
						}
					}
					break;
				case "C":
					System.exit(0);
			}
		}
	}
		
}
