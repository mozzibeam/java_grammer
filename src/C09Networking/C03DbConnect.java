package C09Networking;

import java.sql.*;

public class C03DbConnect {
    public static void main(String[] args) throws SQLException {
// 1. 클라이언트로부터 id 받아오기
// 2. 해당 id에 대한 DB 조회
// 3. 결과를 String으로 가공
// 4. HTTP 응답으로 전달
//        mysql드라이버 별도 다운로드 및 추가
        String url = "jdbc:mysql://localhost:3306/board?useSSL=false";
        String userName = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, userName, password);
//        Statement객체에 쿼리를 담아 db에 전달
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from post");
//        rs.next()를 통해 데이터를 1row씩 read
        while (rs.next()){  //JDBC 포인터 이동으로 값을 하나씩 꺼냄
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("title"));
            System.out.println(rs.getString("contents"));
        }

        connection.close();
    }
}
