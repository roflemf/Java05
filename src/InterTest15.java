/* 인터페이스 특징)
 *  1. 인터페이스에 오는 모든 변수는 public static final로 인식하는 정적상수만이 올 수 있다
 *  
 *  상수의 특징)
 *   1. 일반변수를 final로 선언하면 상수가 된다.
 *   2. 상수명은 관례적으로 영문대문자로 하고, 선언과 동시에 초기화(최초값 저장)를 반드시 해야함.
 */
interface IColor{
	int RED=1; // public static final이 생략된 정적상수 ; 인터페이스의 모든 변수는 정적상수니까 -> 초기화 해야함
	public static final int GREEN = 2; // public static final 생략가능
	public static final int BLUE =  3; // 정적상수;
	
	void setColor(int c); // public abstract 가 생략된 추상메서드(중괄호 X, 실행문장 X)
	public abstract int getColor();
}

abstract class AbsColor implements IColor{
	int color = GREEN; // 추상클래스에는 color라는 일반변수가 올 수 있다. 

	//추상클래스는 부모메서드 오버라이딩 전부 해도되고, 안해도 됌
	@Override
	public void setColor(int c) {
		color = c;
	}
}

class SubClass15 extends AbsColor{ // 일반클래스는 오버라이딩 해야 자손클래스 객체 생성가능

	@Override
	public int getColor() {
		return color;
	}
	
}
public class InterTest15 {
public static void main(String[] args) {
SubClass15 sub = new SubClass15();
sub.setColor(IColor.BLUE); // 상속받아서 호출
System.out.println(sub.getColor()); //3

	
	
}
}
