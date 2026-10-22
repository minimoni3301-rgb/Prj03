package ex04;

public class FuncTest01 {
	
	//변수를 여기 만들어야 input, output 가능
    //전역변수 : Global scope
	
	static int    num;   
	static String name;
	static boolean man; //입력변수
	static String gender; //출력변수
	
	public static void main(String[] args) {

		int    num;
		String name;
		int    kor;
		int    eng;
		int    mat;
  
		input();
		process();
		output();
		

	}//중괄호 안에서만 살아있는 변수 : 지역변수 

	private static void input() {
	
		num = 1;
		name = "미나미";
		man = false;
		
	}
	private static void process() {
		                 // man == true 
	if(man)
		gender = "남자";
	else 
		gender = "여자";
	
	}
	
	

	private static void output() {//변수를 만드는 'int'가 없음
		                          //영역이 다르다
	
		 System.out.println(num);
		 System.out.println(name);
		 System.out.println(gender);
	}

}
