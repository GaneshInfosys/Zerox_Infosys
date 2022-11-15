package constructor;

public class Guns1 {
	String gunNmae;
	int noOfBullets;
	public Guns1(String gunName,int noOfBullets) {
		this.gunNmae=gunName;
		this.noOfBullets=noOfBullets;
			
	}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Deshkew");
		}
	}
	

	
}
