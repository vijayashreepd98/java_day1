import java.util.*;
public class no_loop{
 public static int ind=0;
	public static void add1(int[] arr)
	{
		Scanner s =new Scanner(System.in);
		int i=0;
		while(i<arr.length)
		{
			System.out.println("enter millage");
			arr[i]=s.nextInt();
			i++;
		} 
	}
	public static void traverse(int [] kitkat)
	{
		if(ind>=kitkat.length)
		{
			return ;
		}
		else
		{
			System.out.println(kitkat[ind]);
			// kitkat[ind];
		ind++;
		}
		
		traverse(kitkat);
	}
	
	public static void replacing(int[] res)
	
	{
		int index=0;
		if(res[index]>30&&res[index]<=40)
			res[index]=25;
		replacing(res);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int millage[]=new int[5];
no_loop.add1(millage);
no_loop.replacing(millage);
	}

}
