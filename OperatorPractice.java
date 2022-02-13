package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		//키보드로 입력 받은 하나의 정수가 양수이면 "양수다",
		//양수가 아니면 "양수가 아니다"를 출력하세요.
		Scanner sc = new Scanner(System.in); //스캐너
		System.out.print("정수 : "); //입력 유도
		int num1 = sc.nextInt();
		
		//결과값이 String이기 때문에 String변수에 대입 
		//삼항연산자 : 결과는 true아니면 false가 나온다.
		String result = (num1 >0 )? "양수다." : "양수가 아니다.";
		System.out.println(result);  //양수다. 양수가 아니다.
	}
	public void practice2() {
		//키보드로 입력 받은 하나의 정수가 양수이면 "양수다"
		//양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요
	   
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수: "); //입력 유도
		 int num1 = sc.nextInt(); //위에 입력하는것은 정수이기 때문에
		 
		 //결과값이 String 이기 때문에 String변수에 대입
		 //삼항연산자 중첩 시킴
		 String result = (num1 >0)? "양수다":( (num1==0)? "0이다": "음수다");
		 System.out.println(result);

	}
	public void practice3() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다"
		//짝수가 아니면 "홀수다" 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : "); //입력 유도
		int num1 = sc.nextInt();
		
		//결과값이 문자열String이기 때문에 String변수에 대입
		//삼항연산자
		//짝수 계산할때는 나머지연산자 모듈러 % 임
		String result1 = ((num1%2)==0 )? "짝수다" : "홀수다";
		System.out.println(result1);		
	}
	public void practice4() {
		//사람들이 사탕 나눠가질 경우
		//인원수 사탕개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수 출력하세요.
		
		Scanner sc = new Scanner(System.in); //스캐너
		System.out.print("인원 수 : "); //입력 유도
		int num1 = sc.nextInt();  //인원수 변수 생성
		System.out.print("사탕 개수: ");
		int num2 = sc.nextInt();
		
		//1.1인당 사탕 개수 : 사탕 개수/인원수
		//2.남는 사탕 개수 : 사탕 개수%인원수
		
		int result1 = num2/num1 ;   //result변수 생성
		int result2 = num2%num1 ;
		
		System.out.println("1인당 사탕 개수: "+result1);
		System.out.println("남는 사탕 개수: "+result2);
		
	}
       public void practice5() {
    	   //키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수값을 화면에 출력하여 확인
    	   //이때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리하세요.
    	   Scanner sc = new Scanner(System.in); //스캐너
    	   System.out.print("이름 : ");//이름 입력 유도
    	   String name = sc.nextLine(); //이름 String 변수
    	   
    	   System.out.print("학년(숫자만) : ");//학년 입력 유도
    	   int grade =sc.nextInt();  // 숫자 int 변수
    	   sc.nextLine();
    	   
    	   System.out.print("반(숫자만) : ");
    	   int group = sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.print("번호(숫자만 ) : ");
    	   int num = sc.nextInt();
    	   sc.nextLine();
    	   
    	   System.out.print("성별 (M/F) : ");  
    	   char gender = sc.nextLine().charAt(0); //문자만 뽑으니까 char로 변수!
     	   String result1 = (gender=='M')? "남학생" : "여학생";  //삼항연산자(~~이면 ~, ~아니면 ~)
    	   
    	   
    	   System.out.print("성적(소수점 아래 둘째 자리까지 ) : " ); 
    	   double score = sc.nextDouble();//실수는 Double
    	   
    	   System.out.println(grade+"학년   "+group+"반   "+num+"번  "+name+" "
    	   		+ ""+result1+"의 성적은  "+score+"이다.  " );	   
       }
	public void practice6() {
		//나이를 키보드로 입력 받아 어린이(13세이하)인지, 청소년(13세초과~19세)인지,
	    //성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: "); //나이  입력 유도
		int age = sc.nextInt(); 
		String result=(age<=13)? "어린이": ( (age<=19)? "청소년":"성인"); //삼항연산자
		
		System.out.println(result);		
	}	

     public void practice7() {
       //국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
       //세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
       //세 과목의 점수와 평균을 가지고 합계 여부를 처리하는데
       //세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일떄 합격, 아니라면 불합격을 출력하세요.
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("국어 : ");//입력 유도
    	 int k = sc.nextInt(); //국어 k변수 생성
    	 sc.nextLine();
    	 
    	 System.out.print("영어 : "); //입력 유도
    	 int e = sc.nextInt();  //영어 e변수 생성
    	 sc.nextLine();
    	 
    	 System.out.print("수학 : ");//입력 유도
    	 int m = sc.nextInt();
    	 sc.nextLine();
    	 
    	 int sum1 = (k+e+m);  //합계를 sum1변수 생성
    	 double sum2 = (double)(sum1/3.0);  //평균을 실수인 double로 변환
    	 
    	 System.out.println();
    	 System.out.println("합계: "+ sum1 ); 
    	 System.out.println("평균 : "+ sum2);
    	 
    	 String result1 = (40<=k )&&(40<=e)&&(40<=m)&&(60<=sum2)? 
    			          "합격" : "불합격" ;  //삼항연산자 ~이면 ~ ~아니면 ~
    	 
    	 System.out.println(result1); 	 
     }
       public void practice8() {
    	   //주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("주민번호를 입력하세요(- 포함)  :"); //입력 유도
    	   
    	   String numId = sc.nextLine(); //문자열String으로 취급 , numId 변수 생성
    	   char gender = numId.charAt(7); //8번째 인덱스 성별 변수 , gender 변수 생성
    	   
    	   
    	    String result1 = ( (gender =='1') || (gender =='3' ) )? "남자" :
    		            ( ( (gender =='2') || (gender =='4' ) )? "여자" : "잘못 입력하였습니다.");
    	    //삼항연산자를 이용함  
    	    //남자는 '1'이거나 '3', 여자는 '2'이거나'4'
    	    
    	    System.out.println();
    	    System.out.println(result1);
	   
       }
     public void practice9() {
    	 //키보드로 정수 두개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
    	 //그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2초과이면  true를 출력하고
    	 //아니면 false를 출력하세요
    	 //단, 입력할때 num1은 num2보다 작아야 함
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("정수1 : "); 
    	 int num1 = sc.nextInt(); //변수 저장 
    	 sc.nextLine();
    	 System.out.print("정수2 : "); 
    	 int num2 =sc.nextInt(); //변수 저장
    	 sc.nextLine();
    	 
    	 System.out.print("입력 : "); 
    	 int num3 = sc.nextInt(); //또다른 정수 변수 
    	 sc.nextLine();
    	 
    	 //1. num3(이하) <= num1  
    	 //2. num3(초과) >num2   이면 true 아니면 false
    	 //3. num1  < num2  이건 어떻게 하지?안해도되나?
    	 
    	 boolean result1 = (num3 <= num1)||(num3 > num2)? true : false;
    	 //true, false결과로 나오려면 boolean 
    	 System.out.println();
    	 System.out.println(result1);
     }
       public void practice10() {
    	   //3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true
    	   //아니면 false를 출력하세요
    	   
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("입력1 : ");//입력유도
    	   int num1 = sc.nextInt();//정수 변수 생성
    	   sc.nextLine();
    	   System.out.print("입력2 : ");
    	   int num2 = sc.nextInt();
    	   sc.nextLine();
    	   System.out.print("입력3 : ");
    	   int num3 = sc.nextInt();
    	   sc.nextLine();
           
    	   boolean result = (num1==num2)&&(num2==num3)? true : false;
    	   System.out.println(result);
    	   
       }

}




