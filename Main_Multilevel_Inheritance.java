package java_demo_prc;

public class Main_Multilevel_Inheritance {
	public static void main(String[] args) {
		Multilevel_Inheritance1 m1=new Multilevel_Inheritance1();
		System.out.println(m1.a);
		System.out.println("----------");
		Multilevel_Inheritance2 m2=new Multilevel_Inheritance2();	
		System.out.println(m2.a);
		System.out.println(m2.b);
		System.out.println("----------");
		Multilevel_Inheritance3 m3=new Multilevel_Inheritance3();
		System.out.println(m3.a);
		System.out.println(m3.b);
		System.out.println(m3.c);
		
	}

}
