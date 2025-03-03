package java_demo_prc;

public class Constructor {
	int id;
	String name;
	double marks;
	static String clgname="VLC";
	public  Constructor(int A,String B,double C)
	{
		id=A;
		name=B;
		marks=C;
	}
	public static void main(String[] args) {
		Constructor C1=new Constructor(20,"Ragul", 98.8);
		System.out.println(C1.id);
		System.out.println(C1.name);
		System.out.println(C1.marks);
		System.out.println(Constructor.clgname);
		System.out.println("---------------------");
		Constructor C2= new Constructor(10,"Dharun", 98.9);
		System.out.println(C2.id);
		System.out.println(C2.name);
		System.out.println(C2.marks);
		System.out.println(Constructor.clgname);
		
		
	}
	
}


