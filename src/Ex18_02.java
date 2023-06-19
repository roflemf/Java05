/* 문제) 18장. 추상 클래스와 final.pdf No.21페이지 2번문제
 * 
 * final 클래스로 선언된 메서드는 자손에서 더 이상 오버라이딩을 허용하지 않는다.
 * 
 */

class A02{
	public final int m01() {
		return 0;
	}
}

class B02 extends A02{
	@Override
	public int m01() {
		return 10;
	}//오버라이딩 X 자손에서 정의된 메서드
}
public class Ex18_02 {
public static void main(String[] args) {
	B02 b = new B02();
	System.out.println(b.m01());
}
}
