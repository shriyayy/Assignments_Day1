import java.util.Scanner;
public class que3 {

	public static void main(String[] args) {
		int arr[] = new int[50];
		int num, i, sum1=0, sum2=0;
		//System.out.println("Enter the size of an array : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if (num<0) {
			System.out.println("Invalid Array Size");
		}
		else {
			//System.out.println("Enter array elements : ");
			for (i=0; i<num; i++) {
				arr[i]= scanner.nextInt();
				if ( arr[i] < 0)
				{
					System.out.println("Invalid Input");
					break;
				}
				if (arr[i]%2 == 0) 
					sum1 = sum1 + arr[i];
				else 
					sum2 = sum2 + arr[i];
			}
			//System.out.println("Maximum Sum : ");
			if (sum1>sum2)
				System.out.println(sum1);
			else
				System.out.println(sum2);
		
		}
		scanner.close();
		
	}
	
}
