package ALExemple_01;

public class Client {
	public static void main(String[] arg) {
		PhoneFactory factory = new PhoneFactory();
		Phone samsung = factory.makePhone("Samsung");           // make Samsung phone!
		IPhone iPhone = (IPhone)factory.makePhone("iPhone");    // make iphone!
	}
}