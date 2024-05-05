package 학생관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		// Student 자료형을 기반으로 stu1 객체 생성
		Student stu1 = new Student();
		
		stu1.setName("유시아");
		System.out.println(stu1.getName());
		stu1.setNumber("950917");
		stu1.setAge(28);
		stu1.setScoreJava(100);
		stu1.setScoreWeb(95);
		stu1.setScoreAndroid(60);
		
		
		// Student 자료형 stu2 객체 생성
		Student stu2 = new Student("배유빈", "970909", 26, 100, 100, 90);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// ★★★★★★★★★생성자(Constructor)★★★★★★★★★★
		System.out.println(stu2.getName());
		
		Student stu3 = new Student("최예원", "990618", 24, 0, 0, 0);
		
		
		
		
	
	}

}
