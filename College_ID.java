package java_demo_prc;

public class College_ID {
	String Name;
	String RollNO;
	String DEPT;
	static String  CLGName;
	public static void main(String[] args) {
		College_ID.CLGName="P.K.N";
		College_ID C1=new College_ID();
		C1.Name="Dharun.A";
		C1.RollNO="21CCA27";
		C1.DEPT="B.COM";
		System.out.println("NAME="+C1.Name);
		System.out.println("RollNO="+C1.RollNO);
		System.out.println("DEPT="+C1.DEPT);
		System.out.println("CLG="+College_ID.CLGName);

		System.out.println("-------------------");

		College_ID C2=new College_ID();
		College_ID.CLGName="K.L.N";
		C2.Name="G.Ragul";
		C2.RollNO="213903";
		C2.DEPT="ECE";
		System.out.println("Name="+C2.Name);
		System.out.println("RollNo="+C2.RollNO);
		System.out.println("DEPT="+C2.DEPT);
		System.out.println("CLG="+College_ID.CLGName);



	}




}
