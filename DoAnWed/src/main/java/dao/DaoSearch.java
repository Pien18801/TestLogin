package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import entity.Content;

public class DaoSearch {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Content> search(String txtSearch, int id) {
		List<Content> list = new ArrayList<>();
		String query = "select id,Title,Brief,CreatedDate from Content where (Title like ? or Brief like ?) and AuthorId=?";
		try {
			new DBContext();
			conn = DBContext.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + txtSearch + "%");
			ps.setString(2, "%" + txtSearch + "%");
			ps.setInt(3, id);
			rs= ps.executeQuery();
			while (rs.next()) {
				list.add(new Content(rs.getInt("id"), rs.getString("Title"), rs.getString("Brief"),
						rs.getTimestamp("CreatedDate")));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return list;
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