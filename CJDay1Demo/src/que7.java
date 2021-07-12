import java.util.Scanner;
public class que7 {
	public static void main(String[] args) {
		//System.out.println("Enter temperature in Fehrenheit : ");
		Scanner scanner = new Scanner(System.in);
		int fer = scanner.nextInt();
		float cel;
		if (fer<0) {
			System.out.println("Invalid Input");
		}
		else {
			cel = (((fer-32)*5)/9);
			String str = String.format("%.02f", cel);
			System.out.printf(str);
		}
		scanner.close();
	}

}
