
public class Client {
	public static void main(String[] arg) {
		AbstractFactory samsungFactory = new SamsungFactory();
		AbstractFactory appleFactory = new AppleFactory();
	    samsungFactory.makePhone();       // make samsung phone!
	    appleFactory.makePhone();         // make iphone!
	}
}

