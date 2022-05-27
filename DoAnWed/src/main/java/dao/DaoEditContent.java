package dao;
import context.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaoEditContent {
	public void updateContent (String title, String brief, String content ,String updateTime,String id)
	{
		Connection conn = null;
		PreparedStatement ps = null;
		String query = "update Content set Title =?,Brief=? ,Content=?, UpdateTime=? where id= ?";
		try {
			new DBContext();
			conn = DBContext.getConnection();// mở kết nối với mýql
			Date date = new Date(); 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String aDate = formatter.format(date);
			ps = conn.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, brief);
			ps.setString(3, content);
			ps.setString(4, aDate);
			ps.setString(5, id);
			ps.executeUpdate();
			//System.out.printf("được");
		} catch (Exception e) {
			System.out.printf("loi");
		}
	}
	public static void main(String[] args) {
		/*
		 * DaoEditContent dao = new DaoEditContent(); dao.updateContent("dfd", "dvd",
		 * "fgfgf","14"); //System.out.printf("vdvdv");
		 */	}
}
