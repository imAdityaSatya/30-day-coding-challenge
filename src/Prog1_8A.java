import java.util.Scanner;
public class Prog1_8A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values to be exchanged: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c=a;a=b;b=c;
		System.out.println("After exchange: "+a+","+b);

	}

}
