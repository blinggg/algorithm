package algorithm;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		System.out.println("n의값:");
		int n=stdIn.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		
		System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
	}

}
