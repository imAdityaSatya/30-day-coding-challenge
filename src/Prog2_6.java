import java.util.Scanner;
public class Prog2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in pounds: ");
		double w = sc.nextDouble();
		System.out.print("Enter the height in inches: ");
		double h = sc.nextDouble();
		double bmi = (w*0.45359237)/Math.pow(h*0.0254, 2);
		System.out.println("Your BMI is "+bmi);
				
		
	}

}
