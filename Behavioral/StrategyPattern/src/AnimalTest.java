import java.util.*;
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal bird = new Bird();
		bird.setName("Tweety");
		dog.setName("Joyce");
		System.out.println(dog.getName());
		System.out.println(dog.tryToFly());
		System.out.println("Bird " + bird.tryToFly());
		dog.setFlyType(new CanFly());
		System.out.println("Dog " + dog.tryToFly());
	}

}
