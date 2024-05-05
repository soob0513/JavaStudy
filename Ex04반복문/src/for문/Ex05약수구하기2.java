package for문;

public class Ex05약수구하기2 {

	public static void main(String[] args) {
		// (77*1)+(76*2)+(75*3)+ ... + (1*77)를 계산하여 결과 출력
		/*
		int sum = 0;
		for (int i = 1; i <= 77; i++) {
			sum += (78-i)*i;
		}
		System.out.println(sum);
		*/
		
		// 두번째 방법!
		int num = 1;  // 1~77
		int sum = 0;  // 곱셈 결과를 누적시킬 공간
		for (int i =77; i >= 1; i--) { // i : 77 --> 1
			sum += i * num;
			num++;   // num : 1 ~ 77
		}
		System.out.println(sum);
		
	}

}
