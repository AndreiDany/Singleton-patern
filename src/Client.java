
public class Client {

	public static void main(String[] args) {
		
		GuvernulRomaniei Iohanis = GuvernulRomaniei.getInstance();
		
		System.out.println(Iohanis.legile);
		System.out.println(Iohanis);
		
		GuvernulRomaniei Basescu = GuvernulRomaniei.getInstance();
		
		System.out.println(Basescu.legile);
		System.out.println(Basescu);

	}

}
