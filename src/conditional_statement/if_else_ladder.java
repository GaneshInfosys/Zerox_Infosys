package conditional_statement;

public class if_else_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=36;
		if(marks>=75) {
			System.out.println("first class with distinction passed");
		}
		else if(marks>=60) {
			System.out.println("first class passed ");
		}
		else if(marks>=50) {
			System.out.println("secound class passed");
		}
		else if(marks>=40) {
			System.out.println("passed with 3rd class");
		}
		else if(marks>=35) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
	}

}
