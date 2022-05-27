package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import context.DBContext;
import entity.Member;


public class DaoEditProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void editProfile(String fname, String lname, String phone, String desc, String id ) {
		String query = "update Member set FisrtName= ?, LastName= ?, Phone= ?, Description= ?, UpdateTime = now() where id = ?";
		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, phone);
			ps.setString(4, desc);
			ps.setString(5, id);			
			ps.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	public Member getById(int eid) {
		String query = "select FisrtName, LastName, Phone, Description from Member where id =?";
		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, eid);
			rs= ps.executeQuery();
			while (rs.next()) {
				return new Member(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
			}
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		return null;
	}
	
	private void printSQLException(SQLException ex) {
		// TODO Auto-generated method stub
		for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
	}
}