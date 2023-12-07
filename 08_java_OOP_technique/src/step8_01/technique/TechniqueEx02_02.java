package step8_01.technique;

import accessModifierTest.AccessModifierTest;

//public class PublicC{}// (가능) : 가능은 하나,  하나의 클래스파일에는 하나의 public클래스만 존재할 수 있다.
class DefaultC{}
//protected class ProtecdedC{}  // 불가능 : class앞에는 public,default 접근제어자만 사용가능하다.
//private class PrivateC{} // 불가능 :  class앞에는 public,default 접근제어자만 사용가능하다.

class Test1 extends AccessModifierTest{
	
	void printDtata() {
		System.out.println(publicV);
	   //System.out.println(defaultV);   // 다른 패키지이므로 접근 불가능
		System.out.println(protectedV);
		//System.out.println(privateV); //  private : 같은 클래스만 가능하니깐 오류
		
		
		publicM();    	// 같은 프로젝트이므로 접근 가능
     	//defaultM();   	// 다른 패키지이므로 접근 불가능
		protectedM(); 	// 상속 관계이므로 접근 가능
		//privateM(); 	// (불가) 다른클래스 이므로 접근 불가능
		
	}
	               
	
}

public class TechniqueEx02_02 {
	
	public static void main(String[] args) {
		
	}

}
