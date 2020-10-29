package algorithm;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sdtIn=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.:");
		int n=sdtIn.nextInt();
		
		if(n>0) {
			System.out.println("양수입니다.");
		}else if(n<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("이 수는 0입니다.");
		}
	}

}
