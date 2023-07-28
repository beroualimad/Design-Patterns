package ALExemple_01;

public class PhoneFactory {
	public Phone makePhone(String phoneType) {
		if(phoneType.equalsIgnoreCase("Samsung")){
			return new Sumsung();
		}
		else if(phoneType.equalsIgnoreCase("iPhone")) {
			return new IPhone();
		}
		return null;
	}
}