package Starpatterns_Nested_loop;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0;
		int star=1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
		System.out.println();
		if(i<=3) {
			star++;
		}
		else {
			star--;
		}	
		}
	}
}
