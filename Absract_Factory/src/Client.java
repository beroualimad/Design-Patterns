
public class Client {
	public static void main(String[] arg) {
		AbstractFactory samsungFactory = new SamsungFactory();
	    AbstractFactory appleFactory = new AppleFactory();
		samsungFactory.makePhone(); // make Samsung phone!
        samsungFactory.makeLaptop();  // make Samsung Laptop!
        appleFactory.makePhone();  // make iphone!
        appleFactory.makeLaptop();  // make MAC!
	}
}

