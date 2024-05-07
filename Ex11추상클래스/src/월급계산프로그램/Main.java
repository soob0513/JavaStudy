package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// 실행공간
		RegularEmployee regular = new RegularEmployee("smhrd0001", "배주현", 4000, 300);
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());
		
		TempEmployee temp = new TempEmployee("smhrd0002", "강슬기", 4000);
		System.out.println(temp.print());
		
		PartTimeEmployee part = new PartTimeEmployee("smhrd0003", "손승완", 50, 20);
		System.out.println(part.print());
		
	}

}
