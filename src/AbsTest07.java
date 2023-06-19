/* final 키워드 특징
 *  1. 변수를 final로 선언하면 수정할 수 없는 변수, 즉, 상수가 된다.
 *  2. 상수명은 관례적으로 영문대문자로 해야하고, 선언과 동시에 초기화를 해야함. (=선언과 동시에 최초값(0 또는 null) 저장)
 *  3. 
 */
class Final07{
	final int ABC = 100;
	
	public void setAbc(int a) {
//		ABC = a;  상수명 ABC는 수정 불가 (final이기 때문)
	}
}
public class AbsTest07 {
	public static void main(String[] args) {
	
		
	}
}
