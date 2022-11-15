package Overriding;

public class Method_overriding {
	public static void main(String[] args) {
		System.out.println("Take talk of a cat");
		Cat c=new Cat();
		c.talk();
		
		System.out.println("TAKE TALK OF DOG");
		 Dog d=new Dog();
		 d.talk();
		
	}

}
