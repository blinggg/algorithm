package algorithm;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		
		int n;
		do {
			System.out.println("�������� �Է��ϼ���.:");
			n=stdIn.nextInt();
		}while(n<=0);
		
		int x=0;
		while(n>0) {
			n/=10;
			x++;
		}
		
		System.out.println("�� ���� "+x+"�ڸ��Դϴ�.");
		
	}

}
