package unit13;

import java.sql.*;

public class ConnMySQL {
    public static void main(String[] args) throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        try (
            //2.使用DriverManager获取数据库连接
            //返回值Connection代表java程序和数据库的链接
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test",
                    "root","1793807638xP");
            //3.使用Connection创建Statement对象
            Statement statement=connection.createStatement();
            //4.执行SQL语句
            ResultSet resultSet=statement.executeQuery("select * teacher_name" +
                    "from student_tables")
            )
        {
            while (resultSet.next()){
                System.out.println(resultSet.toString());
            }
        }
//        if(resultSet != null)
//        {   // 关闭记录集
//            try{
//                resultSet.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
//        if(stmt != null)
//        {   // 关闭声明
//            try{
//                stmt.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
//        if(conn != null)
//        {  // 关闭连接对象
//            try{
//                conn.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
    }
}