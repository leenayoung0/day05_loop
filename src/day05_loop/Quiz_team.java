package day05_loop;

import java.util.Scanner;

public class Quiz_team {
	public static void main(String[] args) {
		//����1. 0���� 10���� ��� ���� ���� ����غ���.
		int sum= 0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("��: "+sum);
		System.out.println();
		
		//����2. ���ڸ� 5�� �Է¹ް�, 
		//�Է¹��� ������ �������� �� �ۼ��ϱ�
		//(�����Է� : 5, ��� : 5->�����Է� : 6, ��� : 11)
		//(���� ���Ƿ� 10���� ����)
		Scanner sc = new Scanner(System.in);
		int n, sum1=0;
		
		for(int i=0; i<=10; i++) {
			System.out.print("���� �Է�: ");
			n = sc.nextInt();
			
			sum1+=n;
			System.out.println("���: "+ sum1);
		}
		System.out.println();
		
		//����3. 1���� 100���� ���� �߿��� 3�� ����� ������ ���ϱ�
		int sum2=0;
		for(int i=0; i<=100; i++) {
			if(i%3==0) {
				sum2+=i;
			}
		}
		System.out.println("1~100���� 3�� ��� ����: "+ sum2);
		System.out.println();
		
		//����4. 1���� 100�� ���� �� 2�� ����� ���� m1, 
		//3�� ����� ���� m2�� ����Ͻÿ�.
		int m1=0, m2=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				m1+=i;
			}
			if(i%3==0) {
				m2+=i;
			}
		}
		System.out.println("1~100���� 2�� ����� �� m1: "+m1);
		System.out.println("1~100���� 3�� ����� �� m1: "+m2);
	
	sc.close();
	}

}
