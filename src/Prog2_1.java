import java.util.Scanner;
public class Prog2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Celcius: ");
		double C = sc.nextDouble();
		double F = (1.8)*C + 32;
		System.out.println(C+" degree celcius is equal to "+F+" fahrenheit");

	}

}
