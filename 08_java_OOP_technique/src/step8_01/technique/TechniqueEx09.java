package step8_01.technique;

/*
 *  # 추상화 
 * 
 *  - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
 *  - abstract 키워드를 클래스 앞에 붙여주어 추상클래스를 생성한다.
 *  - abstract 키워드를 메서드 앞에 붙여주어 추상메서드를 생성한다.
 *  - 추상메서드 뒤에 '{}' 아닌 ';'을 붙인다.  
 *  - 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다.
 *  - 다중 상속이 불가능하다.
 *  - 추상 클래스는 객체를 생성 할 수 없다.
 *    
 * */

/*추상화를 하는 이유 :  
-코드가길어지면 보기 힘들어짐. 목차화한다.(틀제공)
-부품결합개발 가능
-중앙통제가능 */

//일반 클래스
class NormalClass{
	void testMethod() {
		
	}
}
//일반 클래스를 상속받은 일반 클래스
class TestClass1 extends NormalClass{
	
}
//추상 클래스
abstract class AbstractClass {//형태 : abstract 키워드를 클래스 앞에 붙여준다.
	// abstract 키워드를 메서드 앞에 붙여주고 ;으로 종료한다.
	
	// 일반변수도 사용 가능
	int testVar1;
	double testVar2;
	String testVar3;
	
	abstract void menu1();
	abstract void menu2();
	abstract void menu3();
	abstract void menu4();
	abstract void menu5();
	abstract void menu6();
	abstract void menu7();
	abstract void menu8();
	abstract void menu9();
	abstract void menu10();
	
	// 추상클래스에서는 일반 메서드도 같이 사용가능하다. 강제성은 없다. 오버라이딩 해도되고, 안써도되고..등등
	void test97() { System.out.println("테스트");}
	void test98() { System.out.println("테스트");}
	void test99() { System.out.println("테스트");}
	void test100() { System.out.println("테스트");}
}

//추상클래스를 상속받은 일반클래스
class TestClass2 extends AbstractClass {

	@Override
	void menu1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu7() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void menu8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu10() {
		// TODO Auto-generated method stub
		
	}
	
}


// 추상 클래스를 상속받은 일반클래스
class TestClass extends AbstractClass{

	@Override
	void menu1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu7() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void menu8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void menu10() {
		// TODO Auto-generated method stub
		
	}
	
}

public class TechniqueEx09 {

	public static void main(String[] args) {
		
		new NormalClass();
		new TestClass1();
		
	//	new AbstractClass(); : 추상 클래스는 객체를 생성할 수 없다.
		
	}
	
}
