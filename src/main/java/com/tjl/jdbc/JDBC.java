package com.tjl.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			����Mysql����			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ�");
//			�������ݿ�
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.11.226:3306/data","root","202009");
			System.out.println("���ݿ����ӳɹ�");
//			����ִ�л���
			Statement statement = conn.createStatement();
//			ִ��sql���
			ResultSet result = statement.executeQuery("select * from info");
			while(result.next()) {
				System.out.print(result.getInt("id")+" ");
				System.out.print(result.getNString("uname")+" ");
				System.out.println(result.getNString("upass"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
			System.out.println("���ݿ�����ʧ��");
		}
	}

}
