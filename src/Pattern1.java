

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
boolean flag=true;
System.out.print("Enter your no.");
int a=s.nextInt();
for(int i=2;i<a/2;i++)
{
	if((a%i)==0)
	{
		flag=false;
		break;
	}
}
if(flag==true)
{
	System.out.println("no is prime");
}
else
{
	System.out.println("no is not prime");
}

	}

}
