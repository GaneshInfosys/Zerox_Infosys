package Starpatterns_Nested_loop;

public class C_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1) {
					System.out.print("@");
				}
				else if (i==2&&j==2) {
					System.out.print("#");
				}
				else if (i==3&&j==3) {
					System.out.print("$");
				}
			else if(i==4&&j==4) {
					System.out.print("%");
				}	
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}

	}

}
