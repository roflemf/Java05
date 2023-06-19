/* 1. 클래스나 추상클래스는 하나의 조상으로부터 단일 상속만 가능
 * 2. 클래스나 추상클래스는 하나 이상의 조상으로부터 다중 상속은 안된다.
 * 
 */

abstract class Hello11{ //extends Object이다.
	public abstract void sayHello(String name); // 추상클래스에서 추상 메서드의 abstract는 생략 못함
}

abstract class GoodBye11{
	public abstract void SayGoodBye(String name);
}

class SubClass11 extends GoodBye11, Hello11{
	// 클래스는 하나 이상의 부모로부터 다중상속은 불가능 하다.  -> 다중상속 하려면 인터페이스!
}
public class InterTest11 {
public static void main(String[] args) {
	
}
}
