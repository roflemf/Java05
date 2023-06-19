/* 추상클래스 특징)
 *  1. 부모 추상클래스를 상속 받은 자손에서 부모의 추상메서드를 오버라이딩을 하지 않으면
 *     자손도 일반클래스가 아닌 추상클래스 이어야 함.
 * 
 * 
 */


abstract class Abs04{  // extends Object => 추상클래스도 명시적인 상속을 안하면 묵시적으로 Object로 부터 상속 받음.
	abstract void m01(); // 추상메서드
	
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
}
abstract class MiddleClass extends Abs04{ 
	void m03() {
		System.out.println("일반 메서드 m03()");
	}
}

class SubClass04 extends MiddleClass{

	@Override
	void m01() {
		System.out.println("부모의 추상메서드를 오버라이딩을 한 m01() 메서드");
	}
	
}
public class AbsTest04 {
public static void main(String[] args) {
	SubClass04 sub = new SubClass04();
	sub.m01(); // 부모의 추상메서드를 오버라이딩한 메서드 호출
	sub.m02(); // 상속받아서 호출
	sub.m03(); // 상속받아서 호출
}
}
