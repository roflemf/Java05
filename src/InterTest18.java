/* 인터페이스 특징)
 *  1. jdk1.7까지의 인터페이스에는 추상메서드만 올 수가 있었다.
 *     하지만 jdk 1.8이후 부터는 추상메서드 외에 static 정적메서드나 디폴트 메서드가 추가적으로 올 수 있다.
 */
interface MyInter {
	/* default 메서드 특징)
	 *  1. 과거에는 부모 인터페이스에 추상메서드를 새롭게 추가하면 
	 *     이 인터페이스를 구현 상속받은 모든 자손클래스에서 
	 *     불필요한 추상메서드를 오버라이딩 해야하는 불편함이 존재.
	 *     이것 해결 위해 디폴트 메서드가 나옴.
	 *     
	 *  2. 그러므로 부모 인터페이스에 디폴트 메서드를 추가하면 
	 *     이 인터페이스를 구현 상속받은 모든 자손에서 
	 *     사용하지 않는 디폴트 메서드를 굳이 오버라이딩을 하지 않아도 된다.
	 *     
	 *  3. 디폴트 메서드 접근지정자도 public.(생략가능)
	 */
	default void method01() {
		System.out.println("method01() in MyInter");
	}

	default void method02() {
		System.out.println("method02() in MyInter");
	}

	static void staticMethod() { // 인터페이스에 오는 정적메서드도 접근지정자는 public. (생략가능)
		System.out.println("staticMethod() in MyInter");
	}
}//MyInter interface

interface MyInter02{
	default void method01() {
		// 인터페이스에서 디폴트 메서드가 중복된 경우 
		// 이 인터페이스를 구현상속받은 자손클래스에서 
		// 디폴트 메서드를 오버라이딩 해야함

		System.out.println("method02 in MyInter02");
	}
	static void staticMethod02() {
		System.out.println("staticMethod() MyIneter02");
	}
}//MyInter02 interface

class Parent{ // extends Object{
	/* 부모 클래스의 메서드와 부모 인터페이스의 디폴트 메서드가 같은 경우 
	 * 이를 상속받은 자손에서 부모의 메서드는 상속이 되고 
	 * 디폴트 메서드는 무시된다.
	 */
	public void method02() {
		System.out.println("method02 in Parent");
	}
}// Parent class

class Child extends Parent implements MyInter, MyInter02{

	@Override
	public void method01() {
		System.out.println("MyInter method01() 오버라이딩");
	}

}//Child class

public class InterTest18 {
	public static void main(String[] args) {
		Child child = new Child();
		child.method01(); // 오버라이딩한 메서드 호출
		child.method02(); // 부모클래스 메서드가 상속
		MyInter.staticMethod();
		MyInter02.staticMethod02();// 인터페이스명.정적메서드()

	}
}
