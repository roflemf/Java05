/* final 특징)
 *  1. 메서드를 final 로 정의하면 더 이상 자손에서 오버라이딩을 허용하지 않는다.
 * 
 */

class FinalClass08{
	public final void pr() {} // 메서드가 final이어서 자손에서 오버라이딩이 불가
}
class SubClass08 extends FinalClass08{
//	@Override
//	public void pr() {
//		
//	}
}
public class AbsTest08 {
public static void main(String[] args) {
	
}
}
