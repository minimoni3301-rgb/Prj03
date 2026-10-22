package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IfTest1 {

	public static void main(String[] args) {
		// 아침 : 9~11시 
		// 점심 : 11~15시
		// 브레이크 타임 : 15~17시
		// 저녁 : 17~20시
		
		// 컴퓨터의 시간을 가져온다 : class를 사용해서 
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.getHour());
		
		LocalDate today = LocalDate.now();
		System.out.println(LocalDate.now());
		
		
				int hour = now.getHour();
		String mealTime = "";

		if(9 <= hour && hour <= 11) {
			mealTime = "아침식사시간입니다";
		} else {
			if(11 < hour && hour < 15) {
				mealTime = "점심식사시간입니다";	
			} else {
				if(15 <= hour && hour <= 17) { 
					mealTime = "브레이크타임입니다";
				} else {
					if(18 <= hour && hour <= 20) {
						mealTime = "저녁식사시간입니다";
					} else {
					}
				}
			}
		}

		System.out.println(mealTime);
		
		
		int year = now.getYear(); //now 에서 연도만 뽑아올 때 
	    int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		              //영어로 표기 + 숫자로 표기 
	    int val = now.getDayOfWeek().getValue(); // 1(월) ~ 7(일)
		String wkday = "수";
		
		System.out.println(now.getMonth()); 
		System.out.println(now.getMonthValue());
		
		System.out.println( "년도:" + now.getYear() + "년");
		System.out.println("월:" + now.getMonthValue() +"월");
		System.out.println("일:" + now.getDayOfMonth() + "일");
		System.out.println("요일:"+ wkday + "요일");
		System.out.println("요일:"+ val + "요일");
		
		

	}

}
