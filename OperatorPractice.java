package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����",
		//����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���.
		Scanner sc = new Scanner(System.in); //��ĳ��
		System.out.print("���� : "); //�Է� ����
		int num1 = sc.nextInt();
		
		//������� String�̱� ������ String������ ���� 
		//���׿����� : ����� true�ƴϸ� false�� ���´�.
		String result = (num1 >0 )? "�����." : "����� �ƴϴ�.";
		System.out.println(result);  //�����. ����� �ƴϴ�.
	}
	public void practice2() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����"
		//����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���
	   
		 Scanner sc = new Scanner(System.in);
		 System.out.print("����: "); //�Է� ����
		 int num1 = sc.nextInt(); //���� �Է��ϴ°��� �����̱� ������
		 
		 //������� String �̱� ������ String������ ����
		 //���׿����� ��ø ��Ŵ
		 String result = (num1 >0)? "�����":( (num1==0)? "0�̴�": "������");
		 System.out.println(result);

	}
	public void practice3() {
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����"
		//¦���� �ƴϸ� "Ȧ����" ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : "); //�Է� ����
		int num1 = sc.nextInt();
		
		//������� ���ڿ�String�̱� ������ String������ ����
		//���׿�����
		//¦�� ����Ҷ��� ������������ ��ⷯ % ��
		String result1 = ((num1%2)==0 )? "¦����" : "Ȧ����";
		System.out.println(result1);		
	}
	public void practice4() {
		//������� ���� �������� ���
		//�ο��� ���������� Ű����� �Է� �ް�
		//1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in); //��ĳ��
		System.out.print("�ο� �� : "); //�Է� ����
		int num1 = sc.nextInt();  //�ο��� ���� ����
		System.out.print("���� ����: ");
		int num2 = sc.nextInt();
		
		//1.1�δ� ���� ���� : ���� ����/�ο���
		//2.���� ���� ���� : ���� ����%�ο���
		
		int result1 = num2/num1 ;   //result���� ����
		int result2 = num2%num1 ;
		
		System.out.println("1�δ� ���� ����: "+result1);
		System.out.println("���� ���� ����: "+result2);
		
	}
       public void practice5() {
    	   //Ű����� �Է� ���� ������ ������ ����ϰ� ����� �������� ȭ�鿡 ����Ͽ� Ȯ��
    	   //�̶� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó���ϼ���.
    	   Scanner sc = new Scanner(System.in); //��ĳ��
    	   System.out.print("�̸� : ");//�̸� �Է� ����
    	   String name = sc.nextLine(); //�̸� String ����
    	   
    	   System.out.print("�г�(���ڸ�) : ");//�г� �Է� ����
    	   int grade =sc.nextInt();  // ���� int ����
    	   sc.nextLine();
    	   
    	   System.out.print("��(���ڸ�) : ");
    	   int group = sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.print("��ȣ(���ڸ� ) : ");
    	   int num = sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.print("���� (M/F) : ");  
    	   char gender = sc.nextLine().charAt(0); //���ڸ� �����ϱ� char�� ����!
     	   String result1 = (gender=='M')? "���л�" : "���л�";  //���׿�����(~~�̸� ~, ~�ƴϸ� ~)
    	   
    	   
    	   System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� ) : " ); 
    	   double score = sc.nextDouble();//�Ǽ��� Double
    	   
    	   System.out.println(grade+"�г�   "+group+"��   "+num+"��  "+name+" "
    	   		+ ""+result1+"�� ������  "+score+"�̴�.  " );	   
       }
	public void practice6() {
		//���̸� Ű����� �Է� �޾� ���(13������)����, û�ҳ�(13���ʰ�~19��)����,
	    //����(19�� �ʰ�)���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("����: "); //����  �Է� ����
		int age = sc.nextInt(); 
		String result=(age<=13)? "���": ( (age<=19)? "û�ҳ�":"����"); //���׿�����
		
		System.out.println(result);		
	}	

     public void practice7() {
       //����,����,���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
       //�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
       //�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
       //�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��ϋ� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("���� : ");//�Է� ����
    	 int k = sc.nextInt(); //���� k���� ����
    	 sc.nextLine();
    	 
    	 System.out.print("���� : "); //�Է� ����
    	 int e = sc.nextInt();  //���� e���� ����
    	 sc.nextLine();
    	 
    	 System.out.print("���� : ");//�Է� ����
    	 int m = sc.nextInt();
    	 sc.nextLine();
    	 
    	 int sum1 = (k+e+m);  //�հ踦 sum1���� ����
    	 double sum2 = (double)(sum1/3.0);  //����� �Ǽ��� double�� ��ȯ
    	 
    	 System.out.println();
    	 System.out.println("�հ�: "+ sum1 ); 
    	 System.out.println("��� : "+ sum2);
    	 
    	 String result1 = (40<=k )&&(40<=e)&&(40<=m)&&(60<=sum2)? 
    			          "�հ�" : "���հ�" ;  //���׿����� ~�̸� ~ ~�ƴϸ� ~
    	 
    	 System.out.println(result1); 	 
     }
       public void practice8() {
    	   //�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����)  :"); //�Է� ����
    	   
    	   String numId = sc.nextLine(); //���ڿ�String���� ��� , numId ���� ����
    	   char gender = numId.charAt(7); //8��° �ε��� ���� ���� , gender ���� ����
    	   
    	   
    	    String result1 = ( (gender =='1') || (gender =='3' ) )? "����" :
    		            ( ( (gender =='2') || (gender =='4' ) )? "����" : "�߸� �Է��Ͽ����ϴ�.");
    	    //���׿����ڸ� �̿���  
    	    //���ڴ� '1'�̰ų� '3', ���ڴ� '2'�̰ų�'4'
    	    
    	    System.out.println();
    	    System.out.println(result1);
	   
       }
     public void practice9() {
    	 //Ű����� ���� �ΰ��� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
    	 //�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2�ʰ��̸�  true�� ����ϰ�
    	 //�ƴϸ� false�� ����ϼ���
    	 //��, �Է��Ҷ� num1�� num2���� �۾ƾ� ��
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("����1 : "); 
    	 int num1 = sc.nextInt(); //���� ���� 
    	 sc.nextLine();
    	 System.out.print("����2 : "); 
    	 int num2 =sc.nextInt(); //���� ����
    	 sc.nextLine();
    	 
    	 System.out.print("�Է� : "); 
    	 int num3 = sc.nextInt(); //�Ǵٸ� ���� ���� 
    	 sc.nextLine();
    	 
    	 //1. num3(����) <= num1  
    	 //2. num3(�ʰ�) >num2   �̸� true �ƴϸ� false
    	 //3. num1  < num2  �̰� ��� ����?���ص��ǳ�?
    	 
    	 boolean result1 = (num3 <= num1)||(num3 > num2)? true : false;
    	 //true, false����� �������� boolean 
    	 System.out.println();
    	 System.out.println(result1);
     }
       public void practice10() {
    	   //3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true
    	   //�ƴϸ� false�� ����ϼ���
    	   
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("�Է�1 : ");//�Է�����
    	   int num1 = sc.nextInt();//���� ���� ����
    	   sc.nextLine();
    	   System.out.print("�Է�2 : ");
    	   int num2 = sc.nextInt();
    	   sc.nextLine();
    	   System.out.print("�Է�3 : ");
    	   int num3 = sc.nextInt();
    	   sc.nextLine();
           
    	   boolean result = (num1==num2)&&(num2==num3)? true : false;
    	   System.out.println(result);
    	   
       }

}




