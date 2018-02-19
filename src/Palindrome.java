

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,temp;
int n=121;
int rev=0;
temp=n;
while(n>0)
{
rev	=rev*10;
rev= rev+n%10;
n=n/10;
}
if(temp==rev)
{
	System.out.println("no is pallndrome");
}
else
	System.out.println("no is not pallindrome");
System.out.println(rev);
System.out.println(temp);
	}

}
