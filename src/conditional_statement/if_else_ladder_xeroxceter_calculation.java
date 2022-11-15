package conditional_statement;

public class if_else_ladder_xeroxceter_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte xeroxcopy=1;
		if(xeroxcopy>=100) {
			System.out.println("above 100 copy 75 rupee");
		}
		else if(xeroxcopy>=75) {
			System.out.println("above 70 copies 80 paise");
		}
		else if(xeroxcopy>=50) {
			System.out.println("above 50 copies 85 paise");
		}
		else if(xeroxcopy>=25) {
			System.out.println("above 25 copies 2 rupee");
		}
		else {
			System.out.println("all prints and xerox are 5 rupess per pagefor 1st 25 copy");
		}
	}

}
