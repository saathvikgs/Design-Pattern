import java.util.*;
public class Dog extends Animal{
	public Dog() {
		super();
		setSound("Bark");
		flyType = new CantFly();
	}
	
	public void wagATail() {
		System.out.println("I can wag a tail");
	}
}