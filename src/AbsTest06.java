import com.naver.model02.Circ;

import naver.com.model01.ShapeClass;
import naver.com.model02.Rect;
import naver.com.model02.Tri;

public class AbsTest06 {
	static void income(ShapeClass ref) { // 매개변수 다형성 = 상속+ 업캐스팅
										 // 결국 모든 자손타입을 다 받을 수 있음
										 // 그만큼 코드라인을 줄이고, 불필요한 메서드 오버로딩 생략 가능
		ref.draw();
	}
	static void income2(Circ c) {
		c.draw();
	}
	private static void income2(Rect r) { // 매개변수 다형성을 사용하지 않아서 자손클래스 개수만큼 전달인자 타입이 다른 메서드 오버로딩을 해야
		r.draw();
	}
	
	private static void income2(Tri t) { // 불필요한 메서드가 계속 반복됌
		t.draw();
	}
	
	
	public static void main(String[] args) {
	 
		ShapeClass[] arr = new ShapeClass[3]; // 배열의 크기가 3 인 객체배열 arr 생성
		arr[0] = new Circ(); // 업캐스팅
		arr[1] = new Rect(); 
		arr[2] = new Tri();
		
		for(int i =0; i<arr.length ; i++) {
			arr[i].draw();
		}
		System.out.println("\n=============================>");
		Circ c = new Circ(); Rect r = new Rect(); Tri t = new Tri();
		income(c); income(r); income(t);
		System.out.println("\n================================>");
		income2(new Circ()); income2(new Rect()); income2(new Tri());
	}
	
	

}
