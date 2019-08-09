import java.util.Scanner;


public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,prime;
Scanner s =new Scanner(System.in);
System.out.println("enter first prime no");
prime=s.nextInt();
System.out.println("enter no of prime no");
n=s.nextInt();
int flag=0;
for(int i=prime;i<n+prime;i++)
{
for(int j=2;j<i;j++)
{
	if(i%j==0)
	{
		flag=0;
		break;
	}
	else
		flag=1;
}
if(flag==1)
{
	System.out.println(""+i);
}
}

	}

}
