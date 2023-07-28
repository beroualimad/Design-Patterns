
public class AppleFactory implements AbstractFactory{
	@Override
	public Phone makePhone() {
		return new IPhone();
	}

	@Override
	public Laptop makeLaptop() {
		return new MAC();
	}
}
