

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,j=0; 

Scanner s=new Scanner(System.in);
System.out.println("Enter your no=");
n=s.nextInt();
while(n!=0)
{
	n=n/10;
	j++;
}
System.out.println(j);

	}

}
