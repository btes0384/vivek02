

public class NestedSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=5;i++)
{
	for(int j=1;j<=9;j++)
	{
		if(i==1&&j==5)
			System.out.print("*");
		else if(i==2&& (j==4|| j==6))
				System.out.print("*");
		else if(i==3&& (j==3|| j==5 || j==7) )
				System.out.print("*");
		else if(i==4&& (j==2|| j==4 || j==6 || j==8) )
			System.out.print("*");
		else if(i==5&& (j==1|| j==3 || j==5 || j==7 || j==9) )
			System.out.print("*");
		else
			System.out.print(" ");
		
	}
	System.out.println();
}
	}

}
