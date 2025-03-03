package java_demo_prc;

public class CC1 {
	public CC1() {
		System.out.println("hi");
		System.out.println("--------------");
	}

	public CC1(int x) {
		this();
		System.out.println("hello");
		System.out.println(x);
		System.out.println("--------------");
	}
	public CC1(boolean x,double y) {
		this(100);
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------");
	}
	
		public CC1(String NAME,String NUM) {
			this(true,2.2);
		System.out.println(NAME);
		System.out.println(NUM);
		System.out.println("--------------");
		
		
	}

}
