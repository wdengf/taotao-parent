package com.mysql.test;

import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  

public class TestMySQL {

    private static Connection conn;
    public static void main(String[] args) {



//        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            //如果显示没有这个包,需要下载connect for java并添加相应jar包
//
//            String databaseName = "taotao";// 确保在MySQL数据库中创建CREATE好的数据库。
//            String userName = "root";// MySQL默认的root账户名
//            String password = "123456";// 默认的root账户密码为空,或者用户设置的密码
//            //端口号一般默认为3306,在安装mySQL时候可以自己修改.
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, userName, password);
//
//            Statement stmt = conn.createStatement();
//
//            String sql = "CREATE TABLE person(uid varchar(32),name char(32))";
//
//            // 创建数据库中的表，
//            int result = stmt.executeUpdate(sql);
//
//            if (result != -1) {
//                System.out.println("-----创建数据表成功------");
//
//                sql = "INSERT INTO person(uid,name) VALUES('1','somebody1')";
//                result = stmt.executeUpdate(sql);
//
//                sql = "INSERT INTO person(uid,name) VALUES('2','somebody2')";
//                result = stmt.executeUpdate(sql);
//
//                sql = "SELECT * FROM person";
//
//                ResultSet rs = stmt.executeQuery(sql);
//                System.out.println("uid\t姓名");
//
//                while (rs.next()) {
//                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));
//                }
//                /*****************
//                 * 创建数据表成功
//                 * uid   姓名
//                 * 1     somebody1
//                 * 2     somebody2
//                 ****************/
//                //注意,相同表格只能创建1次,重复创建会出错
//                //在查看mysql库:
//                //use test_base;
//                //show tables;
//                //select * from person;
//
//
//            }
//
//            conn.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
// 定义数据库的链接


            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taotao", "root", "123456");
                System.out.println("数据库连接成功");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }


}