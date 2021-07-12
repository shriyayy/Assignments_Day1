import java.util.Scanner;

public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		//System.out.println("Enter the number whose sum is to be find out : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		while(n!=0) {
			sum = sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
