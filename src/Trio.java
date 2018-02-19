

import java.util.Scanner;

public class Trio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter the first value=");
		a=s.nextInt();
		System.out.println("Enter the second value=");
		b=s.nextInt();
		System.out.println("Enter the third value=");
		c=s.nextInt();
		for(int k=0;k<10;k++)
		{
		d=a+b+c;
		a=b;
		b=c;
		c=d;
		System.out.println(d);
		}
	}

}
