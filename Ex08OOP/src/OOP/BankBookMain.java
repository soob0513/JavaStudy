package OOP;

public class BankBookMain {

	public static void main(String[] args) {
		
		// 1. BankBook 설계도면을 기반으로 bank1 생성
		// 자료형 변수명 = new 자료형();
		BankBook bank1 = new BankBook();
		
		// 2. bank1의 잔액을 1000원 추가
		// bank1.money = 1000; --> money가 private이라서 사용 불가
		bank1.deposit(1000);
		
		// 3. bank1에 7000원 입금
		bank1.deposit(7000);
		System.out.println(bank1.showMoney());
		
		// 4. bank1에 5000원 출금
		bank1.withdraw(5000);
		
		// 5. bank1의 잔액을 출력
		System.out.println(bank1.showMoney());
	}

}
