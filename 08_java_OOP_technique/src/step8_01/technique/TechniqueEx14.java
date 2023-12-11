package step8_01.technique;

/*
 * 
 *  # 쓰레드(Thread) - 
 *  
 *  - 운영체제에 의해서 관리되는 하나의 '작업' 혹은 '태스크'를 의미한다. 
 *     Ex) 음성인식 작업 , 모션인식 작업 , 웹브라우저 ,  main()함수
 *    
 *  - main() 의외의 다른 쓰레드를 만들려면 Thread클래스를 상속받거나 Runnable 인터페이스를 구현한다.
 * 
 *  - 자바에서는 다중 상속을 허용하지 않기 때문에 Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없다.
 * 
 *  - Runnable 인터페이스를 구현했을 경우에는 다른 인터페이스를 구현할 수 있으며 다른 클래스도 상속받을 수 있다.
 * 
 * */

//쓰레드 구현방법 1) Thread클래스를 상속받아서 구현한다.
class Music extends Thread{
	/*
	//before
	 * void playMusic() { for (int i = 0; i <10; i++) {
	 * System.out.println("음악 파일이 실행되는 중"); } }
	 */
	//thread 클래스로부터 제공되는 run() 메서드이며
	//병렬적으로 수행할 명령어를 작성한다.
	@Override
	public void run() {
		//반복적으로 사용할 함수
		for (int i = 0; i <10; i++) {
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		  System.out.println("음악 파일이 실행되는 중"); 
		}
	}
}

//쓰레드 구현방법 2) Runnable인터페이스를 구현하여 사용한다.

class Game implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		  System.out.println("게임이 실행되는 중"); 
		}
	
}



public static class TechniqueEx14 {

	public static void main(String[] args) {

		
		// Thread클래스를 상속받을 경우 객체에서 start()메서드를 이용하여 쓰레드를 시작한다. 
		// 클래스안에 오버라이딩된 run()메서드를 호출한다.
		Music music = new Music();
		music.start();
		//music.playMusic();
		
		// Runnable Interface를 구현할 경우 Thread객체에서 생성자의 인수로
		// Runnable Interface를 구현한 객체를 주입하여 새로운 객체를 만들고
		// 새로운 객체를 통해 .start()메서드를 이용하여 쓰레드를 시작한다. > run()메서드 호출
		
		Game temp = new Game();
	   Thread game=	new Thread(temp);// thread의 틀만 구현했기때문에 temp를 넣어줘야함
	    game.start();
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 자바가 cpu 를 통제하려고하니-> try catch 문 사용해야함
			} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("pc카톡 사용중");
		}
			
		
		}
	}
}



