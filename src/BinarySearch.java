

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of array=");
		int n=s.nextInt();
		int [] ar=new int[n];
		int i;
		System.out.println("enter the elements of an array=");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("enter the digit to be searched=");
		int x=s.nextInt();
		int mid=ar.length/2;
			if(ar[mid]==x)
			{
				System.out.println("element found at"+" "+ i +" "+"position");
			}
			else if(x<ar[mid])
			{
				for(i=0;i<mid;i++)
				{
					if(x==ar[i])
						System.out.println("element found at"+" "+i+" "+"position");
					break;
				}
			}
			else if(x>ar[mid])
			{
				for(i=mid+1;i<ar.length;i++) 
					   
				{
					if(x==ar[i])
						System.out.println("element found at"+" "+i+" "+"position");
					break;
				}
			}
			
		
	}

}
