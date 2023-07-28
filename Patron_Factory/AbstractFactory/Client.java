package AbstractFactory;

public class Client {
	public static void main(String[] args) throws Exception{
		// Instanciation statique de la fabrique
		AbstractFactory factory=new FactoryImplA();
		AbstractPlugin plugin=factory.getInstance();
		plugin.operation();
		// Instanciation dynamique de la fabrique
		factory =(AbstractFactory) Class.forName("AbstractFactory.FactoryImplB").newInstance();
		plugin=factory.getInstance();
		plugin.operation();
	}
}