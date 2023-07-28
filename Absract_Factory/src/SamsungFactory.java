
public class SamsungFactory implements AbstractFactory{
	@Override
	public Phone makePhone() {
		return new Sumsung();
	}

	@Override
	public Laptop makeLaptop() {
		return new SamsungLaptop();
	}
}
