/* 1. 클래스나 추상클래스는 하나의 부모로 부터 단일 상속만 가능
 * 2. 인터페이스는 하나 이상의 부모로 다중 상속이 가능
 * 
 */
interface IHello12{// 최초 작성된 인터페이스의 조상은 없다.
	void sayHello(String name); // public abstract이 생략
}
interface IGoodBye12{
	public abstract void sayGoodBye(String name); // public abstract는 생략 가능
}
class SubClass12 implements IHello12, IGoodBye12{ // 인터페이스는 하나 이상의 조상으로부터 다중상속을 받을 수 있음

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name + " 씨 잘가");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 씨 안녕");
	} 
	
}
public class InterTest12 {
public static void main(String[] args) {
	SubClass12 sub = new SubClass12();
	sub.sayHello("홍길동");
	sub.sayGoodBye("이순신");
}
}
