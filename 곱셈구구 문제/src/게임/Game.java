package 게임;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;
import dto.QuestionDto;

public class Game {

	private int n;//사용자가 입력할 문제 개수
	
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	//문제 개수
	public void questionN() {
		System.out.println("구구단 게임입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("풀고 싶은 문제 개수를 입력하십시오: ");
		n = sc.nextInt();
	}
	//문제 생성
	public ArrayList<QuestionDto> questionG(){
		Random rnd = new Random();
		ArrayList<QuestionDto> gList = new ArrayList<QuestionDto>();
		for(int i=0; i<n; i++) {
			QuestionDto dto = new QuestionDto();
			dto.setNum1(rnd.nextInt(9)+1);
			dto.setNum2(rnd.nextInt(9)+1);
			dto.setResult(dto.getNum1()*dto.getNum2());
			gList.add(dto);
		} return gList;
		
	}
	
	
	//문제 출력
	public void qPrint(NumDto dto) {
		Random rd = new Random();
		nDto.setNum1(rd.nextInt(9)+1);
		nDto.setNum2(rd.nextInt(9)+1);
		nDto.setComResult(nDto.getNum1()*nDto.getNum2());//정답세팅
	}
	//유저 정답 입력
	public int userResult() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	//답 검증
	public boolean check(int user, int com) {
		if(user==com) {
			return true;
		} return false;
	}
	
	//결과 출력
	public void printResult() {
		NumDto nDto = new NumDto();
		qPrint(nDto);
		System.out.print(nDto.getNum1()+"*"+nDto.getNum2()+"=");
			int user = userResult();
		if(check(user, nDto.getComResult())) {
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
