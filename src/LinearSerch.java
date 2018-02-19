

import java.util.Scanner;

public class LinearSerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of array=");
		int n=s.nextInt();
		int [] ar=new int[n];
		System.out.println("enter the elements of an array=");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("enter the digit to be searched=");
		int x=s.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==x)
			{
				System.out.println("element found at"+" "+i+" "+"position");
			}
		}
	}

}
