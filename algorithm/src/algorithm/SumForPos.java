package algorithm;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�");
		
////		do {
//			System.out.println("n�� ���� �ٽ� �Է��ϼ���:");
//			n=stdIn.nextInt();
//		}while(n<=0);
		int n=stdIn.nextInt();
		if(n<=0) {
			System.out.println("n�ǰ��� �ٽ� �Է��ϼ���!");
		}
		int sum=0;
		for(int i=1;i<=n;i++) sum+=i;
		
		System.out.println("1����"+n+"����������"+sum+"�Դϴ�.");
	}

}
