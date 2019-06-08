package life.majiang.community;
import java.sql.*;

public class Demo1_JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //创建连接
        Connection conn=DriverManager.getConnection
                ("jdbc:mysql://localhost/community?useSSL=FALSE&serverTimezone=UTC","zhq","zhq888888");
        //得到执行sql语句的Statement对象
        Statement stmt=conn.createStatement();
        //执行sql语句，并返回结果
        ResultSet rs=stmt.executeQuery("select * from user");
        //处理结果
        while (rs.next()) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        //关闭资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
