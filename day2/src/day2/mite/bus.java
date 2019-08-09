package day2.mite;
import java.util.*;

public class bus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int res[][]=new int[4][7];	
	int amount=0;
	Scanner s=new Scanner(System.in);
	int	bus[]={700,500,800,450};
for(int i=0;i<4;i++)
{
	for(int j=0;j<7;j++)
	{
		res[i][j]+=bus[i];
	}
}
int total[][]=new int[4][];
for(int i=0;i<4;i++)
{
	
for(int j=0;j<7;j++)
{
System.out.println("enter amout");
amount=s.nextInt();
if(amount==res[i][j])
{
	System.out.println("bus no ="+i+"and seat no="+j);
	total[i][j]=res[i];
	
}
	}

}
	}
