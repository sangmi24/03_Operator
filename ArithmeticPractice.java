package com.kh.practice;
import java.util.Scanner;
public class ArithmeticPractice {
 
   public void devideCandy() {
	   
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("�ο� ��: ");
	   int i1= sc.nextInt();
	   sc.nextLine();
	   
	   System.out.print("���� ����: ");
	   int i2= sc.nextInt();
	   sc.nextLine();

	   System.out.println("1�δ� ������ ���� ���� :"+(i2/i1));
       System.out.println("���� ���� ����: "+(i2%i1));	   
	   
   }
	
}

