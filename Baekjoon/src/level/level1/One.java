package level.level1;

import java.util.Scanner;

/*
 * level1 : 입출력과 사칙연산
 */
public class One {

	public static void main(String[] args) {
		One start = new One();
//		start.problem2557();
//		start.problem10718();
//		start.problem10171();
//		start.problem10172();
//		start.problem1000();
//		start.problem1001();
//		start.problem10998();
//		start.problem1008();
//		start.problem10869();
//		start.problem10430();
		start.problem2588();
		
		
	}
	
	public void problem2557() {
		/*1.Hello World!를 출력하시오 */
	
		System.out.println("Hello World!");
	}
	public void problem10718() {
		/*2.ACM-ICPC 인터넷 예선, Regional, 
		   그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 
		  왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.
		  대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.*/
		System.out.println("강한친구 대한육군\n강한친구 대한육군");
		// \r : 개행문자, 줄바꿈 문자.
		// \n : 개행문자.
		// \r , \n , \r\n을 적절히 맞게 사용하자.
	}
	public void problem10171() {
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
	public void problem10172() {
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
	public void problem1000() {
		/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A+B);
	}
	public void problem1001() {
		/*두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A-B);
	}
	public void problem10998() {
		/*두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		//sc.close();
		
		System.out.println(A*B);
	}
	public void problem1008() {
		/*두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		//sc.close();
		
		System.out.println(A/B);
	}
	public void problem10869() {
		/*
		 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
	public void problem10430() {
		/*
		 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		       세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		       
		    첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
		    
		  첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.     
		 */
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
	public void problem2588() {
		/*
		 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		   (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 */
		/*int A = 472;
		int B = 385;
		String C = String.valueOf(B);
		int D[] = new int[3];
		double sum = 0;
		double temp = 0;
		
		String num[] = {C.substring(2,3), C.substring(1,2) , C.substring(0,1)};
		
		for(int i = 0 ; i < 3 ; i++ ) {
			D[i] = Integer.parseInt(num[i]);
			temp = A*D[i]*Math.pow(10, i);
			sum = sum + temp;
			System.out.println(A*D[i]);
			if(i==2) {
			System.out.println((int)Math.round(sum));
			};
		};*/
		
/*		* 자연수의 각 자리수 뽑아내기

		temp : 1의 자리수부터 자연수의 자리수를 가져옴

		while(num > 0) {
		    int temp = num % 10;
		    num /= 10;
		}*/
		
		  Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        System.out.println(a * (b%10));
	        System.out.println(a* ((b/10)%10));
	        System.out.println(a* (b/100));
	        System.out.println(a*b);    
	}
}
