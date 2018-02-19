

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
int i;
System.out.println("which table you want to print ?");
int j=s.nextInt();
for(i=1;i<=10;i++)
{

	System.out.println(j+"*"+i+"="+i*j);
}
	}

}
