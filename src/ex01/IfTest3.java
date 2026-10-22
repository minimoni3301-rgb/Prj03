package ex01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class IfTest3 {

	public static void main(String[] args) {
		
		//java.time.LocalDateTime now = java.time.LocalDateTime.now()
		LocalDateTime now = LocalDateTime.now();
		
		int daywk = now.getDayOfWeek().getValue(); 
		String wkday = "";    //"月火水木金土日曜日";
		
		if(daywk == 1)  {
			wkday = "月";
		} else {
			if(daywk == 2 ) {
				wkday = "火";
		} else {
			if(daywk == 3) {
				wkday ="水";
		} else {
			if(daywk == 4) { 
			wkday = "木";
		} else {
			if(daywk == 5) { 
				wkday = "金";
		} else { 
			if(daywk == 6) {
				wkday = "土";
			}else {
				if(daywk == 7) {
			wkday = "日";
			}else {
		}
		}
			}
		} 
			}
		System.out.println("한자로" + wkday + "曜日");
	}
			
	//-------------------------------------------------------
			
		String wkday2 = "";
		switch(daywk) {
		case 1: wkday2 = "월"; break;
		case 2: wkday2 = "화"; break;
		case 3: wkday2 = "수"; break;
		case 4: wkday2 = "목"; break;
		case 5: wkday2 = "금"; break;
		case 6: wkday2 = "토"; break;
		case 7: wkday2 = "일"; break;
		}
		
		System.out.println("한글로" + wkday2 + "요일");
		
		
		// 요일 객체 가져오기 (MONDAY, TUESDAY 등)
        var dayOfWeek = now.getDayOfWeek();
        
        // 1. 한글 요일 출력 (결과 예: 수요일 / 수)
        String koreanDay = ((DayOfWeek) dayOfWeek).getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println("한글 요일(전체):" + koreanDay);
        
        // 2. 배열을 활용 : 변수여러개를 묶어놓고 하나의 변수는 하나의 데이터만 담당 
        //        배열       0    1   2    3    4    5    6
       String [] dayStr = {"월","화","수","목","금","토","일"};
       
       System.out.println(dayStr[daywk-1] + "요일");
		}
	}
}	