/* 인터페이스 특징)
 *  1. 인터페이스는 interface 예약어로 정의한다.
 *  2. 인터페이스는  public abstract으로 인식되는 추상메서드가 올 수 있다.
 *  3. 부모 인터페이스는 자손클래스에서 implements 키워드로 구현 상속을 받는다.
 *  4. 부모 인터페이스에 오는 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야 자손 클래스 객체 생성이 가능하다.
 */
interface IHello10{// 최초 작성한 인터페이스의 조상은 없다.
	public abstract void sayHello(String name); // public abstract는 생략 가능. 추상메서드는 {}가 없고, 실행문장 X, 호출 불가능 -> 추상메서드와 같음
	
}

class Hello10 implements IHello10{

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 씨 안녕하세요.");
	}
	
}
public class interTest10 {
public static void main(String[] args) {
	IHello10 ihello = new Hello10(); // 업캐스팅
	ihello.sayHello("홍길동");
	
	Hello10 hello = new Hello10();// 업캐스팅 X, 자손클래스 객체 생성
	hello.sayHello("이순신");
}
}
