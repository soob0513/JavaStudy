package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Music 자료형을 저장할 수 있는 ArrayList list 생성
		ArrayList<Music> list = new ArrayList<Music>();
		
		// 2. ArrayList 안에 Music 자료형 하나 추가해보기
//		Music m1 = new Music("Drama", "aespa", 226);
//		list.add(m1);
		list.add(new Music("Drama", "aespa", 215));
		
		// 3. [1]노래 추가 [2]노래 삭제 [3]노래 조회 [4]종료
		while (true){
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]노래 조회 [4]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("노래 추가");
				System.out.println("노래 조회");
				System.out.println("===== 현재 재생 목록 =====");
				if (list.size()>0) {
					for(int i = 0; i < list.size(); i++) {
						System.out.println(i + 1 + "." + list.get(i).getTitle() + " / "
											+ list.get(i).getArtist() + " / " 
											+ list.get(i).getSecond());
					}
				}else {
					System.out.println("재생목록이 없습니다. ");
				}
				// 1. 어느 위치에 추가할 것인지 입력받기
				// [1] 마지막 위치에 추가 [2] 원하는 위치에 추가
				System.out.print("[1] 마지막 위치에 추가 [2] 원하는 위치에 추가 >> ");
				int addInput = sc.nextInt();
				// 2. addInput 판별해서 각각 다른 기능 연결
				if (addInput == 1) {
					// 마지막 위치에 추가
					System.out.println("---추가할 노래 입력---");
					System.out.print("제목 : ");
					String newTitle = sc.next();
					System.out.print("가수 : ");
					String newArtist = sc.next();
					System.out.print("재생시간 : ");
					int newSecond = sc.nextInt();
					// 입력받은 Music 데이터를 ArrayList 안에 추가!
					// 리스트의 마지막 위치에 추가!
					list.add(new Music(newTitle, newArtist, newSecond));
				}else {
					// 원하는 위치에 추가
					System.out.println("---추가할 노래 입력---");
					System.out.print("제목 : ");
					String newTitle = sc.next();
					System.out.print("가수 : ");
					String newArtist = sc.next();
					System.out.print("재생시간 : ");
					int newSecond = sc.nextInt();
					// 입력받은 Music 데이터를 ArrayList 안에 추가!
					// 입력받은 인덱스 위치에 노래를 추가하기!
					System.out.print("추가할 위치 입력 >> ");
					int addIndex = sc.nextInt();
					list.add(addIndex, new Music(newTitle, newArtist, newSecond));
				}
			}else if (input == 2) {
				System.out.println("노래 삭제");
				System.out.println("===== 현재 재생 목록 =====");
				if (list.size()>0) {
					for(int i = 0; i < list.size(); i++) {
						System.out.println(i + 1 + "." + list.get(i).getTitle() + " / "
											+ list.get(i).getArtist() + " / " 
											+ list.get(i).getSecond());
					}
				}else {
					System.out.println("재생목록이 없습니다. ");
				}
				// [1]선택삭제 [2]전체삭제
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int reInput = sc.nextInt();
				// 선택 방법 판별
				if (reInput == 1) {
					// 선택삭제
					// 삭제할 노래의 인덱스 번호를 입력받아서 삭제하기
					System.out.print("삭제할 노래 선택 >> ");
					int removeInput = sc.nextInt();
					list.remove(removeInput-1);
				}else {
					// 전체삭제
					// 리스트에 있는 모든 노래 삭제
					list.clear();
					System.out.println("모든 노래를 삭제했습니다.");
				}
				
			}else if (input == 3) {
				System.out.println("노래 조회");
				System.out.println("===== 현재 재생 목록 =====");
				// 1. 리스트에 노래가 들어있는지 판별
				if (list.size()>0) {
					// 2. 만약 노래가 있다면 리스트에 있는 전체 노래 출력
					//    ex) 1. Drama / aespa / 3분 35초
//					int num = 1
//					for(Music m :list) {
//						System.out.println(num + "." + m.getTitle()+"\t"+m.getArtist()+"\t"+m.getSecond());
//					}
					for(int i = 0; i < list.size(); i++) {
						System.out.println(i + 1 + "." + list.get(i).getTitle() + " / "
											+ list.get(i).getArtist() + " / " 
											+ list.get(i).getSecond());
					}
				}else {
					// 3. 노래가 없다면 재생목록이 없습니다. 출력
					System.out.println("재생목록이 없습니다. ");
				}
			}else if (input == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
			}
		}
	}
}
