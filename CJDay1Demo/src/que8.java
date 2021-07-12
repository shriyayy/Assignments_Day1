import java.util.Scanner;
public class que8 {
	public static void main(String[] args) {
		int flag1=1, flag2=1;
		//System.out.println("Enter the size of array : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if (size<0) {
			flag1=0;
			System.out.println("Invalid Array Size");
		}
		if(flag1 != 0){
			//System.out.println("Enter array Elements : ");
			int metlife[] = new int[size];
			int hardfort[] = new int[size];
			int arr[] = new int[2*size];
			for (int i=0; i<size; i++)
			{
				metlife[i]=scanner.nextInt();
				if (metlife[i]<0) {
					flag2 = 0;
					System.out.println("Invalid Input");
					break;
				}
			}
			
			
				for (int i=0; i<size; i++)
				{
					hardfort[i]=scanner.nextInt();
					if (hardfort[i]<0) {
						flag2 = 0;
						System.out.println("Invalid Input");
						break;
					}
				}
			
			
			if (flag2!=0) {
				for (int i=0; i<size; i=i+2) {
					
						if (metlife[i] == hardfort[i]) {
							arr[i] = metlife[i];
							arr[i+1] = (metlife[i+1]>hardfort[i+1])?metlife[i+1]:hardfort[i+1];
							}
						else {
							arr[i] = metlife[i];
							arr[i+1] = metlife[i+1];
							arr[i+2] = hardfort[i];
							arr[i+3] = hardfort[i+1];
						}
					}
				}
					for (int i=0; i<arr.length;i++) {
						System.out.println(arr[i]+" ");
					}
					}
		scanner.close();
				}
				
			}


