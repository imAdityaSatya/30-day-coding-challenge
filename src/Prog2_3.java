import java.util.Scanner;
public class Prog2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value in feet: ");
		// 1 feet = 0.305 meters
		double n = sc.nextDouble();
		double m = n*0.305;
		System.out.println(n+" feets is "+m+" meters" );
	}

}
