package dao;

import context.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Date;

import java.text.SimpleDateFormat;


public class DaoAddContent {

	Connection conn = null;
	PreparedStatement ps = null;
	
	public static void main(String[] args) {
		DaoAddContent addcontent = new DaoAddContent();
		System.out.print( addcontent.addContent(1,"Anh Van", "Van duy", "Van duy"));
	}

	public Boolean addContent(int id, String title, String brief, String content) {
		Date date = new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String aDate = formatter.format(date);
		String query = "insert into content (AuthorId, Title, Brief, content, CreatedDate, UpdateTime)"
							+ "values (?,?,?,?,?,?)";
		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1,id);
			ps.setString(2, title);
			ps.setString(3, brief);
			ps.setString(4, content);
			ps.setString(5, aDate);
			ps.setString(6, aDate);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Exception " + e);
			return false;
		}
		return true;
	}
}