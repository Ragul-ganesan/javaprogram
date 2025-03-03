package java_demo_prc;

public class main_Inheritance {
	public static void main(String[] args) {
		
		System.out.println(Inheritance1.a);
		Inheritance1.m1();// we can call static method by using class name
		Inheritance1 i1=new Inheritance1();
		System.out.println(i1.a);
		i1.dm1();
		System.out.println("---------------");
		Inheritance2 i2=new Inheritance2();
		System.out.println(i2.a);//1st class call
		System.out.println(i2.b);//2nd class call
		i2.m1();
		i2.m2();
		Inheritance2.m1();// we can call static method by using class name
		



	}
}