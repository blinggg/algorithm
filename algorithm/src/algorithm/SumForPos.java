package algorithm;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�");
		int n;
		
		do {
			System.out.println("n�� ���� �Է��ϼ���:");
			n=stdIn.nextInt();
		}while(n<=0);
		
		int sum=0;
		for(int i=1;i<=n;i++) sum+=i;
		
		System.out.println("1����"+n+"����������"+sum+"�Դϴ�.");
	}
}
