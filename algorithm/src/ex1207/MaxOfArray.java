package ex1207;

import java.util.Scanner;

//�迭 ����� �ִ��� ��Ÿ���ϴ�(���� �Է¹���)
public class MaxOfArray {
	//�迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	
	static int maxOf(int[]a) {
		int max=a[0];
		for(int i=1; i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.println("��� �� :");
		
		int num=stdIn.nextInt(); //�迭�� ��ڼ� �Է¹���
		
		int[] height=new int[num]; //��ڼ��� num�� �迭�� ����
		
		for(int i=0; i<
				
				num;i++) {
			System.out.println("height["+i+"]");
			height[i]=stdIn.nextInt();
			
		}
		
		System.out.println("�ִ밪��"+maxOf(height)+"�Դϴ�.");
	}

}
