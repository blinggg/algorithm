package algorithm;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�..");
		int n;
		
		do{
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n=stdIn.nextInt();
		}while(n<=0);
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
