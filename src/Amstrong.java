

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,j=0,k; 

		Scanner s=new Scanner(System.in);
		System.out.println("Enter your no=");
		n=s.nextInt();
		k=n;
		while(n>0)
		{
			i=n%10;
			j=j+i*i*i;
			n=n/10;
		}
		if(j==k)
		{
			System.out.println("amstrong no.");
		}
		else
			System.out.println("not an armstrong no.");
	}
}
