
public class sort {

	public static void sort1(String[] oreo)
	{
		int pos=0,com=0;
		String temp=null;
		while(pos<oreo.length)
		{
			com=pos+1;
			while(com<oreo.length)
			{
				if(oreo[pos].compareTo(oreo[com])>0)
				{
					temp=oreo[pos];
					oreo[pos]=oreo[com];
					oreo[com]=temp;
					
				}
				com++;
			}
			pos++;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
String[] str={"hai","DRYYHU","vhfh","akjf"};
sort.sort1(str);
for( String ar:str)
{
	System.out.println(""+ar);
}
	}

}
