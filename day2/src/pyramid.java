
public class pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3, k = 0;
		char set1='Z';
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
            	
                System.out.print(" "+set1);
                set1-=(i);
                ++k;
            }
            System.out.println();
        }
	}

}
