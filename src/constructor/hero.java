package constructor;

public class hero {
	String gunName;
	int NoOfBullets;
	public hero(String gunNmae,int NoOfBullets) {
		this.gunName=gunNmae;
		this.NoOfBullets=NoOfBullets;
	}
	public void shoot() {
		for(int i=1;i<=NoOfBullets;i++) {
			System.out.println("suuuuing");
		}
	}
	
}