/*
 *  작성일 : 2024년 3월 15일
 *  작성자 : 컴퓨터교육과 202227008 성시아
 *  설명 : 변수와 자료형.
 */

public class VarDatatype {

	public static void main(String[] args) {
		
		// 상수 선언
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.14159;	
		// 오류 발생. 상수는 한번 값이 결정되면  변경될 수 없다.
		
		int r = 5; // 정수
		double pi = 3.14159; // 실수 변수
		String name = "김지연";  // 문자열
		char blood = 'A';  // 문자
		//Char blood1 = 'AB' // 오류 발생. 문자는 1byte
		
		// 원주율 출력
		System.out.println("원주율은 " + PI + "입니다.");
		System.out.println("원주율은 " + pi + "입니다.");
		
		// 원의 넓이 계산하여 출력
		double circle = 0;
		circle = r * r * pi;
		System.out.println("반지름의 길이가 " + r +"인 원의 넓이는 " + circle + "입니다.");
	 	
		// 원의 넓이를 계산한다.
		double area = r * r * pi;
		
		// 원의 넓이를 출력한다.
		System.out.println("반지름의 길이가 " + r +"인 원의 넓이는 " + area + "입니다.");
		
		area = r * r * PI;  // 이미 자료형을 double로 선언했기에 재선언할 필요가 없다.
	 	System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.\n", r, area);
	 	
	}
}
