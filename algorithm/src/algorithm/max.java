package algorithm;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("세 개의 정수를 입력하세요.");
		System.out.println("a의 값:"); int a=stdIn.nextInt();
		System.out.println("b의 값:"); int b=stdIn.nextInt();
		System.out.println("c의 값:"); int c=stdIn.nextInt();
		
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.println("최대값은"+max+"입니다.");
		
	}

}
