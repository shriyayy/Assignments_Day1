
public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //System.out.print("First Ten Terms of Fibonacci Series : \n");
		 int a=0, b=1, c, sum=1 ;  
		 System.out.print(a +" "+ b);  // 0 and 1   
		 int i, num=10;
		 for(i = 2 ; i < num; ++i)  //starting from 2   
		 {    
			 c = a + b;    
			 System.out.print(" "+ c);    
			 a = b;    
			 b = c;    
		 }
		 System.out.println();
		// System.out.print("\nOdd numbers in Fibonacci Series less than 100 : \n");
		 a=0;
		 b=1;
		 System.out.print(b);  // 0 and 1  
		 c =  a + b;
		 while(c<100)  //starting from 2   
		 {    
			 c = a + b;
			 sum = sum + c;
			 if ((c%2 != 0))
				 System.out.print(" "+ c);    
			 a = b;    
			 b = c;    
		 }
		 System.out.println();
		 //System.out.print("\nEven numbers in Fibonacci Series between 100 and 1000: \n");
		 while((c>=100) && (c<=1000))  //starting from 2   
		 {       
			 if ((c%2 == 0))
				 System.out.print(c+" ");
			 c = a + b; 
			 a = b;    
			 b = c;    
		 }
		 System.out.println();
		// System.out.print("\nSum of Numbers less than 100: ");
		 int n1=0, n2=1, n3, j, sum_1=0;
		 sum_1 = sum_1 +n2;
		 for (j=2; j<15; i++) {
			 n3 = n1 + n2;
			 if (n3<100) {
				 sum_1 = sum_1 + n3;
			 }
			 n1 = n2;
			 n2 = n3;
		 }
		 System.out.println(sum_1);
	}

}
