import java.util.Scanner;

public class assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,num;
		//System.out.println("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		n = num;
		while( n!= 0) {
			sum = sum + ((n%10)*(n%10)*(n%10));
			n = n/10;
		}
		if (sum == num)
			System.out.println("Armstrong Number!!");
		else 
			System.out.println("Not an Armstrong Number!!");
		scanner.close();	
	}

}
