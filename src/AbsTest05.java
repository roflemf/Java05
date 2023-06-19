import com.naver.model02.Circ;

import naver.com.model01.ShapeClass;
import naver.com.model02.Rect;
import naver.com.model02.Tri;

public class AbsTest05 {
	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw(); r.draw(); t.draw();
		System.out.println("=============================");
		
		ShapeClass ref; // 부모 추상클래스로 참조변수 선언
		ref = new Circ(); // 업캐스팅
		ref.draw(); // 업캐스팅 이후 오버라이딩 한 메소드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tri();
		ref.draw();
		
	}
}

/* 추상클래스의 다형성
 * => 컵, 우유, 물, 껍데기!!
 *  
 */

