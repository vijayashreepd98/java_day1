import  java.util.*;
public class series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder build=new StringBuilder();
Random ran=new Random();
int digit=1;
while(digit<=4)
{
	build.append(ran.nextInt(10));
	digit++;
}
	System.out.println("ur OTP is :"+build.toString());
	

	}

}
