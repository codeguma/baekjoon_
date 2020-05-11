package level.level4;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Four start = new Four();
		
		start.problem10952();
		start.problem10951();
		start.problem1110();
	}
	public void problem10952() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			if(num1 == 0 && num2 == 0) break;
			System.out.println(num1 + num2);
		}
	}
	public void problem10951() {
		 Scanner sc = new Scanner(System.in);
		 while( sc.hasNextInt()) {
		      
		      int  A = sc.nextInt();    
		      int  B = sc.nextInt();    

		         System.out.println(A+B);
		 }
		  
		     sc.close();
		        
		 }
	public void problem1110() {
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
        sc.close();
         
        int number = n;
        int count = 0;
         
        do {
            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
            count++;
        } while (n != number);
         
        System.out.println(count);
	}

}
