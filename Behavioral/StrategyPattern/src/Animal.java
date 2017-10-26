import java.util.*;

// We need to separate what is different between subclass and superclass
public class Animal {
	private String name;
	private double weight;
	private int height;
	private String sound;
	//This is composition.
	//Composition allows you to change the behavior of class during run time
	public Fly flyType;
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getHeight() {
		return height;
	}
	public void setSound(String newSound) {
		sound = newSound;
	}
	public String getSound() {
		return sound;
	}
	public void setFlyType(Fly newType) {
		flyType = newType;
	}
	public String tryToFly() {
		return flyType.fly();
	}
	
	//this is bad
	//Separate what is different among subclasses and the superclass
	/*public void flying() {
		System.out.println("I am flying");
	}*/
}
