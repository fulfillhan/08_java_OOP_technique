package step8_01.technique;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 멤버변수 초기화-> 생성자를 언제쓰는지


class GoodsDTO{
	
	String goodsCd;
	String goodsNm;
	int goodsPrice;
	
	void setData(String goodsCd,String goodsNm,int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	
	//생성자
	 GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
		
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}



	void printData () {
		System.out.println(this.goodsCd + "/"+ this.goodsNm+ "/"+this.goodsPrice);
	}
	
	
}



public class TechniqueEx04_02 {

	public static void main(String[] args) {
		
		//(before)
		//GoodsDTO goodsDTO = new GoodsDTO();
		//goodsDTO.goodsCd = "0x001";
		//goodsDTO.goodsNm = "기계식키보드";
		//goodsDTO.goodsPrice = 45000;
		//goodsDTO.setData( "0x001", "기계식키보드", 45000);
		//goodsDTO.printData();
		
		//(After) : 생성자를 사용한 객체변수 초기화
		GoodsDTO goods1 = new GoodsDTO("0x001",  "기계식키보드",  45000);
		GoodsDTO goods2 = new GoodsDTO("0x002",  "무소음마우스",  27000);
		GoodsDTO goods3 = new GoodsDTO("0x003", "장패드", 7000);
		
		goods1.printData();
		goods2.printData();
		goods3.printData();
		
		//사용 예시
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#,##0");

		
	}

}
