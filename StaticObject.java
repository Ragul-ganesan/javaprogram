package java_demo_prc;

public class StaticObject {
	int x=10;
	static int y=20;
	double d=2.2;
	static double a=20.2;
	public static void main(String[] args) {
		System.out.println(StaticObject.y);
		System.out.println(StaticObject.a);
		StaticObject S1=new StaticObject();//object creation
		
		System.out.println(S1.x);
		System.out.println(S1.d);
		System.out.println(S1.y);// we can call static method with reference variable but is not applicable
		System.out.println(S1.a);
		
		
		
		
	}
	
	

}
