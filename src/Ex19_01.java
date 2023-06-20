import naver.com.model01.IShapeClass;
import naver.com.model02.Circ2;
import naver.com.model02.Rect2;
import naver.com.model02.Tria2;

/* 문제) 19장. 인터페이스.pdf No16쪽의 1번문제
 */
public class Ex19_01 {
	public static void main(String[] args) {

		/* 문제) com.naver.model01 패키지에는 IShapeClass 부모 인터페이스가 정의되어있고, 추상 메서드 draw()가 정의 되어있다.
		 * 		이 인터페이스를 구현상속받은 자손클래스 Circ2, Rect2, Tria2를 com.naver.model02에 만들어보자.
		 * 출력문제) 타원을 그린다
		 * 		     사각형을 그린다
		 * 		     삼각형을 그린다
		 */

		IShapeClass ref;
		ref = new Circ2();
		ref.draw();

		ref= new Rect2();
		ref.draw();

		ref= new Tria2();
		ref.draw(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		System.out.println("======================");

		/* 문제) static void pr(IShapeClass ih){
		 * 		ih.draw();
		 * 		}
		 * 매개변수 다형성 문법을 적용해서 다음과 같이 출력되게 한다.
		 * 출력 예) 삼각형을 그린다. 
		 * 		    타원을 그린다.
		 * 		    사각형을 그린다.
		 * 
		 */
		pr(new Tria2()); pr(new Circ2()); pr(new Rect2());
		System.out.println("==========================>");
		
		IShapeClass[] isArr = new IShapeClass[3]; // 배열크기가 3인 객체 배열 isArr을 생성
		isArr[0] = new Circ2(); // 업캐스팅하면서 저장
		isArr[1] = new Rect2();
		isArr[2] = new Tria2();
		
		for(int i =0; i<isArr.length; i++) {
			isArr[i].draw();
		}
		
	}//main()
	
	static void pr(IShapeClass ih) { //매개변수 다형성 문법이 적용됌
		ih.draw(); //업캐스팅 이후 오버라이딩된 메서드 호출
	
	}
}
