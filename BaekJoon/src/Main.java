import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		H = M - 45 < 0 ? H == 0 ? 23 : H-1 : H;
		M = M - 45 < 0 ? M - 45 + 60 : M - 45;
		System.out.print(H + " " + M);
		
//		if (M - 45 < 0) {
//			
//			
//			H = H == 0 ? 23 : H-1;
////			if (H == 0) {
////				H = 23;
////			} else {
////				H = H - 1;
////			}
//			M = M - 45 + 60;
//			System.out.print(H + " " + M);
//			
//		} else {
//			M = M - 45;
//			System.out.print(H + " " + M);
//
//		}
	}
}
