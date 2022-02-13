package com.kh.practice;
import java.util.Scanner;
public class ArithmeticPractice {
 
   public void devideCandy() {
	   
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("ÀÎ¿ø ¼ö: ");
	   int i1= sc.nextInt();
	   sc.nextLine();
	   
	   System.out.print("»çÅÁ °¹¼ö: ");
	   int i2= sc.nextInt();
	   sc.nextLine();

	   System.out.println("1ÀÎ´ç ³ª´²ÁÙ »çÅÁ °¹¼ö :"+(i2/i1));
       System.out.println("³²´Â »çÅÁ °¹¼ö: "+(i2%i1));	   
	   
   }
	
}

