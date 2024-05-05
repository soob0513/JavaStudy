package Pokemon;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		// 실행하는 공간!
		Scanner sc = new Scanner(System.in);
		
		// 포켓몬 두마리 생성! (Pokemon 클래스를 기반으로 객체를 2개 생성)
		// 꼬북이, 물, 물대포, 100, 10
		// 피카츄, 전기, 백만볼트, 110, 15
		Pokemon kkobuk = new Pokemon("꼬북이", "물", "물대포", 100, 10);
		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 110, 15);

		while (true) {
			System.out.println("===== 포켓몬을 선택하세요 =====");
			System.out.print("[1]꼬부기 [2]피카츄 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 사용자가 꼬부기를 선택
				// 꼬부기가 피카츄를 공격

				// 1) 일반 공격을 선택했다면
				//    피카츄의 hp를 꼬부기의 공격력만큼 감소시키기
				System.out.println("===== 공격을 선택하세요 =====");
				System.out.println("[1]일반 공격 [2]스킬 공격 >> ");
				int atkChoice = sc.nextInt();
				
				if(atkChoice == 1) {
					// 1) 일반 공격을 선택했다면
					//    꼬부기의 hp를 피카츄의 공격력만큼 감소시키기
	//				int hp = pika.getHp() - kkobuk.getAtk();
	//				pika.setHp(hp);
					pika.setHp(pika.getHp() - kkobuk.getAtk());
				}else if (atkChoice == 2) {
					// 2) 스킬 공격을 선택했다면
					//    피카츄의 hp를 꼬부기의 공격력 * 1.5배로 감소시키기
					pika.setHp((int)(pika.getHp() - kkobuk.getAtk()*1.5));
				}
				// 3) 두 마리 포켓몬의 hp를 출력해주기
				System.out.println("===== 남은 hp =====");
				System.out.println("피카츄 : " + pika.getHp());
				System.out.println("꼬북이 : " + kkobuk.getHp());
				
			}else if (choice == 2) {
				// 피카츄가 꼬부기를 공격
				System.out.println("===== 공격을 선택하세요 =====");
				System.out.println("[1]일반 공격 [2]스킬 공격 >> ");
				int atkChoice = sc.nextInt();
				
				if(atkChoice == 1) {
					// 1) 일반 공격을 선택했다면
					//    꼬부기의 hp를 피카츄의 공격력만큼 감소시키기
	//				int hp = pika.getHp() - kkobuk.getAtk();
	//				pika.setHp(hp);
					kkobuk.setHp(kkobuk.getHp() - pika.getAtk());
				}else if (atkChoice == 2) {
					// 2) 스킬 공격을 선택했다면
					//    꼬부기의 hp를 피카츄의 공격력 * 1.5배로 감소시키기
					kkobuk.setHp((int)(kkobuk.getHp() - pika.getAtk()*1.5));
				}
				// 3) 두 마리 포켓몬의 hp를 출력해주기
				System.out.println("===== 남은 hp =====");
				System.out.println("피카츄 : " + pika.getHp());
				System.out.println("꼬북이 : " + kkobuk.getHp());
				
			}else {
				System.out.println("다시 포켓몬을 선택해주세요!");
			}
			
			// 포켓몬 선택 ~ 공격 선택하는 것까지 반복!
			// 4) 두 마리의 포켓몬 중 한마리라로 hp가 0보다 작거나 같았을 때 프로그램 종료!
			// 5) 승자가 누구인지 출력
			if (pika.getHp() <= 0) {
				System.out.println("승자는!!! "+ kkobuk.getName());
				break;
			}else if (kkobuk.getHp() <= 0) {
				System.out.println("승자는!!! "+ pika.getName());
				break;
			}
		}
	}

}
