package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
		//1번
		for(int i=1; i<=4 ; i++) {
			System.out.println(i+". hello");
		}
		
		//2번 - 내가 푼거
		int sum=0;
		for(int i=1; i<=100 ; i++) {
			sum=i+sum;
			System.out.println(i+": "+sum);
			if(sum==528) {
				System.out.println(i+"일때 -> "+sum);
				break;
			}
		}
		
		System.out.println();
		
		//2번 - 쌤
		//int sum=0;
		for(int i=0; i<100; i++) {
			sum+=i;
			//System.out.println(i+" : "+sum);
			if(sum==528) {
				System.out.println(i);
			}
		}
		
	
		
		//3번 -내가 푼거
		int i;
		for(i=1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(i=6; i<=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(i=11; i<=15; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(i=16; i<=20; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(i=21; i<=25; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//3번 - 쌤(1)
		// 위에 내가 int i; 해버려서 선언문 생략된거
		// 원래는 for(int i=1; ; ) 다 이렇게 쓰심
		for(i=1; i<=25 ; i++) {
			System.out.print(i+"  ");
			if(i%5==0) {
				System.out.println();
			}
		}
			
		//3번 - 쌤(2)
		for(i=1; i<=25 ; i++) {
			if(i%5==0) {
				System.out.println(i);
			}else {
				System.out.print(i+"\t");
			}
		}
		
	}

}

