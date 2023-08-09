package PA;

public class Client {
	public static void main(String[] args) {
		Standard standard=new StandardImpl1();
		standard.operation(7, 9);
		Standard adaptee1=new AdaptateurHeritage();
		adaptee1.operation(7, 9);
		Standard adaptee2=new AdaptateurComposition();
		adaptee2.operation(7, 9);
}
}