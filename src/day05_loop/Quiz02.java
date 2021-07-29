package day05_loop;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1¹ø
		int su1=0, su2=0;
		int n =1;
		for(su1=1; su1<=9; su1++) {
			for(su2=1; su2<=9; su2++) {
				System.out.println(n+"x"+su2+"="+(n*su2));
			}
			n++;
			System.out.println();
		}
		
		//2¹ø
		int a=1;
		for(su1=1; su1<=5; su1++) {
			for(su2=1; su2<=5; su2++) {
				System.out.print((a*su2)+"\t");
			}
			a++;
			System.out.println();
		}
		System.out.println();
		
		//3¹ø
		int num=1;
		for(su1=1; su1<=5; su1++) {
			for(su2=1; su2<=5; su2++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}

}
