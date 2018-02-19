

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int max=0;
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
	int i;
	for(i=0;i<ar.length;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
	}System.out.println("max is="+max);

	}

}
