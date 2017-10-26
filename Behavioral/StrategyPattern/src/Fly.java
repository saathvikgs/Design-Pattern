//This interface can be implemented by many subclasses each having their own behavior for flying
//This doesnt affect Animal class or Fly interface
public interface Fly {
	String fly();
}

class CanFly implements Fly {
	@Override
	public String fly() {
		return "I can fly";
	}
}

class CantFly implements Fly {

	@Override
	public String fly() {
		return "I cant fly";
	}
	
}