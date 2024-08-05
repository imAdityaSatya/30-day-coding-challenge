import java.util.Scanner;
public class Prog2_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and length of cylinder");
		double r = sc.nextDouble();
		double l = sc.nextDouble();
		double pi = 3.14159; 
		double ar = pi*r*r;
		double vol = ar*l;
		System.out.println("The area is "+ar);
		System.out.println("The Volume is "+vol);
		
	}

}
