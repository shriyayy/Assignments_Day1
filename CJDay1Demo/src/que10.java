import java.util.Scanner;
public class que10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the size of array : ");
		int size = scanner.nextInt();
		int flag_1=1, flag_2=1,count=0;
		if (size < 0) {
			System.out.println("Invalid Input");
			flag_1 = 0;
		}
		if ( flag_1 != 0) {
			int arr[]=new int[size];
			//System.out.println("Enter Array Elements : ");
			for(int i=0; i<size;i++) {
				arr[i]=scanner.nextInt();
				if (arr[i]<0) {
					flag_2=0;
					System.out.println("Invalid Input");
					break;
				}
			}
			if (flag_2 != 0) {
				//System.out.println("Enter the element to be counted : ");
				int n = scanner.nextInt();
				for (int i=0;i<size;i++) {
					if (arr[i]==n) {
						count = count + 1;
					}
				}
				System.out.println(count);
			}
		}
		scanner.close();
	}

}
