
public class Prog1_07{

	public static void main(String[] args) {
		int a=45;
		int b=67;
		System.out.println("Before exchange: "+a+","+b);
		a=a+b;b=a-b;a=a-b;
		System.out.println("After exchange: "+a+","+b);

	}

}
