package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// 1. Student 자료형을 보관할 수 있는 sList라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가
		Student s1 = new Student("오해원", 21);
		sList.add(s1);
		
		// 3. 이름을 출력!
		System.out.println(sList.get(0));
		System.out.println(sList.get(0).getName());
		
		// 4. 데이터 추가
		sList.add(new Student("릴리", 21));
		sList.add(new Student("설윤", 20));
		sList.add(new Student("배이", 19));
		sList.add(new Student("지우", 19));
		sList.add(new Student("규진", 18));
		
		
		// 5. 전부 출력하기 (for-each문 사용하기)
		System.out.println("===== 멤버 정보 출력 =====");
		System.out.println(sList.get(0).getName() + "\t" + sList.get(0).getAge());
		System.out.println(sList.get(1).getName() + "\t" + sList.get(1).getAge());
		System.out.println(sList.get(2).getName() + "\t" + sList.get(2).getAge());
		System.out.println(sList.get(3).getName() + "\t" + sList.get(3).getAge());
		System.out.println(sList.get(4).getName() + "\t" + sList.get(4).getAge());
		System.out.println(sList.get(5).getName() + "\t" + sList.get(5).getAge());
		
		System.out.println("===== 멤버 정보 출력 =====");
		for(Student s: sList){
		System.out.println(s.getName() + "\t" + s.getAge());
		}
	}

}
