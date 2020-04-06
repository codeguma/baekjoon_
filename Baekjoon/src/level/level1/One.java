package level.level1;

import java.util.Scanner;

/*
 * level1 : 입출력과 사칙연산
 */
public class One {

	public static void main(String[] args) {
		One start = new One();
//		start.problem1();
//		start.problem2();
//		start.problem3();
//		start.problem4();
//		start.problem5();
		start.problem6();
		
		
	}
	
	public void problem1() {
		/*1.Hello World!를 출력하시오 */
	
		System.out.println("Hello World!");
	}
	public void problem2() {
		/*2.ACM-ICPC 인터넷 예선, Regional, 
		   그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 
		  왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.
		  대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.*/
		System.out.println("강한친구 대한육군\n강한친구 대한육군");
		// \r : 개행문자, 줄바꿈 문자.
		// \n : 개행문자.
		// \r , \n , \r\n을 적절히 맞게 사용하자.
	}
	public void problem3() {
		/*3.아래 예제와 같이 고양이를 출력하시오.
		 * \    /\
 			)  ( ')
			(  /  )
 			 \(__)|
		 */
		System.out.println("\\    /\\\r\n" + 
							" )  ( ')\r\n" + 
							"(  /  )\r\n" + 
							" \\(__)|");
	}
	public void problem4() {
		/*4.아래 예제와 같이 개를 출력하시오.
		 * |\_/|
			|q p|   /}
			( 0 )"""\
			|"^"`    |
			||_/=\\__|
		 */
		System.out.println("|\\_/|\r\n" + 
				"|q p|   /}\r\n" + 
				"( 0 )\"\"\"\\\r\n" + 
				"|\"^\"`    |\r\n" + 
				"||_/=\\\\__|");
	}
	public void problem5() {
		/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		int A = sc.nextInt();
		System.out.println("B를 입력하시오.");
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A+B);
	}
	public void problem6() {
		/*두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("A를 입력하시오.");
		int A = sc.nextInt();
		System.out.println("B를 입력하시오.");
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A-B);
	}
}
