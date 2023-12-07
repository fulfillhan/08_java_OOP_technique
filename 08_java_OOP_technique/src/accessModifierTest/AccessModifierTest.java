package accessModifierTest;

class Test1 extends AccessModifierTest{
	
	void printDtata() {
		System.out.println(publicV);
		System.out.println(defaultV);
		System.out.println(protectedV);
		//System.out.println(privateV); //  private : 같은 클래스만 가능하니깐 오류
		
		
		publicM();    	// 같은 프로젝트이므로 접근 가능
		defaultM();   	// 같은 패키지이므로 접근 가능
		protectedM(); 	// 상속 관계이므로 접근 가능
		//privateM(); 	// (불가) 다른클래스 이므로 접근 불가능
		
	}
	               
	
}


public class AccessModifierTest {
	
	
	public int publicV;         //프로젝트 접근
	int defaultV;               //패키지 안에서
	protected int protectedV;   //상속관계
	private int privateV;       //같은 클래스 내부에서만
	
	public void publicM() {}			// 프로젝트 접근
	void defaultM() {}					// 같은 패키지 접근
	protected void protectedM() {}		// 상속 관계 접근
	private void privateM() {}			// 클래스 내부에서 접근
	

}
