package NSMCALL_FROM_SAMECLASS;

public class SAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("main method is started");
	SAMPLE s=new SAMPLE();
	s.m1();
	s.m2();
	
	
	System.out.println("main method is ended");

	}
public void m1() { // method declaration 
	System.out.println("i am m1 non static method for same class");// method implementation 
}
public void m2() { // method decleration
	System.out.println("i am m2 non static method for same class");// method implimentation 
}


}
