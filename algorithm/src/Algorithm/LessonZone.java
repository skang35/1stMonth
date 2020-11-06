package algorithm;



public class LessonZone {

	static void f2() {
		System.out.println(2);
	}
	
	public static void main(String [] args) {//클래스
		/*		class Apple{
	//생성자	
		Apple(){
		}
		Apple(int a){
		}
	}
	//객채
	Apple a1 = new Apple();
	Apple a2 = new Apple(10);

	//클래스 시작
	class Apple{
		//필드는 생성자 위에 작성
		//생성자
		Apple(){

		}
		//함수는 생성자 밑에 작성
		//void func01() = 함수원형 function prototype
		void func01() {
			System.out.println(1);
		}
		void func02(int a) {
			System.out.println(a);
		}
		int func03() {
			return 200;

		}
		int func04(int a) {
			return a*7;
		}
	}//클래스 끝
	//객채
	Apple a1 = new Apple();
	a1.func01();
	a1.func02(100);
	int num = a1.func03();
	System.out.println(num);

}

	public static void main(String[] args) {
	day01();
		//클래스
		class Apple{
		//생성자	
			Apple(){
			}
			Apple(int a){
			}
		}
		//객채
		Apple a1 = new Apple();
		Apple a2 = new Apple(10);

		//클래스 시작
		class Apple{
			//필드는 생성자 위에 작성
			//생성자
			Apple(){

			}
			//함수는 생성자 밑에 작성
			//void func01() = 함수원형 function prototype
			void func01() {
				System.out.println(1);
			}
			void func02(int a) {
				System.out.println(a);
			}
			int func03() {
				return 200;

			}
			int func04(int a) {
				return a*7;
			}
		}//클래스 끝
		//객채
		Apple a1 = new Apple();
		a1.func01();
		a1.func02(100);
		int num = a1.func03();
		System.out.println(num);
		int count;
		count = a1.func03();
		System.out.println(count);
		System.out.println(a1.func03()*100);
//		System.out.println(a1.func01);
		System.out.println(a1.func04(7));
		int y;
		y = a1.func04(8);
		System.out.println(y);


		//연습 클래스
		class Tiger{
			//필드
			//생성자
			Tiger(){

			}

			//함수
			void func01() {
				//주고 x 받고 x
				System.out.println(1);
			}
			void func02(int a) {
				//주고 o 받고 x
				System.out.println(2);
			}
			int func03() {
				//주고 x 받고 o
				return 100;
			}
			int func04(int a) {
				//주고 o 받고 o
				return 200;
			}

		}
			//객체

		Tiger a1 = new Tiger();
		a1.func01();
//		System.out.println(a1.func01());
		a1.func02(10);
		System.out.println("----nope-----");
		a1.func03();
		a1.func04(1);
		System.out.println(a1.func03());
		System.out.println(a1.func04(1));
		System.out.println("----nope-----");

		int count;
		count = a1.func03();
		System.out.println(count);
		System.out.println(a1.func03()*100);
		System.out.println(count*100);
		System.out.println("----nope-----");

		int x;
		x = a1.func04(2);
		System.out.println(x);
		System.out.println(a1.func04(2)*200);
		System.out.println(x*300);


		class Apple{
			Apple(){

			}
			void func01() {
				System.out.println(1);
			}
			void func02(int a) {
				System.out.println(2);
			}
			//int를 넣으면 리턴값이 있어야지 짜샤
			int func03() {
				return 3;

			}
			int func04(int a) {
				return 4;
			}
			void func05(int a, int b) {
				System.out.println(5);
			}
			void func06(int a, int b, int c) {
				System.out.println(6);
				System.out.println(a * b + c);
			}
			void func07(int count, String s) {
				for(int i = 0; i < count; i++) {
					System.out.println(s);
				}

			}
			void func08() {
				System.out.println(8);
				func01();
				func09();
			}
			void func09() {
				System.out.println("Bravo");
//				func08();
			}
			void func10() {
				System.out.println(10);

			}
			void func10(int a) {
				System.out.println(88);

			}
			void func10(int a, int b) {
				System.out.println(1188);
				System.out.println(a+b);
			}
			int func11(int a, int b) {
				int c = a * a + b * b;
				return c;
			}
			void func12(int num) {
				System.out.println(12);
				if(num > 0) {
					if(num%2 == 0){
						System.out.println("Even number");
					}else{
						System.out.println("Odd Number");
					}

				}else {
					System.out.println("nope");
				}

			}
			void func13(int num) {
				System.out.println(13);
				if(num < 0) {
					System.out.println("Nope Negative Number");
					return;
				}
				if(num%2 == 0){
					System.out.println("Even number");
				}else{
					System.out.println("Odd Number");
				}

			}
			void func14(int num) {
				System.out.println(14);
				if(num%2 == 0){
					System.out.println("Even number");
					return;
				}else{
					System.out.println("Tiger");
				}

			}
			void func15(int num) {
				System.out.println(15);
				if(num != 1234){
					System.out.println("Incorrect PW");
					return;
				}else{
					System.out.println("Comming in");
				}

			}
			int func16(int num) {
				if(num % 2 == 0) {
					return num * 2;
				}else {
					return num / 2;
				}

			}

		}
		Apple a1 = new Apple();
		a1.func01();
		a1.func02(1);
		int rere = a1.func03();
		System.out.println(rere);
		int wawa = a1.func04(1);
		System.out.println(wawa);
		a1.func05(10, 20);
		a1.func06(1, 2, 3);
		a1.func07(4, "Tiger");
		a1.func08();
		a1.func10(1, 2);

		int k = a1.func11(10, 20);
		System.out.println(k);
		System.out.println(a1.func11(600,700));
		System.out.println(a1.func16(12) );
		 */

//		int num = 10;
//		String s = Integer.toString(num);
//		System.out.println(s);
//		System.out.println(s+100); //숫자+숫자가 아닌 모든 연산은 문자로 취급해버림
//		String t = "777";
//		int a = Integer.parseInt(t);
//		System.out.println(a+100);
//
//		System.out.println(num+"");  //이런 코드를 Sugar code라고합니다.

//		int a = 10;
//		int b = 20;
//		int t;
//		t = a;
//		a = b;
//		b = t;
//		System.out.println(a+ " " + b);
		
//		int a = 10;
//		int b = 0x10;
//		System.out.println(a+ " " + b);
//		int d = 0376;
//		System.out.println(d);
//				
//		float
//		for(int i = 0; i < 100; i++) {
//			int sum 
//		}
//				
//		//부동소수는 절대 같냐 묻지 않는다
//
//		if(sum == 10.0f) {
//			System.out.println("Tiger");
//		}
		
		System.out.println(Math.min(10, 20));
		
		
		class Apple{
			Apple(){

			}
			void f1() {
				System.out.println(1);
			}
			

		}
		Apple a1 = new Apple();
		a1.f1();
		System.out.println(Apple.class);
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.abs(-7));
		System.out.println(Math.pow(2, 8));

		System.out.println(Math.sqrt(8));
		double s = Math.sqrt(8);
		System.out.println(s);
		//		
		// f11 출력

	}

}