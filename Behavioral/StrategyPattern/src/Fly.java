
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