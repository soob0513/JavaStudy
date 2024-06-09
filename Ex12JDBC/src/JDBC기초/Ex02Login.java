package JDBC기초;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 아이디와 비밀번호를 입력 받기
		System.out.println("ID 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		
		// JDBC
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결 통로 만들기(url, user, password)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("DB 연결 성공!");
			}else {
				System.out.println("DB 연결 실패!");
			}
			
			// 3. SQL문 준비!
			// 로그인 >> 테이블에 사용자가 입력한 데이터가 존재하는지 확인 >> SELECT 
			// 아이디랑, 비밀번호 둘 다 일치하는 데이터가 테이블에 있는지 확인!
			// 아이디랑, 비밀번호 둘 다 일치하는 컬럼을 가져오기!
			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
			
			psmt = conn.prepareStatement(sql);
			
			// ? 인자 채워주기!!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			// 4. sql문 전송(실행)
			rs = psmt.executeQuery();
			// ResultSet이란?
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 자료구조!!
			// : cursor 를 가지고 있다. (처음에는 column명을 가리키고 있다.)
			// : cursor가 가리키고 있는 데이터만 가지고 올 수 있다. 
			
//			rs.next(); // ---> cursor를 한 행 밑으로 내리는 작업
			// 데이터가 있다면 true / 데이터가 없다면 false
			
			if (rs.next() == true) {
				// 로그인 성공!
				// '이름'님 환영합니다.
				String name = rs.getString("name");
				System.out.println(name+"님 환영합니다!");
			}else {
				System.out.println("로그인에 실패했습니다. ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. DB 연결 종료! --> 자원 반납
			// 사용한 순서의 반대로 반납하기!!
			try { 
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
