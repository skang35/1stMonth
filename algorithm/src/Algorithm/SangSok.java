package Algorithm;

import java.util.Random;

//class Apple {
//	Apple() {
//		
//	}
//	
//}
//	void func1() {
//		System.out.println("부모 1");
//	}
//	void func3() {
//		System.out.println("부모 3");
//	}
//	void func5() {
//		func3();
//		System.out.println("자식아 부모다");
//	}
//	void func6() {
//		func5();
//	}
//
//}
//class Orange extends Apple{
//	Orange(){
//		
//	}
//	void f2() {
//		
//	}
//	void func2() {
//		System.out.println("자식 2");
//	}
//	void func3() {
//		System.out.println("자식 3");
//	}
//	void func4() {
//		super.func3();
//		System.out.println("나는 자식 4");
//	}
//}

//class Banana extends Apple{
//	Banana() {
//		System.out.println("Kids");
//	}
//
//}
//
//class A{
//	A(int n){
//		System.out.println(n);
//	}
//}
//
//class B extends A{
//	B(){
//		super(18);	// super = 부모님, 그리고 생성자 첫번째 자리에 들어간다 
//		System.out.println("이No무 자식 생성Ja");
//	}
//}
//class Animal{
//	void cry(){
//		
//		System.out.println("나는 안운다");
//	}
//}
//clrmflaass Dog extends Animal{
//	void cry(){
//		System.out.println("왈왈");
//	}
//}
//class Cat extends Animal{
//	void cry(){
//		System.out.println("야옹");
//	}
//}
//class Snake extends Animal{
//	
//}

/*
class Zoo{
	Zoo(){
		System.out.println(132);
	}
	Zoo(int a){
	}
	Zoo(String s){
		
	}
//	Zoo(Dog dog){
//		
//	}
//	Zoo(Cat cat){
//		
//	}
//	Zoo(Snake snake){
//		
//	}
	
	Animal animal;
	
	Zoo(Animal animal){
		this.animal = animal;
		this.cry();
	}
//	Zoo(Animal animal){
//		
//	}
	void cry() {
		animal.cry();
	}
	void asd() {
		
	}

}
class Animal{
	void cry() {
		
	}
}
class Dog extends Animal{
	Dog(){
		System.out.println("떡");
	}
	void cry() {
		System.out.println(1);
	}
}
class Cat extends Animal{
	Cat(){
		System.out.println("꼬우");
	}
	void cry() {
		System.out.println(2);
	}

}
class Snake extends Animal{
	Snake(){
		System.out.println("쓰");
	}
	void cry() {
		System.out.println(3);
	}

}
*/
//------------------------------------------------
//abstract class Apple{
//	Apple(){
//	}
//	abstract void func1(); 
//	void func2() {
//		System.out.println(2);
//	}
//}
//class Banana extends Apple{
//	Banana(){
//		
//	}
//	@Override //어노테이션 = 오타 확인용
//	void func1() {
//		System.out.println(1);
//	}
//	void func3() {
//		System.out.println(3);
//	}
//}
//
//abstract class A{
//	abstract void f1();
//}
//class B extends A{
//	void f1() {
//		System.out.println(11);
//	}
//}
//------------------------------------------------	
//class BaDook{
//	AI ai;	// BaDook의 필드. 멤버 변수
//	
//	// BaDook 생성자
//	BaDook(AI ai){
//		this.ai = ai;
//		System.out.println("바둑을 시작합니다");
//	}
//	void play() {
//		ai.play();
//	}
//}
//abstract class AI{
//	AI(){
//	}
//	abstract void play(); 
//}
//class Alpago extends AI{
//	Alpago(){
//	}
//	void play() {
//		System.out.println("인공지능은 알파고 입니다");
//	}
//}
//class Betago extends AI{
//	Betago(){
//	}
//	void play() {
//		System.out.println("인공지능은 베타고 입니다");
//	}
//}
//class Gammago extends AI{
//	Gammago(){
//	}
//	void play() {
//		System.out.println("인공지능은 감마고 입니다");
//	}
//}
//
//class Apple {
//	void f1() throws Exception{
//		System.out.println(1);
//		Thread.sleep(1000);
//		throw new Exception();
//	}
//
//	void f2() {
//		System.out.println(2);
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//	void f3() throws Exception{
//		System.out.println(2);
//		throw new Exception();
//	}
//	void f4() throws Exception{
//		f3();
//		
//	}
//abstract class Apple{
//	abstract void f1(); 
//}
//class Orange extends Apple{
//	void f1() {
//		System.out.println(1);
//	}
//}
//interface Apple{
//	void f1();
////	void f2() {
////		
////	}
//}
//class Orange implements Apple{
//	public void f1() {
//		
//	}
//	
//}
//class Apple {
//	
//}
//class Orange{
//	
//}
//
//abstract void f1();
//
//interface B{
//	
//}
//interface C{
//	
//}
//class D extends A implements B, C{
//	
//}
//interface Paap{
//	public void f1();
//}
//interface Banana{
//	public void f2(int n);
//}
//interface Orange{
//	public void f3(String s, int n);
//}
//interface Kiwi{
//	int f4();
//
//}
//interface Mango{
//	int f5(int a);
//}
//interface Grape{
//	int f6(int a, int b);
//}
//interface Apple1{
//	void f1();
//}
//class Apple2{
//	void f1(Apple1 app) {
//		app.f1();
//	}
//}
interface Apple03{
	void f1();
}

