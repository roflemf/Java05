abstract class AbsTest111{
	abstract void pr();
}

abstract class AbsTest1111 extends AbsTest111{
	abstract void pr2();
}

public class AbsTest04_1 extends AbsTest1111{
	public static void main(String[] args) {
		
	}

	@Override
	void pr2() {
	}

	@Override
	void pr() {
	}
}

/* 자손 클래스에서 오버라이딩 하기 싫어!
 * -> 자손클래스도 추상클래스로 만들고 
 * 	  메인에서 부모클래스 메소드, 자손클래스 메소드 둘다 오버라이딩 해주면 된다. 
 *   (but, 필수로 두 메소드 다 오버라이딩 해줘야 함)
 * 
 */

