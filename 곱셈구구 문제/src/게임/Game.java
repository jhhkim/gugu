package 게임;

import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

public class Game {

//	private int questionN;
//	private int num1;
//	private int num2;
//	private int userResult;
//	private int comResult;
//	private String op;
	private int i=0;
	
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	//문제 개수
	public void questionN() {
		System.out.println("구구단 게임입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("풀고 싶은 문제 개수를 입력하십시오: ");
		nDto.setQuestionN(sc.nextInt());
	}
	
	//입력한 문제 개수만큼 문제 생성
	public boolean questionG() {
		for(i=0; i < nDto.getQuestionN(); i++) {
			return true;
		} return false;
	}

	public void question(NumDto nDto) {
		Random rd = new Random();
		nDto.setNum1(rd.nextInt(9)+1);
		nDto.setNum2(rd.nextInt(9)+1);//1~9까지 정수 생성
	}
	//문제 출력
	public void qPrint() {
		System.out.print(nDto.getNum1()+"*"+nDto.getNum2()+"=");
	}
	//유저 정답 입력
	public void userResult() {
		Scanner sc = new Scanner(System.in);
		nDto.setUserResult(sc.nextInt());
	}
	//컴퓨터 정답
	public void comResult() {
		nDto.setComResult(nDto.getNum1()*nDto.getNum2());
	}
	//결과 출력
	public void printResult() {
		if(nDto.getUserResult()==nDto.getComResult()) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}
	//재시도
	public boolean reTry() {
		System.out.println("다시 풀겠습니까?\n1.Yes 2.No");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==1) {
			return true;
		}return false;
	}

	

}
