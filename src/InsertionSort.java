

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int temp=0;
		System.out.println("enter the length of array=");
		int n=s.nextInt();
		int [] ar=new int[n];
		System.out.println("enter the elements of an array=");
			
			for(int k=0;k<ar.length;k++)
			{ar[k]=s.nextInt();
				for(int j=0;j<ar.length-1;j++)
				{
					if(ar[k]<ar[j])
					{
						temp=ar[k];
						ar[k]=ar[j];
						ar[j]=temp;
					}
				}
			}
		System.out.println("sorted array");
		for(int k=0;k<ar.length;k++)
		{
			System.out.println(ar[k]);
		}
	}

}
