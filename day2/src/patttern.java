
public class patttern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		int s=4;
		int count=a;
for(int i=0;i<4;i++)
{
	
	for(int j=0;j<4;j++)
	{
		
		if(i+j<3)
		{
			count=count+a;
		System.out.print(" ");	
		}
		if(i+j>=3)
		{
			count=count+a;
			System.out.print(""+(char)(count));
		}
	}
	a+=s;
	s--;
	System.out.print("\n");
}
	}

}
