package java_demo_prc;

public class mainmethod_ORD {
	public static void main(String[] args) {
		method_ORD m1=new method_ORD();
		m1.travels();
		m1.place();
		m1.lodge() ;
		System.out.println("below statement are overrided");
		main_method_ORD m2=new main_method_ORD();
		m2.travels();
		m2.place();
		m2.lodge();
	}
}
