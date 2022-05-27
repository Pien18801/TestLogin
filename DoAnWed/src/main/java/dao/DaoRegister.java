package dao;

import entity.Member;
import context.DBContext;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DaoRegister {
	
	Connection conn = null;	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public static void main(String[] args) {

	}
	
	
	public void register(String username, String email, String password) {
		
		Date date = new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String aDate = formatter.format(date);
		String query = "insert into member(UserName,Email,Password,CreatedDate,UpdateTime) values (?,?,?,?,?)";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, aDate);
			ps.setString(5, aDate);
			ps.executeUpdate();
		}
		catch(Exception e) {
		}
		
	}
	
	public Member checkMemberExist(String emailin ) {
		String query = "select * from member where Email = ?";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, emailin);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String username = rs.getString(4);
				String email = rs.getString(5);
				String password = rs.getString(6);
				String phone = rs.getString(7);
				String description = rs.getString(8);
				Date createdate = rs.getDate(9);
				Date updatetime = rs.getDate(10);
							
				return new Member(id,firstname,lastname,username,email,password,phone,description,createdate,updatetime);
			}
		}
		catch(Exception e) {
		}
		return null;
	}

}

