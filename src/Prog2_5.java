import java.util.Scanner;
public class Prog2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two velocities and the time interval: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		double a = (v1-v0)/t;
		System.out.println("The average acceleration is "+a);
		
	}

}
