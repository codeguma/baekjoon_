package level.level5;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Five start = new Five();
//		start.problem10039();
//		start.problem5543();
//		start.problem10817();
		start.problem2523();
		
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
		Scanner in = new Scanner(System.in);
		 
		int burger = 2001;
		int drink = 2001;
 
		// 버거
		for (int i = 0; i < 3; i++) {
			int value = in.nextInt();
			if (value < burger) {	// 최솟값 찾기
				burger = value;
			}
		}
		
		
		// 음료
		for (int i = 0; i < 2; i++) {
			int value = in.nextInt();
			if (value < drink) {	// 최솟값 찾기
				drink = value;
			}
		}
 
		System.out.println(burger + drink - 50);
	}
	
	public void problem10817() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int temp = 0;
		
		if(A >= B) {
			if(A > C) {
				if(B >= C) temp = B;
				else temp = C;
			}else if(A < C) {
				temp = A;
			}else temp = C;
		}else {
			if(A > C) temp = A;
			else if(A == C) temp = A;
			else temp = C;
		}
		System.out.println(temp);
	}
	
	public void problem2523() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = A/2;
		
		for(int i =0; i < A ; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			//여기까지가 정방향 이 뒤로부터는 역방향으로 n-1로 찍혀야함.
			
		}
	}
		
	}


