package ex04;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncTest02 {
           // 전역 data                           입력을 할때는 가공된 데이터를 넣지 xx
	       // 입력 : 이름, 전화, 성별(1:남 2:여), 나이(local date?, 가공된 데이터가 아닌 태어난 연도,안 변하는걸로)
	       // 출력 : 이름, 전화, 성별:남자/여자 ,  
	
	// 입력
	static String name;
	static String phone; // 전화번호 '-' 를 마이너스로 인식(수치형 문자) 
	static String man;   // 성별(1:남 2:여)
	static int    bYear; // 계산이 필요하면 '숫자 int'로 계산이 필요없으면 'String' (계산 여부로 판단) 
	// 출력
	static String gender; // 남자/여자
	static int    age;    // 나이 
	
	
	public static void main(String[] args) {
		
		input();
		process();
		output();
		System.out.println("End....");
		

	}
    // input
    private static void input() {
	    // 키보드 준비
    	Scanner         in        =  new Scanner(System.in);
		//클래스(type)	instance     new 생성자 ()
		//              변수    
    	
    	System.out.println("이름:"); // 사용자가 뭘 입력해야하는지 알려주는 가이드라인 
    	name  = in.nextLine();   // 사용자가 입력한 한 줄 전체(엔터키를 누르기 전까지의 모든 글자와 공백)를 안전하게 읽어오기 위해서
    	System.out.println("전화(010-111-1111):");
        phone = in.nextLine();
        System.out.println("성별(1:남자 2:여자):");
        man   = in.nextLine();
        System.out.println("태어난 연도(2000):");
        bYear = in.nextInt();
	}

		   private static void process() {
		     // 중요 : 문자열 비교는 ==로 하지않는다.
			 // man.equals("1") == true -> 글자가 같은지 비교
			 // man.compareTo("1") > 0 -> 글자의 순서 비교 
			 /*   if( man == "1") //틀린표현
			   gender = "남자";
			   else
			   gender = "여자"; */  
			   
			   
			   if( man.equals("1"))
				   gender = "남자";
				   else
				   gender = "여자";
			   
			   //--------------------------
			   // 올해연도
			   // 나이 = 올해연도 - 태어난연도 
			   
			   // 내가 작성
			  /*  LocalDate thisYear = LocalDate.now();
			   int       bYear = 1995;
			   int age = thisYear.getYear() - bYear; */
			   
			 
			 // 나이  
			  age  = calcAge(bYear);
			  
			  
	
			  
	}
		   //나이계산 함수 
		   private static int calcAge(int bYear) {
			
			   // 올해연도
			   LocalDate now  = LocalDate.now();
			   int      tYear = now.getYear();
			   
			   // 나이 = 올해연도 - 태어난연도
			   int result  = tYear - bYear;
			   return result;

		   
		   
		   }
		   private static void output() {
			
			   System.out.println("이름   전화   성별     나이");
			   System.out.printf("%s       %s     %s      %d ",
					              name,    phone, gender,  age);
			   		        
		   
		   }

}
