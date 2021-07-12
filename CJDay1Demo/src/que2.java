import java.util.Scanner;
public class que2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,j,count=1; 
		int arr[] = new int[20];
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter no.of employees :");
		num = sc.nextInt();
		if ((num<0))
		{
			System.out.println("Invalid Input!");
		}
		else if ((num>20)) {
			System.out.println("Only 20 employees are allowed");
		}
		else {
			//System.out.println("Enter salaries of the employees : ");
			for (i=0; i<num; i++) {
				arr[i]= sc.nextInt();
				if ( arr[i] < 0)
				{
					System.out.println("Invalid Input");
					break;
				}
			}
			for (i=0; i<num; i++) {
				for (j=i+1; j<num; j++) {
					if (arr[i] == arr[j]) {
						count = count + 1;
					}
				}
				if (count != 1)
					break;
			}
		}
		System.out.println(count);
		sc.close();
		
	}

}
