import java.io.IOException;

public class HW17_4 {
	public static void main (String[] args) throws IOException
	{
		Bird[] b;
		b = new Bird[2];
		Plane[] p;
		p = new Plane[2];
		b[0] = new Bird("�j��","��");
		b[1] = new Bird("�Q�~","��");
		p[0] = new Plane("�i��747",988);
		p[1] = new Plane("�ŭx�@��",1000);
		for(int i = 0;i<2;i++) {
			b[i].show();
			b[i].fly();
			p[i].show();
			p[i].fly();
		}
	}
}
