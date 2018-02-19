

import java.util.Scanner;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,marks;
Scanner s= new Scanner(System.in);
System.out.println("Enter the marks=");
marks=s.nextInt();
if(marks>=85)
	System.out.println("Grade A");
else if(marks>=70&&marks<85)
	System.out.println("Grade B");
else if(marks>=50&&marks<70)
System.out.println("Grade C");
else if(marks>=0&&marks<50)
System.out.println("Grade D");
	}
}
