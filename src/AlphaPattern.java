

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j,k,l;
		for(i=1;i<=3;i++)
		{ int x=97;
			for(j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				char q=(char)x;
				System.out.print(q);
				x++;
			}
			x=x-2;
			for(k=1;k<i;k++)
			{
				char q=(char)x;
				System.out.print(q);
				x--;
			}
		System.out.println();
		}
		
		for(i=2;i>=1;i--)
		{ int x=97;
			for(j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				char q=(char)x;
				System.out.print(q);
				x++;
			}
			x=x-2;
			for(k=1;k<i;k++)
			{
				char q=(char)x;
				System.out.print(q);
				x--;
			}
		System.out.println();
		}
		
	}

}
