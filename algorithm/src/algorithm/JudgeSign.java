package algorithm;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sdtIn=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.:");
		int n=sdtIn.nextInt();
		
		if(n>0) {
			System.out.println("����Դϴ�.");
		}else if(n<0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
	}

}
