

public class NestedSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1&&j==3||i==2&&(j==2||j==4)||i==3&&(j==1||j==5)||i==4&&(j==2||j==4)||i==5&&(j==3))
					System.out.print("a");
				else if(i==2&&j==3||i==4&&(j==3)||i==3&&(j==2||j==4))
					System.out.print("b");
				else if(i==3&&j==3)
					System.out.print("c");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