class Apple04{
	Apple03 app;
	Apple04(Apple03 app){
		this.app = app;
	}
	void f1() {
		app.f1();
	}
}
		//------------------------------------------------
public class SangSok {
	public static void main(String[] args) {
		// ------------------------------------------------

		Thread t18 = new Thread() {
			@Override
			public void run() {
				System.out.println("여기는 스레스");
			}
		};
		
		t18.start();
		
		Thread t19 = new Thread( () -> System.out.println("저기는 스레드"));
		t19.start();m 
//		Thread t18 = new Thread() {
//			public void run() {
//				System.out.println("여기는 스레드");
//			}
//		};t18.start();
		
//		Apple04 t = new Apple04(() -> System.out.println(1));
//		t.f1();
//		Runnable t14 = () -> System.out.println(1);
//		t14.run();
//		
//		Runnable t15 = new Runnable() {@Override
//			public void run() {
//			
//		}}; 
		
//		Apple2 t1 = new Apple2(); 
//		t1.f1(() -> {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		});
//		
//		t1.f1(() -> System.out.println(4));
//		Paap t1 = () -> {
//			System.out.println(1);
//		};
//		t1.f1();
//		Paap t2 = () -> System.out.println(11);
//		t2.f1();
//		
//		Banana t3 = new Banana() {
//			public void f2(int n) {
//				System.err.println(n*n);
//			};
//		};
//		t3.f2(10);
//		
//		Banana t4 = n -> System.out.println(n*n);
//		t4.f2(100);
//		
//		Orange t5 = (s, n) -> System.err.println(s + " " + n);
//		t5.f3("Tiger", 50);
//		
//		Kiwi t6 = () -> {
//			System.out.println();
//			return 100;
//		};
//		System.out.println(t6.f4());
//		
//		Kiwi t7 = () -> {
//			System.out.println();
//			return 100;
//		};
//		System.out.println(t7.f4());
//		
//		Mango t8 = a -> 100*a;
//		System.out.println(t8.f5(2));
//		
//		Grape t9 = (a, b) -> 203*a*b;
//		System.out.println(t9.f6(20, 50));
//		
		
//		Orange o = new Orange();
//		o.f1();
//		Apple a = new Orange();
//		a.f1();
//		Apple b = new Apple() {
//			@Override
//			void f1() {
//				System.out.println(1);
//			}
//		};
//		new Apple() {
//			@Override
//			void f1() {
//				System.out.println(2);
//			}f1();
//		
//		}
		
	}
}



		
//		Orange o = new Orange();
//		o.f1();
//		Apple a = new Orange();
//		a.f1();
//		Apple b = new Apple() {
//			@Override
//			void f1() {
//				System.out.println(2);
//			}
//		};
//		new Apple() {
//			@Override
//			void f1() {
//				System.out.println(3);
//			}
//		}.f1();
		
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j < 4; j++) {
////				System.out.print(5 - i + "0" + j +"호 ");
//				System.out.printf("%d0%d호 ", 5-i, j);
//				
//			}System.out.println();
//		}
		//이게 이렇게 줄어드네 ...
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i == 0 | i == 3 | j == 0 | j == 4 ? "* " : "0 " );
//			}System.out.println();
//		}
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 0) {
//					System.out.print("* ");
//				}else if(i == 3){
//					System.out.print("* ");
//				}else if(j == 0) {
//					System.out.print("* ");
//				}else if(j == 4) {
//					System.out.print("* ");
//				}else {
//					System.out.print("O ");
//				}
//			}System.out.println();
//			
//		}
		
		
		
		
//		BaDook b1 = new BaDook(new Alpago());
//		b1.play();
//		BaDook b2 = new BaDook(new Betago());
//		b2.play();
//		BaDook b3 = new BaDook(new Gammago());
//		b3.play();
//		
//		Apple a = new Apple();


		// ------------------------------------------------
	
		// ArrayIndexOutOfBoundsException------------
//		int [] ar = new int[3];
//		ar[5] = 10;
		// ArithmeticException-----------------------
//		int a = 100 / 0;
		// NullPointerException----------------------
//		String s = null;
//		s.hashCode();

		// ClassCastException------------------------
//		class A{
//			
//		}
//		class B extends A{
//			void func1() {
//				
//			}
//		}
//		A a = new A();
//		B b = (B)a;
		// ---------------------------------------------
//		try {
//			int a = 100 / 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("익셉션 발생");
//		}System.out.println("Tiger");
//
//		try {
//			int b = 100 / 0;
//		} catch (Exception e) {
//			
//		}finally {
//			System.out.println("여기는 파이널");
//		}
		// Unhandled exception type InterruptedException -----------------------

//		for (int i = 1; i < 6; i++) {
//			System.out.println(i);
//			try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
//		}System.out.println("STARTTTTTTTTTTTTTTTTTTTTTTTTTTT");
//		class Apple {
//			void f1() throws Exception {
//				System.out.println(1);
//				throw new Exception();
//			}
//
//			void f2() {
//				System.out.println(2);
//				try {
//					throw new Exception();
//				} catch (Exception e) {
//				}
//
//			}
//			void f3() throws Exception{
//				System.out.println(2);
//				throw new Exception();
//			}
//			void f4() throws Exception{
//				f3();
//				
//			}
//		}
//		Apple apple = new Apple();
//		try {
//			apple.f1();
//		} catch (Exception e) {
//
//		}
//		apple.f2();
//		Thread.sleep(3000);
//		apple.f1();
		



//		int[] ar = new int[7];
//		ar[6] = 20;
////		ar[7] = 30;
////		ar[-1] = 90;
//		// 안에서 산술연산을 쓸수있다.
////		for (int i : ar) {
////			System.out.print(i + " ");
////		}
//		int num = 3;
//		ar [num]  = 40;
//		ar [num]  = 40;
//		
//		int [][] br = new int [3][5];
//		br [0][0] = 10;
//		br [1][3] = 30;
//		
////		int [][] br = new int [0][0];
////		int [][] br = new int [2][4];
//		
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("[%d %d]", i, j);
//			}System.out.println();
//		}System.out.println();
//		
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%3d ",br[i][j]);
//			}System.out.println();
//		}System.out.println();
//		
//		System.out.println(br[1].length);

//		int [][]ar = new int[3][4]; 
////		System.out.println(ar);
//		Random rn = new Random();
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				int rnd = rn.nextInt(100);
//				ar[i][j] = rnd;
//			}
//		}
// ------------------------------------------------

// int [][]br = new int[5][3];

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				System.out.print(ar[i][j]+" ");
//			}System.out.println();
//		}System.out.println();

//
//		Random rnw = new Random();
//		int rndw = rn.nextInt(100);
//		ar[4][3] = rndw;
//
//
//		int [][]br = new int[4][3];
//		
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < br[i].length; j++) {
//				System.out.print(br[i][j]+" ");
//			}System.out.println();
//		}System.out.println();
//	}
//}
// ------------------------------------------------
//	Banana b1 = new Banana();
//	b1.func1();	
//	b1.func2();
//	b1.func3();
//
//	B t1 = new B();
//	t1.f1();
//	A t2 = new B();
//	t2.f1();
//	A t3 = new A() {	// 익명 클래스를 이용한 객체 생성 방법
//		@Override
//		void f1() {
//			System.out.println(2);
//		}
//	};
//	t3.f1();
//	new A() {    // 한번 쓰고 버리는 코드
//		@Override
//		void f1() {	
//			System.out.println(2);
//		}
//	}.f1();

//		String[] str = new String[3];
//		str[0] = "Tiger";
//		str[1] = new String("Elehapnt");
//		str[2] = "Eagle";
//		Apple a1 = new Apple();
//		Apple [] a2 = new Apple[3];
//		a1.f1();
////		a2[1].f1();
//		a2[0] = new Apple();
//		
//		
////		배열 이름이 중요하지않을때 한방에 여러개 메모리 달라고 요청하는것
//		int a, b, c;
//		a = 10;
//		b = 20;
//		c = 30;
//				
//		int [] ar = new int[3];
//		ar[0] = 10;
//		ar[1] = 20;
//		ar[2] = 30;
//		
//		String s1, s2, s3;
//		System.out.println(s1);	//쓸수가없어요
//		String [] br = new String[3];

/*
 * // Dog d1 = new Dog(); // Zoo z1 = new Zoo(d1);
 * 
 * Animal ani = new Dog();
 * 
 * 
 * Zoo z2 = new Zoo(new Dog()); Zoo z3 = new Zoo(new Cat()); Zoo z4 = new
 * Zoo(new Snake()); z2.cry(); z3.cry(); z4.cry();
 */

//		String s1 = "호랑이";
//		String s2 = new String();
//		String [] s3 = {"호랑이1", "호랑이2", "호랑이3"};
//		String [] s4 = {new String("코끼리1"), new String("코끼리2")};
//		Animal [] a7 = {new Dog(), new Cat(), new Snake()};
//		a7[0].cry();
//		
//		for (int i = 0; i < 3; i++) {
//			a7[i].cry();
//		}
//		Apple t1 = new Apple();
//		Orange t2 = new Orange();
//		Orange t3 = new Apple();
//		Apple t4 = new Orange();

//		Orange o1 = new Orange();
//		o1.func1();
//		o1.func3();
//		o1.func4();
//		o1.func5();
//		o1.func6();
//		
//		Apple apple = new Apple();
//		Banana b1 = new Banana();
//		B b = new B();

//결과는 부모 생성자 호출 후 자식 생성자 
//되기는 개뿔...
