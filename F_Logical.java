package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

 	/*
 	 * * ��������
 	 * �ΰ��� ������ �����ϴ� ������ (���׿�����)
 	 * [ ǥ���� ]
 	 * ����(��������)���� => ������� ����
 	 * 
 	 * �������� ����
 	 * && : AND ������ (�׸���)
 	 *      ���� && ����
 	 *      => ����, �������� ������ �Ѵ� true�������� ����� true
 	 * || : OR ������ (�Ǵ�)
 	 *      ���� || ����
 	 *      => ����, �������� ���� �߿��� �ϳ��� true�̶�� ����� true
 	 *      
 	 * ����� ��
 	 * 1. true && true == true 
 	 * 2. true && false == false
 	 * 3. false && true == false
 	 * 4. false && false ==false
 	 * 5. true || true == true
 	 * 6. true || false == true
 	 * 7. false || true == true
 	 * 8. false || false == false
 	 */
	
	public void method1() {
		
		//�񱳿����� + ��������
		//����ڰ� �Է��� �������� ���"�̸鼭(�̰�, �׸���)" ¦������ Ȯ���ϱ�
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ѱ� �Է�: ");
		int num = sc.nextInt();
		
		//�ǰ��� ����� ���� boolean ������ ������ �ϳ� �����
		boolean result = (num > 0)   &&  ( ( num % 2) == 0  )  ;  //����Ǻ� &&¦���Ǻ�
		//&& �� �ǹ� : �׸���, ~�̸鼭, ~�̰�
		
		System.out.println("����ڰ� �Է��� ���� ����̸鼭 ¦���Դϱ�? : "+ result);	
	}
	
	 public void method2() {
		 
		 // ����ڰ� �Է��� �������� 1�̻� 100������ ������ Ȯ���ϱ�  
		 //=> 1�̻� �׸��� 100���� 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("������ �Ѱ� �Է�: ");
		 int num = sc.nextInt();
		 
		 // 1 <= num <= 100 �̷��� ����ó�� �ѹ��� ������ ��� ǥ���� �Ұ�
		 // �������� 1���� ũ�ų� ����, �׸��� �������� 100���� �۰ų� ���� ���� �ɰ��� �Ѵ�.  
		 //(1 <=num) && (num <=100)
		 boolean result = (1 <= num) && (num <=100);
		 
		 System.out.println("����ڰ� �Է��� ���� 1�̻� 100���� �Դϱ�? : "+ result);	 
	 }
	
	 public void method3() {
		 
		 //����ڰ� �Է��� ���� 'y'�̰ų�(�Ǵ�) 'Y'���� Ȯ���ϱ�
		 
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("����Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
		  char ch = sc.nextLine().charAt(0);
          
		  boolean result = (ch == 'y') || (ch == 'Y');
		  // ||�� �ǹ� : �Ǵ�, ~�̰ų�
		  
		  System.out.println("����ڰ� �Է��� ���� 'y'�̰ų� 'Y'�Դϱ�?: "+result);
	 }
	  
	 public void method4() {
		 
		 /*
		  *  && : �Ѵ� true �̾�� true 
		  *  || : �� �߿� �ϳ��� true �������� true (�Ѵ� flase�������� flase)
		  */
		 
		 int num1 = 10;
		 
		 boolean result1 = false && (num1 > 0);  //result1= false
		// Dead code : �ʿ���� �ڵ�, ���� �� ������ ���� ���� (�ܼ��� ���)
		// �񱳿��� �� ���� ������ ������ ���� �ʴ´�. 
		// => ���� false && ���� ������ ����� ������ false���ٵ� �� �ڵ带 �ۼ��� ������ ���� ����� ��
		 
		 System.out.println("result 1: "+ result1);
		 
		 boolean result2 = true || (num1 > 0);  //result2 = true 
		 //Dead code 
		 //=> ���� true || ���� ���� �� ������ ����� true �ϱ� �ڰ� Dead code�� �Ǵ� ��! 
		 
		 System.out.println("result 2 : "+ result2 ); 
		 
	 }
	 
	
	

	
	
}




