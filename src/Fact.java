

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,fact = 1
;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("Factorial is="+fact);
	}

}
