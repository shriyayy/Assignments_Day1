import java.util.Scanner;
public class assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter three integers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int sum = a + b + c;
		System.out.println(sum);
		scanner.close();
	}

}
