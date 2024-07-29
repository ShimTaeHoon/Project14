package main;

public class Ex3 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		try {
			arr[5] = 5; // 예외가 발생할 가능성이 있는 코드
//			arr[1] = 5; // 오류가 발생하지 않아서 catch문을 건너뛰고 sys만나옴 
						
		// 에러가 발생됐을 때 에러 객체를 매개변수로 받음
		// 에러 클래스를 명확하게 작성해주기
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 예외가 발생하면 처리할 코드 작성
		}
		
		// 에러가 나도 마지막 문장이 실행됨
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		// 에러가나도 프로그램이 정상적으로 종료되도록 처리 해주는 것
		
	}

}
