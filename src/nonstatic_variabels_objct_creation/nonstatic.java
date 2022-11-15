package nonstatic_variabels_objct_creation;

public class nonstatic {
	static int i=20;
	int j=85;
	public static void main(String[] args) {
		
		System.out.println(i);
		
		nonstatic n=new nonstatic();
		
		System.out.println(n.j);
	}
	
}
