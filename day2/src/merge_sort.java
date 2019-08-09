
public class merge_sort {

	static public void merge_sort1(int[] arr,int low,int mid,int high)
	{
		int temp[]=new int[high];
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid&&j<high)
		{
			if(arr[i]>=arr[j])
			{
			temp[k++]=arr[j];	
			}
			else
				temp[k++]=arr[i];
		}
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		while(j>=mid)
		{
			temp[k++]=temp[j++];
		}
		int n=0;
		while(n<high)
			
		{
			arr[n]=temp[n];
			n++;
		}
		
	}
	static public void merge(int[] arr,int low,int high)
	{
		int mid=0;
		if(low<high)
			
		{
			mid=(low+high)/2;
			merge(arr,low,mid);
			merge(arr,mid+1,high);
			merge_sort1(arr,low,mid,high);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr={12,34,78,58,23};
merge_sort.merge(arr,0,arr.length);
	}

}
