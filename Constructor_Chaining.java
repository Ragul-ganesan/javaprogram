package java_demo_prc;

public class Constructor_Chaining {
	String NAME;
	int id;
	double marks;
	static String CLG="QSP";
	
	
	
	public Constructor_Chaining(String NAME,int id,double marks) {
		this.NAME=NAME;
		this.id=id;
		this.marks=marks;
		
		
	}
	public static void main(String[] args) {
		Constructor_Chaining c1=new Constructor_Chaining("DHARUN",2,98.8);
	System.out.println(c1.NAME);
	System.out.println(c1.id);
	System.out.println(c1.marks);
	System.out.println(Constructor_Chaining.CLG);
	System.out.println("----------------------");
	
	Constructor_Chaining c2=new Constructor_Chaining("RAGUL",3,98.6);
	System.out.println(c2.NAME);
	System.out.println(c2.id);
	System.out.println(c2.marks);
	System.out.println(Constructor_Chaining.CLG);
		
		
	}

}
