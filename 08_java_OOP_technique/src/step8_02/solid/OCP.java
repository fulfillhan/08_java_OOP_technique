package step8_02.solid;

	
/*
   
   # AsIs Model
  
	OCP_BadCase 클래스는 powerpoint와 pdf 보고서를 생성할 수 있다. 
	하지만 새로운 보고서 형식(예: powerpoint , pdf)을 추가하려면 makingReport 메소드를 수정해야 한다.
	이는 OCP를 위반한다.
	
*/
	
class OCP_BadCase{
	void makingReport(String reportType) {
		if(reportType.equals("excel")) {
			System.out.println("엑셀문서 작성");
		}
		// 추가되면 각각 작성필요
//		else if (reportType.equals("powerpoint")) {
//			System.out.println("파워포인트문서 작성");
//		}
		else if(reportType.equals("hwp")) {
			System.out.println("한글문서 작성");
		}
//		else if (reportType.equals("pdf")) {
//			System.out.println("pdf문서 작성");
//		}
		else if(reportType.equals("docx")) {
			System.out.println("워드문서 작성");
		}
	}
}


/*
	   
   # ToBe Model
  
	새로운 보고서 형식을 추가하고 싶을 때 MakeReport 인터페이스를 구현하는 새 클래스를 만들기만 하면 된다. 
	기존 코드(MakeReport 인터페이스와 기존의 구현 클래스)를 수정할 필요가 없으므로 OCP 원칙을 준수하게 된다.
	
 */

interface MakeReport{
	void makingReport();
	
}

class ExcelMakeReport implements MakeReport{
	
	@Override
	public void makingReport() {
		System.out.println("엑셀문서 작성");
	}
}

class powerpoint implements MakeReport {

	@Override
	public void makingReport() {
		System.out.println("파워포인트 작성");
	}
	
}

class HwpMakeReport implements MakeReport {

	@Override
	public void makingReport() {
		System.out.println("한글문서 작성");
	}
	
}

class powerPoint implements MakeReport {

	@Override
	public void makingReport() {
		System.out.println("파워포인트 작성");
	}
	
}

class DocxMakeReport implements MakeReport {

	@Override
	public void makingReport() {
		System.out.println("워드문서 작성");
	}
	
}

public class OCP {

	public static void main(String[] args) {
		
		/*
	
			- OCP(Open/Closed Principle, 개방-폐쇄 원칙)는 소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에는 열려 있어야 하고, 수정에는 닫혀 있어야 한다는 원칙이다.
			 
			- 이 원칙을 따르면 기존의 코드를 변경하지 않고도 시스템의 기능을 확장할 수 있다.
			 
			- 즉 새로운 기능을 추가하고 싶을 때 기존 코드를 수정하는 대신 기존 코드를 확장만으로 원하는 기능을 추가할 수 있어야 한다.
		
		 */
		
		//기존 코드
		OCP_BadCase object = new OCP_BadCase();
		object.makingReport("excel");
		object.makingReport("powerpoint");
		object.makingReport("hwp");
		object.makingReport("pdf");
		object.makingReport("docx");
		
		
		System.out.println("\n==========================\n");
		
		ExcelMakeReport excel = new ExcelMakeReport();
		excel.makingReport();
		
		powerPoint powerpoint = new powerPoint();
		powerpoint.makingReport();
		
		HwpMakeReport hwp = new HwpMakeReport();
		hwp.makingReport();
		
		DocxMakeReport docx = new DocxMakeReport();
		docx.makingReport();
	
	}


}
