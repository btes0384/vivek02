

import java.util.Scanner;

public class DemoEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of days to be converted=");
		int a=s.nextInt();
		int month=a/30;
		int days=a%30;
		System.out.println("The answer is="+month+"months"+"."+days+"days");
	}

}
