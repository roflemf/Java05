//부모 클래스와 인터페이스 혼합을 자손에서 상속받는 예제
interface IHello13{
	void sayHello(String name); // public abstract가 생략됌.
}

abstract class GoodBye13{
	public abstract void sayGoodBye(String name); // 추상클래스의 추상메서드에서 abstract 생략 못함.
}

class SubClass13 extends GoodBye13 implements IHello13{ // class 자손클래스 extends 부모클래스 implements 부모 인터페이스
														// => 상속받을때 순서; 클래스 먼저 상속 후 interface 상속

	@Override
	public void sayHello(String name) {
	}

	@Override
	public void sayGoodBye(String name) {
	}
	
}
public class InterTest13 {
public static void main(String[] args) {
	SubClass13 sub = new SubClass13();
	sub.sayHello("강감찬");
	sub.sayGoodBye("을지문덕");
}
}

/* 인터페이스 에서는 일반 메소드, static 메소드 다 사용 가능하나,
 * 거의 추상메소드를 사용할일이 많을것.
 * 
 */


