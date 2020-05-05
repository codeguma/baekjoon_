package level.level4;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Four start = new Four();
		
		start.problem10952();
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

}
