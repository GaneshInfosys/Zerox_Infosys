package methods;

public class SRMcall_from_same_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("main method is started");
	m1();
	m2();
	m3();
	System.out.println("main method body close");
	}
	
	public static void m1() {
		System.out.println("i am running from regular method m1");
	}
	
	public static void m2() {
		System.out.println("i am running from regular method m2");
	}
	public static void m3() {
		System.out.println("i am running from regular method m3");
	}
	
}
