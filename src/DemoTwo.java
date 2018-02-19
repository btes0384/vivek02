

import java.util.Scanner;

public class DemoTwo {

	private static Scanner s;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String status;
		int marks;
s = new Scanner(System.in);
System.out.println("Enter the marks=");
marks=s.nextInt();
status=((marks>100) ? "Be in Your limits":(marks<35) ? "Fail":(marks>35 && marks<50) ? "Average": (marks>50 && marks<70) ? "Good":(marks>70 && marks<85) ? " Very Good":(marks>85 && marks<=100)?"Excellent":"");
System.out.println("Grade is="+ status);
	}

}
