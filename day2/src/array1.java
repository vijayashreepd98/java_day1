
public class array1 {
public static int max_elem(int[] ar1,int[] ar2)
{
	int max2=0,max1=0;
	for(int i:ar1)
	{
		for(int j:ar2)
		{max2=j;
			if(i>max2)
			{
				max2=i;
				
			}
			
			
				
		}
	}
	return max2;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]={12,98,45,23};
int arr2[]={67,34,87,98};

array1.max_elem(arr1, arr2);
}

}
