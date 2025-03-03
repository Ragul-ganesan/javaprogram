package java_demo_prc;

public class method_ovd {
	public static void m1() {
		System.out.println("hi");
	}
	public static void m1(int a) {
		System.out.println(a);
	}
	public static void m1(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
	// below statement NON-STATIC method
	public void m2() {
		System.out.println("hey");
	}
	public void m2(double a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
}
