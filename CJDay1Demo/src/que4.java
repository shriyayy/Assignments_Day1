import java.util.Scanner;
public class que4 {
	public static void main(String[] args) {
		int num,notes=0;
		//System.out.println("Enter the fee amount : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if (num<0)
			System.out.println("Invalid Input");
		else
		{
			while(num>0) {
				if (num>=500) {
					num = num - 500;
					notes = notes + 1;
					continue;
				}
				else if ((num<500) && (num>=100)) {
					num = num - 100;
					notes = notes + 1;
					continue;
				}
				else if ((num<100) && (num>=50)) {
					num = num - 50;
					notes = notes + 1;
					continue;
				}
				else if ((num<50) && (num>=10)) {
					num = num - 10;
					notes = notes + 1;
					continue;
				}
				else if ((num<10) && (num>=5)) {
					num = num - 5;
					notes = notes + 1;
					continue;
				}
				else if ((num<5) && (num>=1)) {
					num = num - 1;
					notes = notes + 1;
					continue;
				}
			}
			System.out.println(notes);
		}
		scanner.close();
	}

}
