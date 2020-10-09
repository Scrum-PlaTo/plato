package com.teamplato.plato.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection {
	private static DatabaseConnection dcData = null;
	private static Connection conn = null;
	private static String dbLocation = "C:/Projects/sqlite/db/";
	private static String dbName = "plato.db";
	
	public DatabaseConnection() {}
	
	public static DatabaseConnection getInstance() {
		if(dcData == null) {
			//lazy loading
			dcData = new DatabaseConnection();
		}
		return dcData;
	}
	
	public void createConnection() throws SQLException{
		if(conn == null || conn.isClosed()) {
			conn = createNewConnection();
		}
	}
	
	private Connection createNewConnection() {
		StringBuilder url = new StringBuilder("jdbc:sqlite:");
		url.append(this.getDbLocation());
		url.append(this.getDbName());
		
		try {
			System.out.println("Establishing connection to database: " + this.getDbName());
			conn = DriverManager.getConnection(url.toString());
			System.out.println("Connection established!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		this.checkTables();
		
		return conn;
	}
	
	public void closeConnection() throws SQLException{
		if(conn != null || !(conn.isClosed())) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
        /*
	public ResultSet selectAll(String tablename) {
		Statement stmt;
		ResultSet rs = null;
		
		StringBuilder query = new StringBuilder("SELECT ");
		query.append("*");
		query.append(" FROM ");
		query.append(tablename);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void insert(Teacher teacher) {
		String sql = "INSERT INTO teacher(name,email) \n"
				+ "		VALUES(?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getName());
			pstmt.setString(2,  teacher.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insert(Course course) {
		String sql = "INSERT INTO course(coursecode,name,daynumber,starttime,duration) \n"
				+ "		VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, course.getCourseCode());
			pstmt.setString(2, course.getName());
			pstmt.setInt(3, course.getDayNumber());
			pstmt.setString(4, course.getStartTime().toString());
			pstmt.setString(5, course.getDuration().toString());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(Room room) {
		String sql = "INSERT INTO room(roomno,name,capacity) \n"
				+ "		VALUES(?,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, room.getRoomNO());
			pstmt.setString(2, room.getName());
			pstmt.setInt(3, room.getCapacity());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(Group group) {
		String sql = "INSERT INTO group(name,amountofpeople) \n"
				+ "		VALUES(?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, group.getName());
			pstmt.setInt(2, group.getAmountOfPeople());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Teacher teacher) {
		String sql = "DELETE FROM teacher WHERE id='?'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, teacher.getNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Course course) {
		String sql = "DELETE FROM course WHERE id='?'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, course.getNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Room room) {
		String sql = "DELETE FROM room WHERE id='?'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, room.getNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Group group) {
		String sql = "DELETE FROM group1 WHERE id='?'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, group.getNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
	private void checkTables() {
		List<String> sqlStatements = new ArrayList<>();
		sqlStatements.add("CREATE TABLE IF NOT EXISTS teacher (\n"
			+ "		id integer PRIMARY KEY, \n"
			+ "		name text NOT NULL,\n"
			+ "		email text NOT NULL\n"
			+ ");");
		
		sqlStatements.add("CREATE TABLE IF NOT EXISTS course (\n"
			+ "		id integer PRIMARY KEY, \n"
			+ "		coursecode integer NOT NULL, \n"
			+ "		name text NOT NULL, \n"
			+ "		daynumber integer NOT NULL, \n"
			+ "		starttime text NOT NULL, \n"
			+ "		duration text NOT NULL\n"
			+ ");");
		
		sqlStatements.add("CREATE TABLE IF NOT EXISTS room (\n"
			+ "		id integer PRIMARY KEY, \n"
			+ "		name text NOT NULL, \n"
			+ "		capacity integer NOT NULL\n"
			+ ");");
		
		sqlStatements.add("CREATE TABLE IF NOT EXISTS group1 (\n"
			+ "		id integer PRIMARY KEY, \n"
			+ "		name text NOT NULL, \n"
			+ "		amountofpeople integer NOT NULL\n"
			+ ");");
		
		try {
			Statement stmt = conn.createStatement();
			for(String statement : sqlStatements) {
				stmt.execute(statement);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public String getDbLocation() {
		return dbLocation;
	}
	
	public String getDbName() {
		return dbName;
	}
	
	public boolean isClosed() throws SQLException {
		if(conn == null || conn.isClosed()) {
			return true;
		}
		return false;
	}
}
