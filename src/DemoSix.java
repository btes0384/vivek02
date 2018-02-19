

import java.util.Scanner;

public class DemoSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String k;
		System.out.println("Enter the value for a=");
		int a=s.nextInt();
		System.out.println("Enter the value for b=");
		int b=s.nextInt();
		System.out.println("Enter the value for c=");
		int c=s.nextInt();
		k=(a>b)&&(a>c)?"a is greater":(b>a)&&(b>c)?"b is greater":"c is greater";
		System.out.println("Greater value ="+k);
	}

}
