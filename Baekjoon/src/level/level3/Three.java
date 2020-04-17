package level.level3;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Three start = new Three();
//		start.problem2739();
		start.problem10950();
		
	}
	public void problem2739() {
		/*
		 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < 10 ; i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
	}
	public void problem10950() {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		 Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
		 
		 for(int i = 0; i < T ; i++) {
			 int A = sc.nextInt();
			 int B = sc.nextInt();
			 
			 System.out.println(A+B);
		 }
		 sc.close();
		 
	}

}
