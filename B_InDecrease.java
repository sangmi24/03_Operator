package com.kh.operator;

public class B_InDecrease {

	/*
	 * *증감연산자
	 * 단항연산자로써 한번에 값을 1씩만 증가시키거나, 감소시키는 연산자
	 * 
	 * 종류
	 * ++  : 한번에 값을 1만 증가시키겠다. 
	 *[ 표현법 ] 
	 * ++값  : 전위연산자  
	 * 값++ : 후위연산자 
	 * 
	 * --  : 한번에 값을 1만 감소시키겠다.
	 * [ 표현법 ]
	 * --값  : 전위연산자
	 * 값-- : 후위연산자
	 * 
	 * => 연산자의 위치에 따라서 연산이 언제 될지 결정
	 * (증감연산자)값 : 연산이 먼저 되고 나서 값을 처리함                   => 선증감 후처리
	 *  값(증감연산자) : 값이 처리되고 나서 그다음에 연산이 이루어짐  => 선처리 후증감
	 */
	
	public void method1() {
		
		int num = 10;
		
		System.out.println("num : "+num);
		
		num++;  //num 변수에 들은 값에 1을 증가시키겠다.
		        //즉, num =num +1 ; 과 같은 의미 
		
		System.out.println("변경된 num : "+num);		
	}
	
	public void method2() {
		
		// 전위연산자 => 선 증감 후 처리
		int a = 10;
		int b = ++a;  // ++a  이 시점에서 a 의 값이 1 증가  (11)후에
		              // =이라는 시점에서 b 에 a 값이 대입되는 처리과정을 거치는 것 
		
		System.out.println("a  : "+ a +" , b : " +b );
		//a  : 11, b : 11
		
		// 후위연산자 => 선 처리 후 증감
		int c = 10;
		int d = c++;  //=이라는 구문 시점에서 먼저 d 에 기존의 c값인 10이 먼저 대입되는 처리과정을 거친 후에
		             //c++ 라는  이 시점에서 c의 값이 1증가 (11)
		
		System.out.println("c : " +c+ " ,d :"+d);
		//c: 11 , d:10
				
	} // method2 영역 끝
	
	public void method3() {
		
		//후위연산 (일단 ++지우고서 num1로계산하기 )
		int num1 = 20;
		int result1 = num1++ *3;  // result1=60 , num1=21
		//증감연산자는 단항연산자라서 값 한개에만 연산이 적용된다.
		//=> num1에만 1 증가가 적용 , result1에는 적용되지 않는다.
		
		System.out.println("num1 : " +num1 );
		System.out.println("result1 :"+ result1);
		
		//전위연산
		int num2 = 20;
		int result2 = ++num2 * 3 ; //num2=21, result2=63 
		
		System.out.println("num2 : "+num2 );
		System.out.println("result2 : "+result2 );
		
		// -- 의 경우 
		int num3 = 10;
		//int result3=--num3 *5;  //num3=9, result3=45
		int result3 = num3-- * 5 ; //result3= 50, num3=9
		
		System.out.println("num3: "+num3);
		System.out.println("result3: "+result3);
		
		
		
	}
	
	
	
	
	
}
