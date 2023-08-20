package day16.astaction.assignment;


class W
{
	static int c=0;
	public static void main(String[] args) {
		W w1 =c();
		W w2 = c(w1);

	}
	private W() {
		System.out.println("c = "+c);
	}
	static W c() {
		// TODO Auto-generated method stub
//	System.out.println(c++);
	
		return c++<=0?new W():null;
	}
	static W c(W w) {
		// TODO Auto-generated method stub
		return w.c++==1?new W():null;
	}
}
public class TestExample {

}
