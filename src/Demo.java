
  

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks,choice;
Scanner s =new Scanner(System.in);
System.out.println("Enter your marks");
marks=s.nextInt();
System.out.println("Enter your Choice \n 1-marks above 85 \n 2-marks above 70 below 85 \n 3-marks above 50 below 70 \n");

choice=s.nextInt();
switch(choice)
{
case 1:
	System.out.println("Excellent");
	break;
case 2:
	System.out.println("very good");
	break;
case 3:
	System.out.println("Good");
	break;
	default:
		
}

	}

}
