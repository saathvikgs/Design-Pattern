import java.util.*;
public class Dog extends Animal{
	public Dog() {
		super();
		setSound("Bark");
		flyType = new CantFly();
	}
	/*BAD
	 * Abstract what is different to the sub classes.
	public void fly() {
		System.out.println("I cant fly");
	}*/
	public void wagATail() {
		System.out.println("I can wag a tail");
	}
}
