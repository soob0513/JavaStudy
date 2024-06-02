package 객체배열;

public class Main {

	public static void main(String[] args) {
		// 1. 객체 배열 생성
		// 자료형[] 배열이름 = new 자료형[칸수];
		// 포켓몬 자료형 3개 보관할 수 있는 bag 배열 생성
		Pokemon[] bag = new Pokemon[3];
		
		// 객체 배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println("bag의 0번방 출력 :" + bag[0]);
		// --> 레퍼런스 타입 변수는 주소값이 나와야하는데, null이 출력된다.
		// String은 기본 변수가 아니기 때문에 null 이 출력된다. 
		
		// 객체 배열의 0번 인덱스에 포켓몬을 넣어보자
		// 이름 : 피카츄 / 타입 : 전기 / 스킬 : 백만볼트 / hp : 110 / atk : 15
//		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 110, 15);
//		bag[0] = pika;
		bag[0] = new Pokemon("피카츄", "전기", "백만볼트", 110, 15);
		System.out.println("bag의 0번방 포켓몬 이름 :" + bag[0].getName());
		
		// 1번 인덱스
		// 이름 : 파이리 / 타입 : 불 / 스킬 : 불꽃세례 / hp : 130 / atk : 13
		bag[1] = new Pokemon("파이리", "불", "불꽃세례", 130, 13);
		
		// 2번 인덱스
		// 이름 : 꼬부기 / 타입 : 물 / 스킬 : 물대포 / hp : 100 / atk : 10
		bag[2] = new Pokemon("꼬부기", "물", "물대포", 100, 10);
		
		// 배열 안에 들어있는 포켓몬의 이름, 타입, hp를 전부 출력해주세요!
		// ===== 포켓몬 정보 출력 =====
		// 피카츄 전기 110
		// 파이리 불 130
		// 꼬부기 물 100
		System.out.println("===== 포켓몬 정보 출력 =====");
//		for (int i = 0; i < bag.length; i++) {
//			System.out.println(bag[i].getName() +"\t"+ bag[i].getType() +"\t"+ bag[i].getSkill());
//		}
		
		// for-each문 
		// : 배열과 같이 여러 개의 데이터를 저장하는 자료구조와 함께 사용
		// ** 동작 원리
		// 배열 안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서 
		// :(콜론) 기준 왼쪽에 있는 변수에 담아주는 흐름을 가진다.
		
		// for (자료형 변수명 : 배열명) {}
		for (Pokemon p :bag) {
			System.out.println(p.getName() +"\t"+ p.getType() +"\t"+ p.getSkill());
		}
	}
}
