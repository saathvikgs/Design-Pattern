import java.util.*;
public class Bird extends Animal{

	public Bird() {
		super();
		setSound("Chirp");
		flyType = new CanFly();
	}
}