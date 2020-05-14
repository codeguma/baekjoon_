package level.level5;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Five start = new Five();
//		start.problem10039();
		start.problem5543();
	}
	public void problem10039() {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int a;
		for(int i =0 ; i < 5 ; i++) {
			a = sc.nextInt();
			if(a <40) a = 40;
			
			sum += a;
		}
		System.out.println(sum/5);
		
	}
	
	public void problem5543() {
		
	}

}
