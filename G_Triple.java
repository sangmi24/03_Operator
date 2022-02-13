package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * *삼항연산자
	 * 3개의 항목(피연산자)을 가지고 연산하는 연산자
	 * 
	 *  [ 표현법 ]
	 *  조건식 ? 조건식의 결과가 true 일경우의 결과값 : 조건식의 결과가 false일 경우의 결과 값
	 *  
	 *  => 단, 조건식의 결과는 true 아니면 false 가 나온다.
	 *  (조건식 : 조건을 판별하는 식, 결과가 true 아니면 false로 나올수 있는 모든 식)
	 *  => 주로 true 아니면 false 로 결과가 나올 수 있는 연산자들이 쓰임 : 논리부정연산자, 비교연산자, 논리연산자  
	 */
	  
	    public void method1() {
	    	
	    	// 사용자가 입력한 정수값이 양수인지 아닌지 판별 후에 그에 맞는 결과를 출력 
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("정수값 입력 : " );	    	
	    	int num = sc.nextInt();
	    	
	    	// 결과값이 String이기 때문에 String 변수에 선언하여 대입
	    	String result = ( num > 0 )? "양수입니다" : "양수가 아닙니다" ;
	        
	    	System.out.println( num + " 은 " + result );	    		    	
	    }
	
	  public void method2() {
		 
		  //사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 적당한 결과를 출력
		  Scanner sc = new Scanner(System.in);
		  System.out.print("정수값 입력: ");
		  int num = sc.nextInt();
		  
		  //(num % 2) == 0 => 짝수일경우
		 // String result = ((num % 2) == 0) ? "짝수입니다" : "홀수입니다";
		  
		  //(num % 2) == 1 => 홀수일경우를 나타내는 조건식
		  String result = ((num %2 )== 1 )? "홀수입니다" : "짝수입니다";
		   
		   System.out.printf("%d은  %s", num, result);  
	  }
	
	  public void method3() {
		  
		  // 사용자로부터 영문자 하나를 입력받아서 대문자인지 대문자가 아닌지 판별후 출력
		  // => 아스키코드 ('A' =65, 'a' = 97)
		  // => 자동형변환 특이케이스 4번 참고!
		  Scanner sc = new Scanner(System.in);
		  System.out.print("영문자 한 문자 입력 : ");
		  char ch = sc.nextLine().charAt(0);
		  
		  //해당 문자가 대문자 범위에 있는지 체크 (65 <= 해당문자의 코드 <= 90 ) 2가지 방법이 있다. 
		  //String result = (65 <= ch && ch <= 90 )? "대문자이다." : "대문자가 아니다.";
		  String result = ('A' <= ch && ch <= 'Z' )? "대문자이다." : "대문자가 아니다.";
	
		  System.out.printf("%c 은 %s", ch, result); 	  
	  }
	    public void method4() {
	    	
	    	/*
	    	 * 기존의 method1 의 내용을 보완
	    	 * 사용자가 입력한 정수값이 양수인지, 0인지, 음수인지 판별 후
	    	 * 그에 맞는 결과를 출력
	    	 */
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("정수값 입력 :" );
	    	int num = sc.nextInt();
	    	
	    	//(조건식)? true일경우 : false일경우
	    	//(num > 0 )? "양수입니다.": (삼항연산자를 한번 더 써서 경우의 수 추가)-> 중첩
	    	//(num > 0 )? "양수입니다.":( (조건식)? true일경우 : false일경우)
	    	String result = (num > 0 )? "양수입니다.": ( (num == 0 )? "0입니다." : "음수입니다.");
	    	
	    	System.out.println(result);
	    	
	    	//삼항연산자를 중첩사용시, 표현 가능한 경우의 수를 더 늘릴 수 있다.
	    }
	
	
}




