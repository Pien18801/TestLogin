package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import context.DBContext;

public class DaoDeleteContent {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public void DeleteContent(String id) {
		String query = "delete from  Content where id =?";
		try {
			new DBContext();
			conn = DBContext.getConnection();// mở kết nối với mýql
			ps= conn.prepareStatement(query);
			ps.setString(1,id);
			ps.executeUpdate();

		} catch (Exception e) {

		}
	}
}
