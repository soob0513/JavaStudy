package 월급계산프로그램;

public abstract class Employee {
	
	// 1. field
	protected String empno; // 사번
	protected String name;  // 이름
	protected int pay;      // 연봉
	
	
	// 2. 메소드
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	// getMoneyPay : 추상 메소드 만듦 => 오버라이딩 해서 사용
	public abstract int getMoneyPay();
	

	// print -> 사번 : 이름 : 연봉 리턴
	public String print() {
		return empno + ":" + name + ":" + pay;
	}
	
	
}
