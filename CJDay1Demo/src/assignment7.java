
public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, num1=15;
		//System.out.println("Series 1 : ");
		for (int j=0; j<num1; j++) {
			System.out.printf(i +" ");
			i=i+3;
		}
		System.out.println();
		int k = -20, num2 = 20;
		//System.out.println("\nSeries 2 : ");
		for (int l=0; l<num2; l++) {
			System.out.printf(k +" ");
			k=k+5;
		}
		System.out.println();
		//System.out.println("\nSeries 3 : ");
		int m = 1, num3 = 15;
		for (int n=0; n<num3; n++) {
			if (m%2 != 0) {
				System.out.printf(m +" ");
			}
			else
			{
				System.out.printf(((-1)*m)+" ");
		    }
			m=m+1;
		}
			
		}

}
