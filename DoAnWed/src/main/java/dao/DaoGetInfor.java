package dao;

import entity.Content;

import context.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DaoGetInfor {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Content getIf (String id)
	{
		String query = "select * from Content where id = ?";
		try {
			new DBContext();
			conn = DBContext.getConnection();// mở kết nối với mýql
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
			
				 return new Content (rs.getInt(1), rs.getString(2), rs.getString(3),
				 rs.getString(4), rs.getTimestamp(5), rs.getDate(6), rs.getInt(7), rs.getInt(8));
				 
				/* System.out.println(rs.getString(4)); */
			}
		} catch (Exception e) {

		}
		return null;
		
	}
	public static void main(String[] args) {
		DaoGetInfor dao = new DaoGetInfor();
		Content s = dao.getIf("5");
		 System.out.println(s.getContent()); 
	}
}
