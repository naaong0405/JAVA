/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터교육과 202227008 성시아
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오.
 * 
 * [문제분석]
 *  약수는 어떠한 수를 나누어 떨어지게 하는 수이다.
 *  자연수는 자기자신의 절반보다(자기자신에게 루트를 씌운 값보다) 큰 수로는 나누어 질 수 없다.
 *  반복의 범위 : 1 ~ 자기자신의 절반
 *  나누어떨어지는 경우 그 수를 출력한다.
 *  1은 수로 나누어 나머지가 0인가?
 *  2는 수로 나누어 나머지가 0인가?
 *  3은 수로 나누어 나머지가 0인가?
 *   :
 *  23은 수로 나누어 나머지가 0인가?
 *  
 * [알고리즘]
 *  1. 정수를 입력 받는다.
 *  2. 1부터 입력받은 수까지 1씩 증가하면서 반복한다.
 *    2.1 입력받은 수를(1~입력 수)로 나누어 나머지가 0이면
 *       2-2-1. 그 수를 출력한다. 
 *  
 */



import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성.
		
		// 1. 정수를 입력 받는다.
		System.out.print("약수를 구할 정수를 입력하세요 : ");
		int su = stdIn.nextInt();
		
		System.out.print(su + "의 약수는");
		
		for(int i=1; i<=su; i++) {
			if (su % i == 0) {
				System.out.print(" "+i);
			}
		}
	}
}