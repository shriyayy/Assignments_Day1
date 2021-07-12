
public class assignment15 {

	public static void main(String[] args) {
		int num1=3, num2=5;
		for (int i=0; i<num2; i++) {
			for (int j=0; j<num1; j++) {
				if ( i%2 != 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

	}
}
