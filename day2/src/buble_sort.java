import java.util.*;
public class buble_sort {
static public void sort2(String temp)
{
byte[] get=temp.getBytes();
int pos=0,com=0;
while(pos<get.length-1)
{
	com=0;
	while(com<get.length-pos-1)
	{
		if(get[com]>get[com+1])
		{
			get[com]^=get[com+1];
			get[com+1]^=get[com];
			get[com]^=get[com+1];
		}
		com++;
	}
	pos++;
	
}System.out.println(new String(get));
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str="DataScience";
//byte str[]=str1.getBytes();.
buble_sort.sort2(str);
System.out.println("main remains"+str);

	}

}
