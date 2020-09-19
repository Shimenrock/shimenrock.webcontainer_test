package com.tjl.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			加载Mysql驱动			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
//			连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.11.226:3306/data","root","202009");
			System.out.println("数据库连接成功");
//			创建执行环境
			Statement statement = conn.createStatement();
//			执行sql语句
			ResultSet result = statement.executeQuery("select * from info");
			while(result.next()) {
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getNString("uname")+" ");
				System.out.println(result.getNString("upass"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("驱动加载失败");
			System.out.println("数据库连接失败");
		}
	}

}
