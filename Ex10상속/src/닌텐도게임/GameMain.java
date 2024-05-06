package 닌텐도게임;

public class GameMain {
// 닌텐도 게임기(실행할 수 있는 공간!)
	public static void main(String[] args) {
		
		// 마리오 게임칩 꺼내오기
		Mario m = new Mario(); 
		// 게임칩을 넣기
		on(m);
		
		// 동물의 숲 게임칩 꺼내오기
		Dongmul d = new Dongmul();
		// 게임칩 넣기
		on(d);
		
		// 포켓몬고 게임칩 꺼내오기
		PokemonGo p = new PokemonGo();
		// 게임칩 넣기
		on(p);
		
		// 젤다의 숲 게임칩 꺼내오기
		Zelda z = new Zelda();
		// 게임칩 넣기
		on(z);
		
		

	}
	
	// 게임칩을 넣어서 작동시키는 메소드
	// main 클래스가 있는 공간에서 메소드를 만들 때 메인 메소드가 있는 static이라는 공간에 같이 넣어줘야 함!
	private static void on(GameChip m) {
		m.gameStart();
	}
	
	
	// on(d);와 on(p); 에 오류 있음 -> 해결하는 방법 2가지
	/* 1. 메소드 오버로딩으로 풀어내는 기법
	private static void on(Dongmul d) {
		d.gameStart();
	}
	private static void on(Pokemon p) {
		p.gameStart();
	}
	*/
	// 2. Mario를 부모, 동물의 숲과 포켓몬고를 자식클래스로 상속
	

}
