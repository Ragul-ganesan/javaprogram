package java_demo_prc;

public class Main_Hierarchial_Inheritance {
	public static void main(String[] args) {
		Hierarchial_Inheritance1 h1=new Hierarchial_Inheritance1();
		System.out.println(h1.x);
		h1.m1();
		System.out.println("-----------------------");
		Hierarchial_Inheritance2 h2=new Hierarchial_Inheritance2();
		System.out.println(h2.x);
		System.out.println(h2.y);
		h2.m1();
		h2.m2();
		System.out.println("-----------------------");
		Hierarchial_Inheritance3 h3=new Hierarchial_Inheritance3();
		System.out.println(h3.x);
		System.out.println(h3.z);
		h3.m1();
		h3.m3();
	}

}
