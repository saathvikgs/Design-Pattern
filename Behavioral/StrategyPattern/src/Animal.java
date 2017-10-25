import java.util.*;
public class Animal {
	private String name;
	private double weight;
	private int height;
	private String sound;
	
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
}
