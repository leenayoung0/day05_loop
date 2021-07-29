package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		 규칙적으로 값이 변한다면 반복문 사용
		  
		 for문은 ;(세미콜론) 개수가 무조건 2개가 들어와야 한다
		 초기값 조건식 증감식은 없어도 상관없다
		 
		 for(초기값 ; 조건식 ; 증감식){
		 	종속문장
		 }
		 
		 (순서)
		 1.초기값 -> 2.조건식 -> 3.종속문장 -> 4.증감식
		 	-초기값은 처음에 딱 한번만 적용된다
		 */
		
		
		
		int sum = 0, cnt = 1;
		sum += cnt++; //1;
		sum += cnt++; //2;
		sum += cnt++; //3;
		sum += cnt++; //4;
		sum += cnt++; //5;
		sum += cnt++; //6;
		sum += cnt++; //7;
		sum += cnt++; //8;
		sum += cnt++; //9;
		sum += cnt++; //10;
		System.out.println(sum);
		System.out.println(cnt);
		
		
		for(cnt=1 ; cnt <= 10 ; cnt++) {
			sum+=cnt;
		}
		System.out.println("sum : "+ sum);
		
	}

}
