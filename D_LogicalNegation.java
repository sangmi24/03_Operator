package com.kh.operator;

public class D_LogicalNegation {

	/*
	 * *논리부정연산자 
	 * true 또는 false 라는 논리값을 반전시켜주는 연산자
	 * 
	 *  [ 표현법]
	 *  !논리값 
	 */

	public void method1() {
		
		System.out.println(" true 의 부정 : "+ !true);
		System.out.println(" false 의 부정 : "+ !false);
		
		boolean b1 = true ;
		boolean b2 = !b1;   //false
		
		System.out.println("b1 : "+ b1);  //(b1에 대입되지 않았기 때문에 값이 변하지 않는다.)
		System.out.println("b2 : "+ b2);
		
		
		
	}
	
	
}
