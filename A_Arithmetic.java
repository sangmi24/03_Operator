package com.kh.operator;

public class A_Arithmetic {

	/*
	 * * ��� ������
	 * ���׿����ڷμ� ���� ���, �켱������ ������ �츮�� �˴� �Ϲ� ���� ����� ������ ������ �ϴ� ������
	 * 
	 * ����
	 * + : ����
	 * - : ����
	 * * : ����
	 * ������(/) : ������      => �����⸦ �ϰ� ���� ���Ѵ�.
	 * % : ��ⷯ (Modular) => �����⸦ �ϰ� ���������� ���Ѵ�.
	 */
	
	public void method1 () {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 +num2 = "+ (num1 + num2));
		//(num1 +num2)�� ��ȣ�� ����� 13�̶�� ����� ���´�.
		//���࿡, num1 + num2�� �״�� ����ع�����
		//String ó�� ���� ����10, ����3�� ���ڿ�ó�� �ϳ��� ���̾ ����ϱ� ������ 103�� �����°�.
		//=> �հ� �ڰ� �켱������ ������ + �̱� ������ ������ ������ ���ʿ��� ���������� �帣�� ����
		
		System.out.println("num1-num2 = " +  (num1 - num2));
		//������ ��� ������ �켱������ ������
        //String ó�� ���� ���� 10�� 3�� ���ε��� �ν��ϱ� ������ ������ ������ �߻�.
		//=> (num1 -num2) ó�� ��ȣ�� ������� �Ѵ�.
		
		System.out.println("num1  * num2 = " + (num1 * num2) );
		System.out.println("num1 / num2  = " + (num1 / num2) ); //3 : ��
		System.out.println("num1 % num2  = " + (num1 % num2) ); //1: ������
		//����, ������, ��ⷯ�� ��쿡�� �������� �켱������ ���� ������
		//��ȣ�� ���� ���� �ʾƵ� ��Ȯ�� ����� ���´�.
		//�������: �ٸ� ��ȣ�� ���� ���� �����Ѵ�. �������� �������� ����.
		
		// System.out.println(10 / 0); 
		// System.out.println( 10 % 0);
		// ArithmeticException: / by zero ���� �߻�
		// => ���а� ���������� 0 ���� ������ ����. ����!!
		
		// �Ǽ��� ���
		double a = /* (double) */35; //35.0 
		double b = /* (double) */10; //10.0
		
		System.out.println("a + b = " +(a + b) );  //45.0
		System.out.println("a - b = "+ (a - b) );  //25.0
		System.out.println("a * b = "+ (a * b) );  //350.0
		System.out.println("a / b = "+ (a / b) );  //3.5
		System.out.println("a % b = "+ (a % b) );  //5.0
		// => �Ǽ������� ���� ������� �Ǽ�	
	}
	
}








