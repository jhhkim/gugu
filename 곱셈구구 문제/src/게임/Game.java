package ����;

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
	//���� ����
	public void questionN() {
		System.out.println("������ �����Դϴ�.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ǯ�� ���� ���� ������ �Է��Ͻʽÿ�: ");
		nDto.setQuestionN(sc.nextInt());
	}
	
	//�Է��� ���� ������ŭ ���� ����
	public boolean questionG() {
		for(i=0; i < nDto.getQuestionN(); i++) {
			return true;
		} return false;
	}

	public void question(NumDto nDto) {
		Random rd = new Random();
		nDto.setNum1(rd.nextInt(9)+1);
		nDto.setNum2(rd.nextInt(9)+1);//1~9���� ���� ����
	}
	//���� ���
	public void qPrint() {
		System.out.print(nDto.getNum1()+"*"+nDto.getNum2()+"=");
	}
	//���� ���� �Է�
	public void userResult() {
		Scanner sc = new Scanner(System.in);
		nDto.setUserResult(sc.nextInt());
	}
	//��ǻ�� ����
	public void comResult() {
		nDto.setComResult(nDto.getNum1()*nDto.getNum2());
	}
	//��� ���
	public void printResult() {
		if(nDto.getUserResult()==nDto.getComResult()) {
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
