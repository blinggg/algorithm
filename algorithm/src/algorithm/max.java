package algorithm;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���.");
		System.out.println("a�� ��:"); int a=stdIn.nextInt();
		System.out.println("b�� ��:"); int b=stdIn.nextInt();
		System.out.println("c�� ��:"); int c=stdIn.nextInt();
		
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.println("�ִ밪��"+max+"�Դϴ�.");
		
	}

}
