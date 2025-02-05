package Algorithm;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;



import Algorithm.FromYouJung.Apple;
import Algorithm.FromYouJung.Lion;
import Algorithm.FromYouJung.Tiger;

public class OrganizerZone {


	public static void main(String[] args) {

		


		//--------------------------------------------
		//		Ex . 0 ) class 사용법
		//--------------------------------------------
		//			Ex . 0 . 1 ) 객채이름 생성 및 사용
		
//		class Apple{
//			void f1() {
//				System.out.println("Apple Class Print");
//			}
//		}
//		Apple apple = new Apple();
//		apple.f1();
		
		//--------------------------------------------
		//		Ex . 1 ) 주요 단축키 (M)
		//--------------------------------------------
		//		Ex . 2 ) 8개 표준 타입
		//--------------------------------------------	
//			byte	1
//			boolean	1
//			
//			short	2
//			char	2
//			
//			int		4
//			float	4
//			
//			long	8
//			double	8
		
		//--------------------------------------------
		//		Ex . 3 ) int 와 Integer의 차의(타입과 클래스)
		//--------------------------------------------
		
//		int a = 10;			//자바의 표준 타입
//		Integer b = 20;		//Integer 클래스 (대문자)
//		b.byteValue();		//클래스라는 의미
		//int를 Integer로 사용하는 것이 잘 쓰는것
		//box = int -> Integer	unboxing = Integer -> int

		//--------------------------------------------			 
		//		Ex . 4 ) 3가지 for 문
		//--------------------------------------------
		//4 . 1 )
		
//		for (int i = 0; i < 10; i++) {
//
//		}
		//--------------------------------------------
//		//4 . 2 )

//		for (int j = 1; j <= 10; j++) {
//
//		}
		//--------------------------------------------
//		//4 . 3 )
		
//		for (int j2 = -5; j2 <= 5; j2++) {
//
//		}
		
		//--------------------------------------------
		//		Ex . 5 ) for 문으로 구구단 5단 출력
		//--------------------------------------------
//		for (int i = 1; i < 10; i++) {
//			int a = 5 * i;
//			System.out.println(a);
//
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("5 * %d = %d %n", i, i*5);
//		}
//		System.out.printf("%d", b, c) 여기에서 %d = b를 대입, %n = enter
		//--------------------------------------------
		//		Ex . 6 ) for 문으로 1-10 더하기
		//--------------------------------------------
//		int sum = 0;
//		for (int i = 0; i < 11; i++) {
//			sum += i;
//		}System.out.println(sum);
		
		//--------------------------------------------
		//		Ex . 7 ) Scanner 사용법
		//--------------------------------------------		
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println(2);
		//--------------------------------------------
		//7 . 2 )숫자입력 받겠습니다 정의 (이것으로 사용해라)
		
//		 int num = (new Scanner( System.in )).nextInt();
//		 //보통 숫자를 입력하세요를 써준다
//		 System.out.println(num);
		//--------------------------------------------
		//		//7 . 3 )
		
//		 System.out.println((new Scanner( System.in )).nextInt());    //출력함수 속에 입력 함수를 넣을 경우, 입력을 받으려는게 먼저

		//--------------------------------------------
		//		//7 . 3 )입력받은 값의 구구단
		
//		System.out.println("구구단 단계 입력 =");
//		int num = (new Scanner( System.in )).nextInt();
//		for (int i = 1; i <10; i++) {
//			System.out.println (num +" * "+i+" = "+num*i);
//		}	
		
		//--------------------------------------------	
		//		Ex . 8 ) 키보드로부터 숫자를 입력받아 받은값까지의 합을 구하시오 (10 =55)
		//--------------------------------------------
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
////		int num = (new Scanner(System.in)).nextInt();
//		System.out.println(num);
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//--------------------------------------------	
		//		Ex . 9 ) ++a , a++
		//--------------------------------------------
//		int a = 3, b ;
//		b = a++;           //a++대입증가 (무조건 대입이 먼저 일어난 후 1증가)
//		System.out.println(a+" "+b);
//		
//		int c = 3, d;
//		d = ++c;           //++c증가대입 (자기자신을 먼저 증가시키고 난뒤 증가시킨다)
//		System.out.println(c+" "+d);
		//--------------------------------------------	
		//		Ex . 10) 1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
		//--------------------------------------------
//		for (int i = 1; i <= 20; i++) {
//		if ( i % 2 == 0 ) {                              //코드입력할때 스페이스로 연산자가 눈에 들어오게끔 입력
//			System.out.println("호랑이");
//		}else {
//			System.out.println("코끼리");
//		}
//		System.out.println(i);
		//--------------------------------------------
		//EX10-1)			//if else문장은 반드시 삼항연산이 되는지 확인하자
//		for (int i = 1; i <= 20; i++) {
//			System.out.println(( i % 2 == 0 ) ? "호랑이" : "독수리");  //조건에 만족하면 물음표 답 아니면 콜론 답
//			System.out.println(i);
//		}
		//--------------------------------------------
		//EX10-2)			//삼항연산
//		int a = 10;
//		if ( 3 > 2 ) {
//			a = a + 1;
//		}else {
//			a = a - 1;
//		}
//		a = ( 3 > 2 ) ? a + 1 : a - 1;    //실전코드번호에서는 바뀔수만 있으면 삼항연산을 사용한다
		
		//--------------------------------------------	
		//		Ex . 11) 3의 4승을 구하는 프로그램
		//--------------------------------------------
//		int sum = 1;
//		for (int i = 0; i < 6; i++) {
//			sum = sum * 3;
//			System.out.printf("%d ** %d = %d\n", 3, i+1, sum);       //6번을 돌리고 결과값을 맞춰준다
//		}
		
		//--------------------------------------------
		//	6!계
		
//		int sum = 1;
//		for (int i = 1; i <= 6; i++) {
//			sum = sum * i;
//			System.out.println(sum);       //6번을 돌리고 결과값을 맞춰준다
//		}
//		System.out.println("-------------------------------");
//		
//		int sum1 = 1;                          //시작값을 정해주는것 0값으로 시작이 아닐경우 무조건 1부터
//		for (int i = 0; i < 6; i++) {          //0값이 나오는결과가 아니면 1부터 시작 (돌리는 횟수의 범위를 입력하는거지 값의 범위가 아님)
//			sum1 = sum1 * (i+1);
//			System.out.println(sum1);       //6번을 돌리고 결과값을 맞춰준다
//		}
		
		//--------------------------------------------	
		//		Ex . 12) 데이터 교환 swap프로그램
		//--------------------------------------------
		
//		int a = 10, b = 20;
//		int temp;
//		System.out.println(a + " " + b);
//		temp = a;         //temp는 10이다
//		a = b;            //a는 20
//		b = temp;         //b는 10
//		System.out.println(a + " " + b);
		//--------------------------------------------	
		//		Ex . 13) Random프로그램
		//--------------------------------------------
		//1.
		
//		Random rnd = new Random();
//		 int r = rnd.nextInt(100);      //0-99까지가 랜덤하게 나온다
//		System.out.println(r);
//		
//		System.out.println(rnd.nextInt(100));       //
//		
//		System.out.println("-------------------------------");
//		for (int i = 0; i < 10; i++) {
//			r = rnd.nextInt(100);
//			System.out.println(r);
//		}
//		System.out.println("-------------------------------");     //separate구분하여 사용하는 출력 코드
//		for (int i = 0; i < 10; i++) {
//			System.out.println(rnd.nextInt(100));      //변수를 받지 않고 바로 출력
//		}
		
		
//		for(int i = 0; i <10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i <10; i++) {
//			System.out.print(i + " ");
//		} System.out.println();
//		System.out.println("Tiger");
//
//		for(int i = 0; i <10; i++) {
//			System.out.printf("%03d", i);
//		}System.out.println();
//		System.out.println("Tiger");
		
//		int a = 0, b = 1, c;
//		for(int i = 1; i <=10; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//			
//			System.out.print(c +" ");
//		}System.out.println();
		//--------------------------------------------
		//랜덤으로 뽑은 숫자 앞자리와 뒷자를 두개 더한 값을 구하시오
		//--------------------------------------------
		//랜덤으로 뽀은 숫자들의 앞자리만 더한 값과 뒷자리만 더한 값을 구하시오
		//--------------------------------------------
		// "/10" "%10" 
		
//		int a = 0, b = 0, r;
//		for(int i = 0; i < 6; i++) {
//			Random rnd = new Random();
//			r = rnd.nextInt(100);      
//			
//			int x = r / 10;
//			int y = r % 10;
//			
//			a = a + x;
//			b = b + y;
//			
//			}
//		System.out.println(a + " " + b);
		//--------------------------------------------
		// 중복 x, 반듯이 5개 숫자를 뽑는다, 배열 x 
		//--------------------------------------------
		
//		for(int i = 0; i < 5; i++) {
//			Random rnd = new Random();
//			int r = rnd.nextInt(900)+100;
//			int a = r/100;
//			int b = r%100/10;
//			System.out.println(a + " " + b);
//			int c = r%100%10;
//			System.out.println(a + " " + b + " " + c);
//			if(a == b || b == c || a == c) {
//				System.out.println("호랑이");
//				i = i--;
//				continue; 
//
//			}System.out.println(r);

//		int count = 0;	//count 대신 city 라고 적기도함.
//		while(true) {
//			Random rnd = new Random();
//			int r = rnd.nextInt(900)+100;
//			int a = r/100;
//			int b = r%100/10;
//			//				System.out.println(a + " " + b);
//			int c = r%100%10;
//			//				System.out.println(a + " " + b + " " + c);
//
//			if(a == b || b == c || a == c) {
//				//					System.out.println("호랑이");
//				continue; 
//			}
//			System.out.println(r);
//			count ++;
//			if (count == 5) {
//				break;
//				
//			}
		//--------------------------------------------	
		//		Ex . 14) Integer.MAX_VALUE, Short.MAX_VALUE...(8개 단위 다 쓸수있음)
		//--------------------------------------------
//		System.out.println(Integer.MAX_VALUE);
//		for(int i = 0; i < 10; i++) {
//			Random rnd = new Random();
//			int r = rnd.nextInt(Integer.MAX_VALUE);
//			System.out.println(r);
//		}
		//--------------------------------------------
//		EX14.1) 랜덤으로 뽑은 값을 한자리씩 더한 값을 구하라
//		//정답
		
//		Random rnd = new Random();
//		int num = rnd.nextInt(Integer.MAX_VALUE);
//
//		System.out.println(num);
//
//		int sum=0;
//
//		while(true) {
//
//			int a=num%10;
//			num=num/10;
//			sum+=a;
//
//			System.out.println(a);
//
//			if(num==0) {
//				break;
//			}
//		}
//
//		System.out.printf("각 자리 수의 합은 : %d ",sum);
		//--------------------------------------------	
		//		Ex . 15) 1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
		//--------------------------------------------

		// 파이널과 클래스의 만남 상속 금지
//		Class Tiger { }
//		Class Lion { } extend Tiger{ }
//
//		final Class Tiger {}
//		Class Lion { } extend Tiger{ }  //에러 발생
//
//
//
//		//파이널과 함수의 만남 오버라이딩 금지 
//		Class Tiger { 
//			Void f1( ){ }
//		} 
//		Class Lion { } extend Tiger { 
//			Void f1( ) { } }
//
//		Class Tiger { 
//			Void f1( ){ }
//		} 
//		final Class Lion { } extend Tiger { 
//			Void f1( ) { } }
//
//		int a = 0;
//		int b = 0;
//		for (int i = 0; i < 10; i++) {
//			Random rnd = new Random();
//			int num = rnd.nextInt(2);
//
//			if (num == 0) {
//				a = a + 1;
//				System.out.print(" O ");
//			} else {
//				b = b + 1;
//				System.out.print(" X ");
//			} 
//		}
//		System.out.println();
//		System.out.println("O = " + a + " X = " + b);
//
//		int a = 0;
//		int b = 0;
//		for (int i = 0; i < 10; i++) {
//			Random rnd = new Random();
//			int num = rnd.nextInt(2);
//
//			if (num == 0) {
//				a = a + 1;
//				System.out.print(" O ");
//			} else {
//				b = b + 1;
//				System.out.print(" X ");
//			} 
//		} 
//		System.out.println();
//		System.out.println(a + " " + b);
//
//		Random rnd = new Random();
//		int oContinue1 = 0;
//		int oContinue2 = 0;
//		int xContinue1 = 0;
//		int xContinue2 = 0;
//		for (int i = 0; i < 10; i++) {
//			int num = rnd.nextInt(2);
//			if (num == 0) {
//				System.out.print('O');
//				oContinue2++;
//				xContinue2 = 0;
//				if (oContinue2 > oContinue1) {
//					oContinue1 = oContinue2;			
//				}
//			} else {
//				System.out.print('X');
//				xContinue2++;
//				oContinue2 = 0;
//				if (xContinue2 > xContinue1) {
//					xContinue1 = xContinue2;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println(oContinue1 + " " + xContinue1);
//
//	}			
		//--------------------------------------------
		//			EX16
		//--------------------------------------------
//	class Apple{
//		void f1() {
//			System.out.println("호랑이");
//		}
//		void f2() {
//			System.out.println(this);
//		}
//		int f3() {
//			return 100;
//		}
//		String f4() {
//			return "Tiger";
//		}
//		Apple f5() {
//			return this;
//		}
//		void pretty() {
//			System.out.println("pretty");
//		}
//	}
//	Apple a1 = new Apple();
//	Apple a2 = new Apple();
//	Apple a3 = new Apple();
//
//	System.out.println(a3);
//	//System.out.println(a2.hashCode());	//10진수 표현
//	//System.out.println(Integer.toHexString(a2.hashCode())); 	//민증번호 확인
//	a3.f5().f1();
//	a3.f1();
//	a3.f5().f5().f1();
//	a3.f5().pretty();
//
//
//	class Tiger {
//		//생성자 함수(생성자의 이름은 클래스 이름과 동일해야한다)(함수 오버로딩(이름이 같다) 가능)
//		//(함수개수 인수개수가 같더라도 타입이 다르면 함수 오버로딩 가능)
//		//생성자 함수는 프로그래머가 임의로 호출 불가
//		//생성자 함수는 객채가 생성될때 자동 호출
//		Tiger() {
//			System.out.println("1");
//		}
//		Tiger(int a) {
//			System.out.println("2");
//		}
//		//Tiger(int a, b){} 요롷게 실수를 많이함. 방금 했었음.
//		Tiger(int a, int b){
//			System.out.println("3");
//		}
//		Tiger(int a, String b, Tiger c){
//			System.out.println("4");
//		}
//		Tiger(float a){
//			System.out.println("5");
//		}
//		Tiger(short a){
//			System.out.println("6");
//		}
//		//맴버변수 혹은 필드 
//		//맴버함수 혹은 메소드
//		//
//	}
//	Tiger t1 = new Tiger();
//	t1.Tiger(); 이렇게는 쓸수없다 왜냐면 호출할수 없거든
//	void 는 리턴값을 받아줄떄 
//
//	생성자 함수는 리턴 값을 가질수 없다ㅏㅏㅏㅏ
//	return10; 이런거 불가능하다고
//	Tiger t2 = new Tiger(10);
//	Tiger t3 = new Tiger(1, 11);
//	Tiger t4 = new Tiger(1, "r", null);
//	Tiger t5 = new Tiger(3.14f);
//	//float type 같은 경우 3.14f 라고 불러야됨(뒤에 f안빼먹게 주의!)
//	Tiger t6 = new Tiger ((short)100);
//	//this is called 'type casting'
//	System.out.println(7);
//	Tiger t7 = new Tiger();
//	System.out.println(8);
//	int x = 10, y = 20;
//	Tiger t8 = new Tiger(x, y);
//	String s1 = new String("wheee");
//	Tiger t9 = new Tiger(x*y, s1, t8);
//	Tiger t10 = new Tiger(x*y, s1, new Tiger());
//
//
//	class Lion{
//		Lion() {
//			System.out.println(" - ");
//		}
//		Lion(int a){
//			System.out.println(" --- ");
//		}
//		Lion(int a, int b){
//			System.out.println(" ----- ");
//		}
//		Lion(int a, String b, Lion c){
//			System.out.println(" ------- ");
//		}
//		Lion(float a){
//			System.out.println(" --------- ");
//		}
//		Lion(short a){
//			System.out.println(" ------------ ");
//		}
//
//	}
//	Lion l1 = new Lion();
//	Lion l2 = new Lion(1);
//	Lion l3 = new Lion(1,1);
//	Lion l4 = new Lion(1, "s", null);
//	Lion l5 = new Lion(3.14f);
//	Lion l6 = new Lion((short)3.14);
//
//
//	class Tiger {
//		int a;
//		String b;
//		int c = 20;
//		String d = "호랑이";
//		String e = new String("코끼리");
//
//		// 필드 초기화가 목적, 맴버 변수 초기화가 목적
//		Tiger(){
//			a = 100;
//			b = "독수리";
//			c = 3000;
//			d ="앵무새";
//			e = "달걀";
//		}							// 인수전달이 없는 생성자를 default 생성자라고 한다
//
//	}
//	Tiger t1 = new Tiger();
//	System.out.println(t1.a);
//	System.out.println(t1.b);
//	System.out.println(t1.c);
//	System.out.println(t1.d);
//	System.out.println(t1.e);
//
//	// b = 디폴드 값으로 null이 나온다
//
//
//
//	class Tiger{ //클래스(비행기 설계도)
//		int x = 100, y = 100; 
//		Tiger(){ //생성자
//		}
//		Tiger(int a, int b){
//			x  = a; //x = 필드 a = 인수
//			y = b;
//		}
//		Tiger(int c){
//			x = c;
//			y = c;
//		}
//	}
//	Tiger t1 = new Tiger(); //객채(비행기 이름 t1)
//	System.out.println(t1.x + " " + t1.y);
//	Tiger t2 = new Tiger();
//	System.out.println(t2.x + " " + t2.y);
//	Tiger t3 = new Tiger(200, 300);
//	System.out.println(t3.x + " " + t3.y);
//	Tiger t4 = new Tiger(500, 600);
//	System.out.println(t4.x + " " + t4.y);		
//	Tiger t5 = new Tiger(700);
//	System.out.println(t5.x + " " + t5.y);	

	
//	----------------------------201023
//	 String s1 = String.format("무궁화꽃이%d피었습니다%s", 10, "많이");
//	 System.out.println(s1);
//	 
//	 String s2 = "ㅁㅁㅁㅁㅁ".format("무궁화꽃이%d피었습니다%s", 200, "조금");
//	 System.out.println(s2);
 
//	 싱글톤 패턴 예제 만들어서 월요일ㅓㅕㅗ
		
		
		
	
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		if (input >= 90) {
//			System.out.println("a학점");
//		}
//		else if(input >= 80) {
//			System.out.println("b학점");
//		}
//		else if(input >= 70) {
//			System.out.println("c학점");
//		}
//		else if(input >= 60) {
//			System.out.println("a학점");
//		}
//		else if(input <= 60) {
//			System.out.println("f학점");
//		}
//		Random rnd = new Random();
//		int a = rnd.nextInt(5)+1;
//		System.out.println(a);
//		int a = 0;
//		while(a < 10) {
//			a += 1;
//			System.out.println(a);			
//		} System.out.println("Tiger");
		
//		int a = 0;
//		while(a < 10) {
//			a += 1;
//			if(a == 3) {
//				continue;
//			}if(a == 6) {
//				break;
//			}System.out.println(a);
//		}System.out.println("Tiger");

//		int a = 0;
//		while(true) {
//			a += 1;
//			if(a == 5) {
//				System.out.println("프로그램이 종료");
//				break;
////				System.out.println(123123);
//			}
//
//		}
//		System.out.println("종료");
		//--------------------------------------------	
//		--------------------------23의 우박수를 구하시오
//		int num = 23;
//		
//		while(true) {
//			if(num == 1) {
//				break;
//			}
//			if (num % 2 == 1) {
//				num = num *3 + 1;
//			}else {
//				num = num / 2;
//			}
//
//			System.out.println(num);
//		}
//		System.out.println(num);


		//삼항연산
//		int a = 23;
//		while(true) {
//			if (a == 1) {
//				break;
//			}
//			if ( a % 2 == 1 ) {
//				a = a * 3 + 1;
//			}else {
//				a = a / 2;
//			}
//			a = ( a % 2 ==1 ) ? a * 3 + 1 : a / 2;
//			System.out.println(a);
//		}
//		System.out.println(a);

		//--------------------------------------------	
		//		Ex . 18) 2중 for 문
		//--------------------------------------------
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print("[" + i + " " + j + "]");
//			} System.out.println();
//		}
		
//		for (int i = 0; i < 3; i++) {
//			int k = 0;
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", k);
//				k ++;
//			}System.out.println();
//		}
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0, k = 0; j < 4; j++, k ++) {
//				System.out.printf("%02d ", k);
//			}System.out.println();
//		}
		//--------------------------------------------
		//	아래와 같이 결과가 나오게 하시오
		//--------------------------------------------
		//		4 9 8 3  24
		//		1 9 0 7  17
		//		9 4 3 4  20
		//--------------------------------------------
//		Random rnd = new Random();
//		for (int i = 0; i < 3; i++) {
//			int sum = 0;
//			for (int j = 0; j < 4; j++) {
//				int a = rnd.nextInt(10);
//				System.out.print(a + " ");
//				sum = sum + a;
//			}System.out.println(" " + sum);
//		}
	
//		System.out.println(65);
//		System.out.println((char) 65);
//		System.out.println((int) 'A');
//		for (int i = 0; i < 26; i++) {
//		//	System.out.print((char)(65+i) + " ");
//			System.out.print((char)('A' + i)+ " ");
//		}
		
		//	가로 3줄 세로 4줄 랜덤으로 알파벳을 뽑으시오
//		Random rnd = new Random();
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				int a = rnd.nextInt(25)+65;
//				System.out.print((char)(a)+ " ");
//			}System.out.println();
//		}

//		Random rnd = new Random();
//		int b = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				b = rnd.nextInt(26);
//				System.out.printf("%c ", (char)('A' + b));
//			}System.out.println();
//			
//		}

		//--------------------------------------------	
		// LinkedList<Integer> li	CRUD 의 C
		//	<> = 컨테이너		li = 야쿠르트아줌마
		//--------------------------------------------	
		
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		System.out.println(li.size());
//		li.add(10);
//		li.add(20);
//		System.out.println(li.size());
//		for (int i = 0; i < 10; i++) {
//			li.add(i);
//			Integer data = li.get(i);
//			System.out.println(data);
//			System.out.print(li.get(i)+ " ");
//		}
//		System.out.println();
//		System.out.println(li.size());
//		for (int i = 0; i < li.size(); i++) {
//			Integer data = li.get(i);
//			System.out.print(data + " ");
//		}
//
//		//--------------------------------------------	
//		//CRUD 의 R
//		//--------------------------------------------	
//		
//		li.add(0, 77);
//		li.add(3, 88);
//		for (int i = 0; i < li.size(); i++) {
//			Integer data = li.get(i);
//			System.out.print(data + " ");
//		}System.out.println();
//		
//		//--------------------------------------------	
//		//CRUD 의 U
//		//--------------------------------------------	
//		
//		li.set(3, 99);
//		for (int i = 0; i < li.size(); i++) {
//			Integer data = li.get(i);
//			System.out.print(data + " ");
//		}
//		
//		//--------------------------------------------	
//		//CRUD 의 D
//		//--------------------------------------------	
//		
//		li.remove(7);
//		for (int i = 0; i < li.size(); i++) {
//			Integer data = li.get(i);
//			System.out.print(data + " ");
//		}System.out.println();
//		
//		//--------------------------------------------	
//		//foreach 문
//		//--------------------------------------------	
//
//		for (Integer data : li) {
//			System.out.print(data + " ");
//		}
		
		
//	class Apple{
//		int x, y;
//		Apple(){
//		}
//		Apple(int a, int b){
//			x = a;
//			y = b;
//		}
//		void show() {
//			System.out.println(x + " " + y);
//		}	
//	}
//	Apple a1 = new Apple();
//	a1.show();
//	a1.x = 100;
//	a1.y = 200;
//	a1.show();
//
//	Apple a2 = new Apple(77, 88);
//
//	a2.show();



//	class Apple {
//		int x, y;
//		Apple(){
//			
//		}
//		Apple(int a, int b){
//			x = a;
//			y = b;
//			
//		}
//		void show() {
//			System.out.println(x + " " + y);
//		}
//	}
//		Apple a1 = new Apple();
//		a1.show();
//		a1.x = 100;
//		a1.y = 200;
//		a1.show();
//		Apple a2 = new Apple(77, 88);
//		a2.show();
//
//		LinkedList<Apple> oli = new LinkedList<Apple>();
//		oli.add(a1);
//		oli.add(a2);
//		System.out.println(oli.size());
//		for (int i = 0; i < 5; i++) {
//			Apple ta = new Apple();
//			ta.x = i * 10;
//			ta.y = i * 20;
//			oli.add(ta);
//		}
//		System.out.println(oli.size());
//	
//		for (int i = 0; i < 5; i++) {
//			Apple ta = new Apple(i*30, i*40);
//			oli.add(ta);
//		
//		}
//		System.out.println(oli.size());
//		for (int i = 0; i < 5; i++) {
//			oli.add(new Apple(i * 50, i * 60));
//		
//		}
		
		//--------------------------------------------	
		// 보는 방법들 CRUD 의 R
		//--------------------------------------------	
//		System.out.println(oli.size());
//		for (int i = 0; i < oli.size(); i++) {
//			System.out.println(oli.get(i).x + " " + oli.get(i).y);
//			
//		}
//		System.out.println("--------------------------");
//		for (int i = 0; i < oli.size(); i++) {
//			oli.get(i).show();
//		}
//		for (Apple data : oli) {
//			data.show();
//		}

//		System.out.println(oli.size());
//		for (int i = 0; i < oli.size(); i++) {
//			System.out.println(oli.get(i).x + " " + oli.get(i).y);
//			
//		}System.out.println("--------------------------");
//		for (int i = 0; i < oli.size(); i++) {
//			oli.get(i).show();
//			
//		}System.out.println("--------------------------");
//		for (Apple data : oli) {
//			data.show();
//		}System.out.println("--------------------------");
//
//		//--------------------------------------------	
//		// 제거 방법들 CRUD 의 D 리무브안에 숫자를 넣어줘라 지우고싶은
//		//--------------------------------------------	
//		oli.remove(3);
//		for (Apple data : oli) {
//			data.show();
//		}System.out.println("--------------------------");
//		//--------------------------------------------	
//		// 업뎃 방법들 CRUD 의 U
//		//--------------------------------------------
//		oli.set(2, new Apple(888, 999));
//		for (Apple data : oli) {
//			data.show();
//		}

		//--------------------------------------------	
		//		Ex . ) sin 
		//--------------------------------------------
		
//		System.out.println(Math.sin(3.14*30.0/180.0));
//		for (int i = 0; i < 37; i++) {
//			System.out.println(Math.sin(Math.PI*(i*10)/180.0));
//		}
//		System.out.println(Math.PI);
		//--------------------------------------------	
		//		Ex . ) 이렇게 정렬하는것을 선택정렬
		//--------------------------------------------
//		int [] ar = {5, 1, 8, 7, 2, 9, 3 ,6};
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}	
//		System.out.println();
//		System.out.println("--------------");
//		
//		for (int i = 0; i < ar.length - 1; i++) {
//		
//			for (int j = i + 1; j < ar.length; j++) {
////				System.out.print(i + "" + j + " ");
//				if(ar[i] < ar[j]) {	//바꾸어야 된다면 부등호 변경
//					int temp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = temp;
////					System.out.print(ar[i] + " ");
//				}
//			}
//			
////			for (int k = 0; k < ar.length; k++) {
////				System.out.print(ar[k] + " ");
//		}
//		System.out.println();
//		System.out.println("----RESULT----");
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < ar.length / 2; i++) {
//			int temp = ar[i];	
//			ar[i] = ar[ar.length - 1 - i];
//			ar[ar.length - 1 - i] = temp;
//		}
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		
//		System.out.println();
//		System.out.println("--------------");
//		System.out.println(ar.length);
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print("[" + j + " " + (j + 1) + "]");
//			}
//			System.out.println();
//			System.out.println("-------------------------");
//		}
		//--------------------------------------------	
		//버블정렬
		//		[0, 1][1, 2][2, 3][3, 4][4, 5]
		//		[0, 1][1, 2][2, 3][3, 4]
		//		[0, 1][1, 2][2, 3]
		//		[0, 1][1, 2]
		//		[0, 1]
		//--------------------------------------------	
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.printf("[%d, %s]", j, j+1);
//			}
//			
//			System.out.println();
//			System.out.println("-------------------------");
	
		//--------------------------------------------	
		//		[1 2][2 3][3 4][5 6][6 7][7 8][8 9][9 10] 
		//--------------------------------------------			
//		int [] ar = {5, 1, 8, 7, 2, 9, 3 ,6};
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar.length - 1 - i; j++) {
//				if (ar[j] > ar[j + 1]) {
//					int t = ar[j];
//					ar[j] = ar[j + 1];
//					ar[j + 1] = t;
//			}
//			
////			System.out.println();
////			System.out.println("-------------------------");
//		}
//	
//		}for ( int i : ar) {
//			System.out.print("[" + i + " " + (i + 1) + "]");
//			
//		}
		//--------------------------------------------	
		//		08 	09 	10 	11 	
		//		04 	05 	06 	07 	
		//		00 	01 	02 	03 
		//--------------------------------------------	
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d \t", i * 4 + j);
//			}System.out.println();
//			
//		}
		
//		for (int i = 0; i < 3; i++) {
//			int a = 2 - i;
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d \t", a * 4 + j);
//				
//			}System.out.println();
//			
//		}
		//--------------------------------------------	
		//		11 	10 	09 	08 	
		//		07 	06 	05 	04 	
		//		03 	02 	01 	00 
		//--------------------------------------------		
//		for (int i = 0; i < 3; i++) {
//			int a = 2 - i;
//			for (int j = 0; j < 4; j++) {
//				int b = a * 4 - j + 3;
//				System.out.printf("%02d \t", b);
//				
//			}System.out.println();
//			
//		}
		
//		for (int i = 0; i < 3; i++) {
//			int a = 3 - i;
//			for (int j = 0; j < 4; j++) {
//				int b = a * 4 - j - 1;
//				System.out.printf("%02d \t", b);
//				
//			}System.out.println();
//			
//		}
		//--------------------------------------------	
		//		Ex . 다이아몬드 
		//--------------------------------------------
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = -2 + i;
//				int jj = -2 + j;
//				ii = Math.abs(ii);
//				jj = Math.abs(jj);
//				System.out.printf("[%+d %+d]",ii, jj);
//			}System.out.println();
//		}System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = -2 + i;
//				int jj = -2 + j;
//				ii = Math.abs(ii);
//				jj = Math.abs(jj);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = Math.abs(-2 + i);
//				int jj = Math.abs(-2 + j);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
//		for (int i = -2; i <= 2; i++) {
//			for (int j = -2; j <= 2; j++) {
//				int ii = Math.abs(i);
//				int jj = Math.abs(j);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
////		int num = 9;
////		int hn = num/2;
////		for (int i = -hn; i <= hn; i++) {
////			for (int j = -hn; j <= hn; j++) {
////				int ii = Math.abs(i);
////				int jj = Math.abs(j);
////				if (ii + jj <= hn) {
////					System.out.print("* ");
////				}else {
////					System.out.print("  ");
////				}
////				
////				
////			}System.out.println();
////		}System.out.println();
//		int num = 9;
//		int hn = num/2;
//		for (int i = -hn; i <= hn; i++) {
//			for (int j = -hn; j <= hn; j++) {
//				int ii = Math.abs(i);
//				int jj = Math.abs(j);
//				System.out.print(ii + jj <= hn? "* " : "  ");
//			}System.out.println();
//		}System.out.println();
		
		//--------------------------------------------	
		//		Ex . 랜덤 3개 출력 후 중간값을 출력하라
		//--------------------------------------------
		
		// 1차 버전
//		Random rnd = new Random();
//		for (int i = 0; i < 20; i++)
//		{
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//
//			if (a > b) { // a는 최대 아니면 중간 : 왜냐하면 a가 최소가 아니니까.
//				if (a > c) { // a는 최대
//					m = Math.max(b, c);
//				}
//				else { // 중간
//					m = a;
//				}
//			}
//			else {// (a<b) a는 최소 아니면 중간
//				if (a < c) { // a는 최소
//					m = Math.min(b, c);
//				}
//				else {
//					m = a;
//				}
//			}
//			System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//		}


//		// 2차 버전
//		Random rnd = new Random();
//		for (int i = 0; i < 20; i++)
//		{
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//
//			if (a > b) {
//				m = (a > c) ? Math.max(b, c) : a;
//			}
//			else {
//				m = (a < c) ? Math.min(b, c) : a; 
//			}
//			System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//		}
//
//		// 3차 버전
//		Random rnd = new Random();
//		for (int i = 0; i < 20; i++)
//		{
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//
//			m= (a > b)
//					? (a > c) ? Math.max(b, c) : a
//							: (a < c) ? Math.min(b, c) : a;
//
//							System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//		}

//		int  a = 10, b = 30, c = 20;
//		int  a = 20, b = 10, c = 30;
//		int  a = 20, b = 30, c = 10;
//		int  a = 30, b = 10, c = 20;
//		int  a = 30, b = 20, c = 10;
		//--------------------------------------------	
		//		Ex . 함수 만들기
		//--------------------------------------------
		// 전달인수 없고 리턴 없다
		// 전달인수 있고 리턴 없다
		// 전달인수 없고 리턴 있다
		// 전달인수 있고 리턴 있다
//		class Function{
//			
//			Function(){
//			}
//			void f01() {
//				System.out.println(1);
//			}
//			void f02(int a) {
//				System.out.println(2);
//			}
//			int f03() {
//				return 300;
//			}
//			int f04(int a) {
//				return 400;
//			}
//						
//		}
//		Function func = new Function();
//		
//		func.f01();
//		func.f02(10);
//		System.out.println(func.f03());
//		System.out.println(func.f04(10));
		
//			void func05(int a, int b, int c) {
//				int sum = a * b + c;
//				System.out.println(sum);
//				System.out.println(a * a + b * b + c * c);
//			}

//			void func07() {
//				System.out.println(1);
//				return;
////				System.out.println(2);
//			}
//		}
//		Function func = new Function();
//		
//		func.func08();
		
//			//이렇게 하면 안된다.
//			void func08(int a, int b, int c = 10, int d = 20) {
//				System.out.println(a + " " + b + " " + c + " " + d);
//			}
//		}
//		Function func = new Function();
//
//		func.func08(1, 2);
//		func.func08(1, 2, 3);
//		func.func08(1, 2, 3, 4);

//			void func09(String... a) {
//				for (String data : a) {
//					System.out.println(data);
//				}
//			} // void end
//		} //class Function end
//			Function func = new Function();
//			
//			func.func09("aaa");


//			void func10(int a, int b, int...c) {
//				System.out.println(a + " " + b);
//				for (int data : c) {
//					System.out.println(data);
//				}
//			} // void end
//		} //class Function end
//		Function func = new Function();
//		
//		func.func10(1, 2);
//		func.func10(1, 2, 3);
//		func.func10(1, 2, 100);
		//--------------------------------------------		
		// 문제 1. 몇초니 그 결과를 result로 받았을때 result를 가지고 다시 역으로 뽑아주세요
		//--------------------------------------------	

//		int h = 2, m = 43, s = 27;
//		
//		m = m + h * 60;
//		int result = s + m * 60;
//		System.out.println(result + " seconds");
//		int ns = result % 60;
//		int nm = (result - ns) / 60 % 60;
//		int nh = (result - ns - nm * 60) / 3600; 
////		System.out.println(nh + "h " + nm + "m " + ns + "s ");
//		System.out.printf("%d h %d m %d s", nh, nm, ns);
				
		
		// 문제 2. 0부터 100까지 숫자를 랜덥으로 5개 출력해서
//		Random rnd = new Random();
//		for (int i = 0; i < 5; i++) {
//			int r = rnd.nextInt(100);
//			int result = ((r / 4) + 1) * 4;
//			if (r % 4 == 0) {
//				System.out.printf("%02d >> %02d \n", r, r);
//			}else{
//				System.out.printf("%02d >> %02d \n", r, result);
//			}
//		}

//		class Apple{
//			Apple(){
//				System.out.println("생성자 콜");
//				System.out.println(this.hashCode());
//			}
//			
//		}
//		Apple a = new Apple();
//		System.out.println(a.hashCode());
//		Apple b = new Apple();
//		System.out.println(b.hashCode());
//		Apple c = new Apple();
//		System.out.println(c.hashCode());
//		Apple d = new Apple();
//		System.out.println(d.hashCode());
		
		
//		class Apple{
//			int a, b;
//			Apple(int x, int y){
//				this.a = a;
//				this.b = b;
//	
//			}
//		
//			
//		}
//		Apple a = new Apple(30, 40);
//		System.out.println(a.a + " " + a.b);
		//--------------------------------------------	
		//		Ex . 
		//		단축키 alt + shift + s + o -> alt + g
		//--------------------------------------------
//		class Apple{
//			int money;
//			String name;
//			Apple(int money, String name) {
//				this.money = money;
//				this.name = name;
//			}
			
		
		
	}
}

//--------------------------------------------	
//		Ex . 10) 1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
//--------------------------------------------

//--------------------------------------------	
//		Ex . 10) 1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
//--------------------------------------------



