import java.util.Scanner;

public class StudyThis {

	public static void main(String[] args) {
		//------------------------------------------------------------------
		//	10871번	정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, 
		//	A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		//	첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		//	둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
		//	주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		//------------------------------------------------------------------
		
//		int N = 20;
//		int arr[] = new int[N];
//		System.out.println(arr[]);
		
//		Scanner in = new Scanner(System.in);
//		
//		int N = in.nextInt();
//		int X = in.nextInt();
//		int arr[] = new int[N];
//		 
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		in.close();
//		
//		for (int i = 0; i < N; i++) {
//			if(arr[i] < X) {
//				System.out.print(arr[i] + " ");
//			}
//			
//		}
		
		
		
		
		
//		Scanner in = new Scanner(System.in);
//
//		int N = in.nextInt();
//		int X = in.nextInt();
//		int arr[] = new int[N];
//
//		for (int i = 0; i < N; i++) {
//			arr[i] = in.nextInt();
//		}
//
//		in.close();
//
//		for (int i = 0; i < N; i++) {
//			if (arr[i] < X) {
//				System.out.print(arr[i] + " ");
//			}
//		}

		//------------------------------------------------------------------
		//	10952번	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//	입력은 여러 개의 테스트 케이스로 이루어져 있다.
		//	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		//	입력의 마지막에는 0 두 개가 들어온다.
		//------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int sum = A + B;

			//		if(A == 0 && B == 0) break;
			System.out.println(sum);
		}
		sc.close();
	}

}
