package 이중for문;

public class Ex04다이아몬드 {

	public static void main(String[] args) {
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		for (int j = 1; j < 6; j++) {
			for (int i = 4; i >= j; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i < 10; i+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
