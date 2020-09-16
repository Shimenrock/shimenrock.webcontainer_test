package com.tjl.jdbc;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		加载Mysql驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("驱动加载失败");
		}
	}

}
