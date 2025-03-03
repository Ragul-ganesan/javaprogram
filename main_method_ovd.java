package java_demo_prc;

public class main_method_ovd {
	public static void main(String[] args) {
		method_ovd.m1();//static call
		method_ovd.m1(100);//static call
		method_ovd.m1(110,2.2);//static call
		System.out.println("-------------");
		method_ovd a1=new method_ovd();//object creation
		a1.m2();
		a1.m2(20.2,100);
		
	}
}
