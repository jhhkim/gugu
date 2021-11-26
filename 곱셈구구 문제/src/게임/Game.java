package ����;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;
import dto.QuestionDto;

public class Game {

	private int n;//����ڰ� �Է��� ���� ����
	
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	//���� ����
	public void questionN() {
		System.out.println("������ �����Դϴ�.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ǯ�� ���� ���� ������ �Է��Ͻʽÿ�: ");
		n = sc.nextInt();
	}
	//���� ����
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
	
	
	//���� ���
	public void qPrint(NumDto dto) {
		Random rd = new Random();
		nDto.setNum1(rd.nextInt(9)+1);
		nDto.setNum2(rd.nextInt(9)+1);
		nDto.setComResult(nDto.getNum1()*nDto.getNum2());//���似��
	}
	//���� ���� �Է�
	public int userResult() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	//�� ����
	public boolean check(int user, int com) {
		if(user==com) {
			return true;
		} return false;
	}
	
	//��� ���
	public void printResult() {
		NumDto nDto = new NumDto();
		qPrint(nDto);
		System.out.print(nDto.getNum1()+"*"+nDto.getNum2()+"=");
			int user = userResult();
		if(check(user, nDto.getComResult())) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}
	//��õ�
	public boolean reTry() {
		System.out.println("�ٽ� Ǯ�ڽ��ϱ�?\n1.Yes 2.No");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==1) {
			return true;
		}return false;
	}

	

}
