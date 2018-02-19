

import java.util.Scanner;

public class SelectionSort {

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
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
for(int i=0;i<ar.length;i++)
{
	for(int j=i+1;j<ar.length;j++)
	{
		if(ar[i]>ar[j])
		{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	}
}System.out.println("sorted array");
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
	}

}
