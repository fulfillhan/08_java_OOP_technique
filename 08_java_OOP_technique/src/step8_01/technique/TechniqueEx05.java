package step8_01.technique;

/*
 * # 싱글턴 디자인 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonTest{
	
	// 1) private 기본 생성자를 만든다.
	private SingleTonTest(){
		
	}
	
	// 2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static SingleTonTest instance = new SingleTonTest();
	
	// 3) instance를 반환할 getter를 만들어준다.
	public static SingleTonTest getInstance() {
		return instance;
	}
	
	//테스트 변수
	String testVariable = "테스트 변수";
	//테스트 메서드
	void testMethod() {
		System.out.println("테스트 메서드");
	}

}
class NomalTest{
	
}

public class TechniqueEx05 {

	public static void main(String[] args) {
		
		//private 접근제어자 생성자 사용으로 new 형태로 객체를 생성할 수 없다.
		//new SingleTonTest();
		
		System.out.println(SingleTonTest.getInstance());//같은 객체
		System.out.println(SingleTonTest.getInstance());
		System.out.println(SingleTonTest.getInstance());
		System.out.println();
		
		//싱글턴 클래승명.getInstacne().변수명
		System.out.println(SingleTonTest.getInstance().testVariable);
		
		//싱글턴 클래스명.getInstance().메서드명
		SingleTonTest.getInstance().testMethod();
		
		System.out.println(new NomalTest());//다른객체
		System.out.println(new NomalTest());
		System.out.println(new NomalTest());
	}

}
