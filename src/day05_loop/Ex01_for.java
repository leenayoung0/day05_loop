package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		 ��Ģ������ ���� ���Ѵٸ� �ݺ��� ���
		  
		 for���� ;(�����ݷ�) ������ ������ 2���� ���;� �Ѵ�
		 �ʱⰪ ���ǽ� �������� ��� �������
		 
		 for(�ʱⰪ ; ���ǽ� ; ������){
		 	���ӹ���
		 }
		 
		 (����)
		 1.�ʱⰪ -> 2.���ǽ� -> 3.���ӹ��� -> 4.������
		 	-�ʱⰪ�� ó���� �� �ѹ��� ����ȴ�
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
