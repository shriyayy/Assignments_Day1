public class assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		if ( num == 1)
			System.out.println("neither Prime nor Composite");
		else {
		int i,j=0;
		for ( i=2; i<=(num/2); i++) {
			if (num%i == 0) {
				j = 1;
				break;
			}
		}
		if (j==0) 
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
	}
}
