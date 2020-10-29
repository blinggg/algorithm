package algorithm;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
////		do {
//			System.out.println("n의 값을 다시 입력하세요:");
//			n=stdIn.nextInt();
//		}while(n<=0);
		int n=stdIn.nextInt();
		if(n<=0) {
			System.out.println("n의값을 다시 입력하세요!");
		}
		int sum=0;
		for(int i=1;i<=n;i++) sum+=i;
		
		System.out.println("1부터"+n+"까지의합은"+sum+"입니다.");
	}

}
