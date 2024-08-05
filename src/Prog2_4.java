import java.util.Scanner;
public class Prog2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number between 0 and 1000: ");
		int n = sc.nextInt();
		int a = n%10; n=n/10;
		int b = n%10; n=n/10;
		System.out.println("The sum of digits is "+(a+b+n));
	}

}
