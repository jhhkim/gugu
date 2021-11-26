package ∞‘¿”;

import java.util.ArrayList;

import dto.QuestionDto;

public class Main {

	public static void main(String[] args) {
		// ∞ˆº¿±∏±∏ ∞‘¿”
		Game game = new Game();
		game.questionN();
		ArrayList<QuestionDto> gList = game.questionG();
		for (QuestionDto dto : gList) {
//			game.qPrint();
//			game.userResult();
//			game.printResult();
			System.out.println(dto.toString());
			game.printResult();
		}
		
	}

}
