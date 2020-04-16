package level.level3;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Three start = new Three();
		start.problem2739();
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

}
