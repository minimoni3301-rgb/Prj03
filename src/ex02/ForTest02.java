package ex02;

public class ForTest02 {

	public static void main(String[] args) {
		
		for (int i=1 ; i<=5; i++) {
			System.out.println(i + ".안유진");
		}
		System.out.println();
		
		int i2 = 1;
		while( i2 <= 5 ) 
			System.out.println( i2 + ".안유진");
	i2++;  // 증가치가 일정하지 않을 때 
		
		
		System.out.println();
		
		int i3 = 1;
		do {
		System.out.println(i3 + ".안유진");
			i3++;
		} while(i3 <=5); 
		
	

}
}
