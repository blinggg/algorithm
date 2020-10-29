package algorithm;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 구합니다.");
		
		int n;
		do {
			System.out.println("정수값을 입력하세요.:");
			n=stdIn.nextInt();
		}while(n<=0);
		
		int x=0;
		while(n>0) {
			n/=10;
			x++;
		}
		
		System.out.println("그 수는 "+x+"자리입니다.");
		
	}

}
