package java_demo_prc;

public class CC2 extends CC1{
	public CC2(char c,char d) {
		super("Ragul","123");
		System.out.println(c);
		System.out.println(d);
		System.out.println("--------------");
		
	}
	public CC2(double f,double g) {
		this('A','B');
		System.out.println(f);
		System.out.println(g);
		System.out.println("--------------");
	}
	public CC2() {
		this(3.3,4.4);
		System.out.println("bye");
		System.out.println("--------------");
	}
	public CC2(boolean x) {
		this();
		System.out.println(x);
		System.out.println("varata");
		System.out.println("--------------");
	}

}
