package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * *���׿�����
	 * 3���� �׸�(�ǿ�����)�� ������ �����ϴ� ������
	 * 
	 *  [ ǥ���� ]
	 *  ���ǽ� ? ���ǽ��� ����� true �ϰ���� ����� : ���ǽ��� ����� false�� ����� ��� ��
	 *  
	 *  => ��, ���ǽ��� ����� true �ƴϸ� false �� ���´�.
	 *  (���ǽ� : ������ �Ǻ��ϴ� ��, ����� true �ƴϸ� false�� ���ü� �ִ� ��� ��)
	 *  => �ַ� true �ƴϸ� false �� ����� ���� �� �ִ� �����ڵ��� ���� : ������������, �񱳿�����, ��������  
	 */
	  
	    public void method1() {
	    	
	    	// ����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� �Ŀ� �׿� �´� ����� ��� 
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("������ �Է� : " );	    	
	    	int num = sc.nextInt();
	    	
	    	// ������� String�̱� ������ String ������ �����Ͽ� ����
	    	String result = ( num > 0 )? "����Դϴ�" : "����� �ƴմϴ�" ;
	        
	    	System.out.println( num + " �� " + result );	    		    	
	    }
	
	  public void method2() {
		 
		  //����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ������ ����� ���
		  Scanner sc = new Scanner(System.in);
		  System.out.print("������ �Է�: ");
		  int num = sc.nextInt();
		  
		  //(num % 2) == 0 => ¦���ϰ��
		 // String result = ((num % 2) == 0) ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		  
		  //(num % 2) == 1 => Ȧ���ϰ�츦 ��Ÿ���� ���ǽ�
		  String result = ((num %2 )== 1 )? "Ȧ���Դϴ�" : "¦���Դϴ�";
		   
		   System.out.printf("%d��  %s", num, result);  
	  }
	
	  public void method3() {
		  
		  // ����ڷκ��� ������ �ϳ��� �Է¹޾Ƽ� �빮������ �빮�ڰ� �ƴ��� �Ǻ��� ���
		  // => �ƽ�Ű�ڵ� ('A' =65, 'a' = 97)
		  // => �ڵ�����ȯ Ư�����̽� 4�� ����!
		  Scanner sc = new Scanner(System.in);
		  System.out.print("������ �� ���� �Է� : ");
		  char ch = sc.nextLine().charAt(0);
		  
		  //�ش� ���ڰ� �빮�� ������ �ִ��� üũ (65 <= �ش繮���� �ڵ� <= 90 ) 2���� ����� �ִ�. 
		  //String result = (65 <= ch && ch <= 90 )? "�빮���̴�." : "�빮�ڰ� �ƴϴ�.";
		  String result = ('A' <= ch && ch <= 'Z' )? "�빮���̴�." : "�빮�ڰ� �ƴϴ�.";
	
		  System.out.printf("%c �� %s", ch, result); 	  
	  }
	    public void method4() {
	    	
	    	/*
	    	 * ������ method1 �� ������ ����
	    	 * ����ڰ� �Է��� �������� �������, 0����, �������� �Ǻ� ��
	    	 * �׿� �´� ����� ���
	    	 */
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("������ �Է� :" );
	    	int num = sc.nextInt();
	    	
	    	//(���ǽ�)? true�ϰ�� : false�ϰ��
	    	//(num > 0 )? "����Դϴ�.": (���׿����ڸ� �ѹ� �� �Ἥ ����� �� �߰�)-> ��ø
	    	//(num > 0 )? "����Դϴ�.":( (���ǽ�)? true�ϰ�� : false�ϰ��)
	    	String result = (num > 0 )? "����Դϴ�.": ( (num == 0 )? "0�Դϴ�." : "�����Դϴ�.");
	    	
	    	System.out.println(result);
	    	
	    	//���׿����ڸ� ��ø����, ǥ�� ������ ����� ���� �� �ø� �� �ִ�.
	    }
	
	
}




