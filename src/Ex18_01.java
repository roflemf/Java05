/* 문제) 18장. 추상클래스와 final.pdf No.19 페이지 1번문제
 * 		          -> 추상메서드 오버라이딩 문제
 *
 * 추상클래스 특징)
 *  1. 추상클래스에는 일반 변수, 일반 메서드도 올 수 있다.
 *  
 *  
 * 1. 다음 예제에서 에러가 발생하지 않도록 박스를 채우시오. 
		abstract class Abs1{ 
		int a=10; 
		String str="Test"; 
		public abstract int getA( ); 
		public String getStr( ){ 
		return str; 
		} 
		} 
		abstract class Abs2 extends Abs1{ 
		int b=100; 
		public abstract int getB( ); 
		}
		class AbsMain extends Abs2{ 
		
		
		
		}
		public class Ex18_01{ 
		public static void main(String[] args) { 
		AbsMain am=new AbsMain( ); 
		System.out.println(am.getA( )); 
		System.out.println(am.getB( )); 
		}
		}
 *
 */

abstract class Abs1{ 
		int a=10; 
		String str="Test"; 
		public abstract int getA( ); // 추상메서드 => {} 가 없고, 실행문장이 없어서 호출 불가능
		public String getStr( ){ 
		return str; 
		} 
		} 
		abstract class Abs2 extends Abs1{ 
		int b=100; 
		public abstract int getB( ); 
		}
		class AbsMain extends Abs2{
			
			

			@Override
			public int getA() {
				return a;
			}

			@Override
			public int getB() {
				return b;
			} 
		}
public class Ex18_01 {
public static void main(String[] args) {
	
			
		
		AbsMain am=new AbsMain( ); 
		System.out.println(am.getA( )); 
		System.out.println(am.getB( )); 
		
}
}
