

import java.util.Scanner;

public class DemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char c='n';
do
{
	if(c!='y')
	{
System.out.println("Welcome to our main menu");	
	}
if(c=='y')
{
	System.out.println("Congratulations !! There is a coupon for you");
}
if(c=='n')
System.out.println("Press y to continue / Press any character to exit");
c=s.next().charAt(0);
}while(c=='y');

	}

}
