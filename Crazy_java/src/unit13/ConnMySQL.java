package unit13;

import java.sql.*;

public class ConnMySQL {
    public static void main(String[] args) throws Exception{
        //1.��������
        Class.forName("com.mysql.jdbc.Driver");
        try (
            //2.ʹ��DriverManager��ȡ���ݿ�����
            //����ֵConnection����java��������ݿ������
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test",
                    "root","1793807638xP");
            //3.ʹ��Connection����Statement����
            Statement statement=connection.createStatement();
            //4.ִ��SQL���
            ResultSet resultSet=statement.executeQuery("select * teacher_name" +
                    "from student_tables")
            )
        {
            while (resultSet.next()){
                System.out.println(resultSet.toString());
            }
        }
//        if(resultSet != null)
//        {   // �رռ�¼��
//            try{
//                resultSet.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
//        if(stmt != null)
//        {   // �ر�����
//            try{
//                stmt.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
//        if(conn != null)
//        {  // �ر����Ӷ���
//            try{
//                conn.close() ;
//            }catch(SQLException e){
//                e.printStackTrace() ;
//            }
//        }
    }
}