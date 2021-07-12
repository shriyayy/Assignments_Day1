import java.util.Scanner;
public class que1 {
	public static void main(String[] args) {
		int savings;
		//System.out.println("Enter salary : ");
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		if (salary > 8000) {
			System.out.println("Salary too large");
		}
		else if (salary < 0) {
			System.out.println("Salary too small");
		}
		else {
			//System.out.println("Enter No .of shifts : ");
			int shifts = scanner.nextInt();
			if (shifts < 0 ) {
				System.out.println("Shifts too small");
			}
			else {
				savings = (int) (salary - (0.2*salary) - (0.3*salary) + (0.02*salary*shifts));
				System.out.println(savings);
			}
		scanner.close();
		}
	}
}
