

import java.util.Scanner;

public class DemoFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a=");
		int a=s.nextInt();
		System.out.println("Enter the value for b=");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped value for a="+a);
		System.out.println("Swapped value for b="+b);
	}

}
