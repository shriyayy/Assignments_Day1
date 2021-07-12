import java.util.Scanner;
public class que11_new {
	public static void main(String[] args) {
		int flag=1;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter number : ");
		int num = scanner.nextInt();
		
		if (num<0) {
			System.out.println("Number too Small");
		}
		else if (num>32767) {
			System.out.println("Number too large");
		}
		else {
			while ((num>1)&&(num!=0)) {
				if(num%2 != 0) {
					flag=0;
					break;
				}
				num=num/2;
			}
			if (flag != 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		scanner.close();
	}

}
