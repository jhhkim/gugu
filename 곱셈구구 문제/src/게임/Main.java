package 게임;

public class Main {

	public static void main(String[] args) {
		// 곱셈구구 게임
		Game game = new Game();
			game.questionN();
			while(game.questionG()) {
			game.qPrint();
			game.userResult();
			game.printResult();
			}
			game.reTry();
		}
		
/*1.0*0이 출력됨
  2.입력한 문제개수만큼 문제 생성 안됨 문제가 계속 나옴 
 */
	}


