package com.kh.operator;

public class C_Compound {

	/*
	 * *복합대입연산자
	 * 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * 종류
	 * +=  -=  *=  /=  %=
	 * 
	 * 사용 예시
	 * a += 3; -> a = a + 3;
	 * 기존에 a라는 변수에 들은 값에 3을 더해서 다시 a 라는 변수에 대입해주겠다.  
	 */
	 
	public void method1() {
		
	  int num = 12;
	  
	  System.out.println("현재 num : " +num ); //12
	  
	  //그냥 산술연산으로
	  //num을 3 증가시키기 => 덧셈
	  num = num + 3;
	  System.out.println("증가된 num: "+num); //15
	   
	  // 복합대입연산자를 이용하여
	  //num을 3 증가시키기 => 덧셈
	    num += 3;  //num = num +3;
	   System.out.println("또 증가된 num : "+ num); //18
	   
	   // num 을  5로 감소시키기 => 뺄셈
	   num -= 5 ;  //num = num - 5;
	   System.out.println("감소된 num : "+num ); //13
	   
	   //num 을 6배 증가시키기 => 곱셈
	   num *= 6 ; //num = num * 6;
	   System.out.println("6배 증가시킨 num : "+num ); //78
	   
	   //num을 2배 감소시키기 => 나눗셈
	   num /= 2; //num = num / 2;
	   System.out.println("2배 감소시킨 num : "+num); //39
	   
	   //num을 4라는 숫자로 나누었을때 나머지를 num에 대입  => 모듈러%
	   num %= 4;  //num = num % 4;
	   System.out.println("최종  num : "+num);  //3
	   
	 //  += 의 경우  문자열 접합도 가능
	   String str = "Hello";
	   
	   //HelloWorld
	   //str = str + "World"
	   str += "World";
	   
	   System.out.println(str); 
	  
	 
	
	}
}




