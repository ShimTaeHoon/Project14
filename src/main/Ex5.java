package main;

public class Ex5 {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; //ArrayIndexOfBoundsException 에러 발생
		
		try {
			arr[5] = 5;
			
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e); 
		} catch (Exception e) { 
			// 부모타입 = 객체 생성
			
			// 발생되는 에러 모를때는 그냥 부모타입으로 퉁치기
			// Exception e = new ArrayIndexOutOfBoundsException
			
			// Exception은 최상위 부모
			// Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음
			
			System.out.println(e);
		}
		
		System.out.println("마지막 문장을 정상적으로 출력합니다..");

	}

}
