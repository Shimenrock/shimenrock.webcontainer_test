package com.tjl.jdbc;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����Mysql����
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}
	}

}
