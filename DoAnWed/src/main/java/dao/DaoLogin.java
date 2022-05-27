package dao;
import entity.Member;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoLogin {
	Connection conn = null;	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public static void main(String[] args) {
	}
	
	public Member checkLogin(String emailin, String passwordin ) {
		String query = "select id from users where email =? and password =? ";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, emailin);
			ps.setString(2, passwordin);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				return new Member(id);
			}
		}
		catch(Exception e) {
		}
		return null;
	}
	
	public int checkRole(int id ) {
		String query = "select role_id from user_role where user_id =? ";

		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				int role_id = rs.getInt(1);
				return role_id;
			}
		}
		catch(Exception e) {
		}
		return 0;
	}
   
	
}
