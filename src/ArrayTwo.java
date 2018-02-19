

import java.util.Scanner;

public class ArrayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the rows of array=");
		int n=s.nextInt();
		int [][] ar=new int[n][];
		int i,j=0;
		for(i=0;i<ar.length;i++)
        {
        System.out.print("Enter the size for "+(i+1)+"row");
        int m=s.nextInt();
        ar[i]=new int[m];
        }
		for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar[i].length;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
	}

}
