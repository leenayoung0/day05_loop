package day05_loop;

import java.util.Scanner;

public class Quiz_team {
	public static void main(String[] args) {
		//문제1. 0부터 10까지 모두 더한 값을 출력해보기.
		int sum= 0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("합: "+sum);
		System.out.println();
		
		//문제2. 숫자를 5번 입력받고, 
		//입력받을 때마다 더해지는 식 작성하기
		//(숫자입력 : 5, 출력 : 5->숫자입력 : 6, 출력 : 11)
		//(내가 임의로 10개만 받음)
		Scanner sc = new Scanner(System.in);
		int n, sum1=0;
		
		for(int i=0; i<=10; i++) {
			System.out.print("숫자 입력: ");
			n = sc.nextInt();
			
			sum1+=n;
			System.out.println("출력: "+ sum1);
		}
		System.out.println();
		
		//문제3. 1부터 100까지 정수 중에서 3의 배수의 총합을 구하기
		int sum2=0;
		for(int i=0; i<=100; i++) {
			if(i%3==0) {
				sum2+=i;
			}
		}
		System.out.println("1~100까지 3의 배수 총합: "+ sum2);
		System.out.println();
		
		//문제4. 1부터 100의 숫자 중 2의 배수의 합은 m1, 
		//3의 배수의 합은 m2로 출력하시오.
		int m1=0, m2=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				m1+=i;
			}
			if(i%3==0) {
				m2+=i;
			}
		}
		System.out.println("1~100까지 2의 배수의 합 m1: "+m1);
		System.out.println("1~100까지 3의 배수의 합 m1: "+m2);
	
	sc.close();
	}

}
