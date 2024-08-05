import java.util.*;
public class Prog2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the side: ");
		double x= sc.nextDouble();
		double area= ((3)*Math.sqrt(3)/2)*Math.pow(x, 2);
		System.out.println("The area of the hexagon is: "+area);
	}

}
