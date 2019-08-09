import java.util.*;
public class bus1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bus=0,busfare=0,seats=0,passenger=0,buscollect=0,total=0;
Scanner s=new Scanner(System.in);
 bus=1;
 while(bus<=4)
 {
	 System.out.println("Set the fare amount for bus"+bus);
	 busfare=s.nextInt();
	 seats=1;
		 buscollect=0;
	 while(seats<=7)
	 {
		 System.out.println("enter the amount:");
		 passenger=s.nextInt();
		 if(passenger==busfare)
		 {
			 System.out.println("can travel");
			 buscollect+=busfare;
	 }
		 else
		 {
			 System.out.println("cannot travel");
		 }
		 seats++;
		 
 }
	 System.out.println("Collection from bus:"+bus+"is"+buscollect);
	 total+=buscollect;
	 bus++;
	}
System.out.println("total collection of coorporation"+total);
}
}
