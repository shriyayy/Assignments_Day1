import java.util.Scanner;

public class que9 {
	public static void main(String[] args) {
		int sum = 0,count=0,count_1=0;
		//System.out.println("Enter the number of Elements : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num<0) {
			System.out.println("Invalid array size");
		}
		else {
			int arr[] = new int[(num+1)];
			//System.out.println("Enter array elements :");
			for (int i = 1;i<=num; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i=2;i<=num;i++) {
				count = 0;
				for (int l=1; l<=i ; l++) {
					if (i % l == 0) {
						count=count+1;
					}
				}
				if (count == 2) {
					sum = sum + arr[i];	
					count_1=count_1+1;
				}
			}
			int avg = sum/count_1;
			System.out.println(avg);
		}
		scanner.close();
	}

}
