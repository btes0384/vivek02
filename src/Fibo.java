

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first value=");
		a=s.nextInt();
		System.out.println("Enter the second value=");
		b=s.nextInt();
		for(int k=0;k<10;k++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
	}

}
