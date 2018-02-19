

import java.util.Scanner;

public class DemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a=");
		int a=s.nextInt();
		System.out.println("Enter the value for b=");
		int b=s.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Swapped value for a="+a);
		System.out.println("Swapped value for b="+b);
	}

}
