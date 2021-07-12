import java.util.Scanner;
public class que5 {
	    static int productDigits(int n)
	    {
	    	if ((n<0) || (n>32767))
	    	{
	    		return (-1);
	    	}
	    	else
	    	{
	    		int product = 1;
		        while (n != 0) {
		            product = product * (n % 10);
		            n = n / 10;
		        }
		        return product;
	    	}   
	    }
	    public static void main(String[] args)
	    {
	       int num, amount;
	       //System.out.println("Enter the distance travelled : ");
	       Scanner scanner = new Scanner(System.in);
		   num = scanner.nextInt();
	       amount = productDigits(num);
	       if (amount==(-1)) {
	    	   System.out.println("Invalid Input");
	       }
	       else
	    	   System.out.println(amount);
	       scanner.close();
	    }

}