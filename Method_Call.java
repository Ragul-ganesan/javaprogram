package java_demo_prc;

public class Method_Call {
	static int a=100;
	double d=20.2;
	static boolean c=false;
	char E='Q';
	public static void m1()
	{
		float x=1.5f;
		System.out.println("hi ragul");
		System.out.println(x);
		System.out.println("Bye ragul");
	}
	public void m2()
	{
		boolean x=true;
		System.out.println("HI Dharun");
		System.out.println(x);
		System.out.println("Bye Dharun");
	}
	public static void main(String[] args) {
		
		Method_Call.m1();
		System.out.println("------------------");
		Method_Call M1=new Method_Call();//object creation M1 is reference variable
		System.out.println(M1.E);
		System.out.println(M1.d);
		M1.m2();
		System.out.println(Method_Call.a);
		System.out.println(Method_Call.c);
	}

}
