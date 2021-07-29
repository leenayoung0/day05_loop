package day05_loop;

public class Ex04_for {
	public static void main(String[] args) {
		int su=1, sum=0;
		for ( ; su<=10 ; ) {
			sum+=su;
			su++;
		}
		System.out.println("1~10 합 : "+sum);
		
		for( ; ; ) {
			System.out.println("실행");
		}
		//무한 반복에 빠짐
	}

}
