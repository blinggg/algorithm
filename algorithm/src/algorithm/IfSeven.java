package algorithm;

import java.util.Scanner;

public class IfSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		System.out.println("n�ǰ�:");
		int n=stdIn.nextInt();
		int sum=0;
		
		if(n==7) {
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			}
		}
		
		System.out.println("1���� "+n+"������ ����"+sum+"�Դϴ�.");
	}

}
