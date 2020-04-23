package level.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Three start = new Three();
//		start.problem2739();
//		start.problem10950();
//		start.problem8393();
//		start.problem15552();
//		start.problem2741();
//		start.problem2742();
		start.problem11021();
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
	public void problem8393() {
		/*
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ;
		sc.close();
		
		for(int i=0; i <= n; ++i) {
			sum += i ;
		}
		System.out.println(sum);
	}
	public void problem15552() throws NumberFormatException, IOException {
		/*
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 int T = Integer.parseInt(br.readLine().trim());
		
		 for (int i=0; i < T; i++) {
	            String text = br.readLine();
	            String[] word = text.split(" ");
	            int A = Integer.parseInt(word[0]);
	            int B = Integer.parseInt(word[1]);
	            bw.write((A+B) + "\n");
	        }
	        
	        bw.flush();
	        bw.close();
	        //속도 면에서 더 낫다.
	}
	public void problem2741() {
		/*
		 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1 ; i <= N ; i++) {
			System.out.println(i);
		}
	}
	public void problem2742() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 0 ; i < N ; i++) {
			System.out.println(N-i);
		}
	}
	public void problem11021() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #"+i+":"+(A+B));
		}
	}
}
