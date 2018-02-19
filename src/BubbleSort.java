

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int temp=0;
		System.out.println("enter the length of array=");
		int n=s.nextInt();
		int [] ar=new int[n];
		System.out.println("enter the elements of an array=");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("unsorted array");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}System.out.println("sorted array");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
