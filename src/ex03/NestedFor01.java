package ex03;

public class NestedFor01 {

	public static void main(String[] args) { //maina만 실행함 
		                                     //함수가 많아도 main에 포함되지 않으면 실행되지 않음
		                                     //main함수에 크기가 있다 (조각 내기)- 함수조각
		
		star1();
		star2();
		star3();
		star4();
		

	}
	private static void star4() {
		System.out.println("4.");
		   
		   for(int i=1; i<=5; i++) {
			   for(int j=1;j<=5;j++) {
		        System.out.print("*");
			   }
			System.out.println();
		   }
		
	}// 이중 for문
	private static void star3() {
		System.out.println("3.");
		   
		   for(int i=1; i<=5; i++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();
			
		   }
			System.out.println();
	}
	// star2()
   private static void star2() {
	   System.out.println("2.");
	   
	   for(int i=1; i<=5; i++) {
		System.out.println("*****");
	   }
		System.out.println();
		
	}
   //star1()
	private static void star1() {
		System.out.println("1.");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println();
		
	}

}





