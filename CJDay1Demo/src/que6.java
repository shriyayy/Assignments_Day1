import java.util.Scanner;
public class que6 {
	public static void main(String[] args) {
		int size,flag=0;
		//System.out.println("Enter No.of Elements : ");
		Scanner scanner = new Scanner(System.in);
		size = (scanner.nextInt());
		if (size<0) {
			System.out.println("Invalid Array Size");
		}
		else {
			int arr[]= new int[20];
			//System.out.println("Enter Cricketer ID and their Scores : ");
			for (int i=0; i<size; i++)
			{
				arr[i]=scanner.nextInt();
				if ((arr[i]<0) && ((i%2)==0)) {
					System.out.println("Invalid Input");
					flag = 1;
					break;
				}
				else if ((arr[i]<0) && ((i%2)!=0)) {
					System.out.println("Invalid Score");
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				//System.out.println("Enter the given Score : ");
				int givenScore = scanner.nextInt();
				//System.out.println("Employee ID of cricketers who scored more than the given score : ");
				for (int i=1; i<size; i=(i+2)) {
					if (givenScore<arr[i]) {
						System.out.println(arr[i-1]);
					}
				}
			}
			
		}
		scanner.close();
	}

}
