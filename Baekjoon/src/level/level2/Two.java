package level.level2;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Two start = new Two();
//		start.problem1330();
//		start.problem9498();
//		start.problem2753();
//		start.problem14681();
		start.problem2884();
		
	}
	public void problem1330() {
		/*
		 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 * A가 B보다 큰 경우에는 '>'를 출력한다.
		   A가 B보다 작은 경우에는 '<'를 출력한다.
           A와 B가 같은 경우에는 '=='를 출력한다
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) System.out.println(">");
		else if(A==B) System.out.println("=");
		else System.out.println("<");
	
		sc.close();
	}
	public void problem9498() {
		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) System.out.println("A");
		else if(score >= 80) System.out.println("B");
		else if(score >= 70) System.out.println("C");
		else if(score >= 60) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}
	public void problem2753() {
		/*
		 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		      윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		      예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		   
		      첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if(year%400 == 0 && year%100 != 0) System.out.println("1");
		else if(year%100 != 0 && year%4 == 0) System.out.println("1");
		else if(year%400 == 0) System.out.println("1");
		else System.out.println("0");
		
/*		 if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }*/
		
		sc.close();
	}
	public void problem14681() {
		/*
		 * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
		 * 예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
		 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0) {
			if(y >0) System.out.println("1");
			else System.out.println("2");
		}else {
			if(y>0) System.out.println("3");
			else System.out.println("4");
		}
	}
	public void problem2884() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M  = sc.nextInt();
		sc.close();
		
		if(M >= 45) {
			if(H == 0) System.out.println( (H-1) +" "+ (M-45));
			else System.out.println(H +" "+(M-45));
		}else {
			if(H == 0) {
				H = 23;
				System.out.println(H+" "+(60-(45-M)));
			}else System.out.println((H-1)+" "+(60-(45-M)));
		}
	}

}
