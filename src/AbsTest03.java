/* 추상클래스 특징)
 * 	1. 추상클래스를 상속받은 자손클래스를 반드시 부모 추상클래스의 추상메서드를 오버라이딩을 해야 자손클래스로 객체생성이 가능
 * 
 *  2. 추상클래스에 일반 메서드도 올 수 있다
 */
abstract class Abs03{
	abstract void m01(); // 추상 메서드 
	
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
	
	
}
class SubClass03 extends Abs03 {
	@Override
	void m01() {System.out.println();}	
}

public class AbsTest03 {
	public static void main(String[] args) {
		
		Abs03 abs; //추상클래스로 참조변수 선언 가능
		abs = new SubClass03(); // 업캐스팅도 가능
		abs.m01(); // 오버라이딩을 한 메서드 호출
		abs.m02(); // 부모 추상클래스에서 정의된 메서드 호출
		
	}

}
