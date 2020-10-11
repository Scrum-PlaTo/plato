package com.teamplato.plato.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.teamplato.plato.service.*;

/**
 * <h1>Makes a Connection to a Database<h1>
 The DatabaseConnection class provides methods to retrieve data from a database.
 <p>
 * As of yet, an SQLite database is implemented.
 *
 * TODO: make update feature
 * TODO: make an individual select statement. Might not be needed.
 *
 * @author Thijme.Langelaar
 */
public class DatabaseConnection {
    private static DatabaseConnection dcData = null;
    private static Connection conn = null;
    private static String dbLocation = "C:/Projects/sqlite/db/";
    private static String dbName = "plato.db";

    /**
     * The constructor is private. To retrieve an instance of this class, call the static method
     * getInstance.
     * This is a design pattern called "Singleton" and it ensures that only one connection to the
     * database is made at any given time.
     * @see #getInstance()
     */
    private DatabaseConnection() {
    }

    /**
     * This method returns an instance of this class, which ensures only one database connection
     * at any given time.
     * @return DatabaseConnection an instance of the DatabaseConnection class.
     */
    public static DatabaseConnection getInstance() {
        if (dcData == null) {
            //lazy loading
            dcData = new DatabaseConnection();
        }
        return dcData;
    }

    /**
     * This method creates a connection if it does not yet exists.
     * @return Nothing
     * @throws SQLException
     * @see SQLException
     */
    public void createConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = createNewConnection();
        }
    }

    /**
     * This method should only be called by createConnection(). It contains the logic for creating
     * a connection to a database using the JDBC-driver. This implementation connects to a
     * sqlite database.
     * @return Connection
     * @see Connection
     * @see #createConnection()
     */
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

    /**
     * This method closes the connection to the database, if it exists.
     * @return Nothing
     * @throws SQLException
     * @see SQLException
     */
    public void closeConnection() throws SQLException {
        if (conn != null || !(conn.isClosed())) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method retrieves all rows from a given table.
     * It uses a Connection object to execute the query, which results a ResultSet
     *
     * @param tablename name of the table
     * @return ResultSet ResultSet object containing all rows and columns.
     */
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

    /**
     * Insert a new teacher in the database.
     * @param teacher
     * @return Nothing
     */
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

    /**
     * Insert a new course in the database
     * @param course
     * @return Nothing
     */
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

    /**
     * Insert a new room in the database
     * @param room
     * @return Nothing
     */
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

    /**
     * Insert a new group in the database
     * @param group
     * @return Nothing
     */
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

    /**
     * Remove a teacher from the database
     * @param teacher
     * @return Nothing
     */
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

    /**
     * Remove a course from the database
     * @param course
     * @return Nothing
     */
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

    /**
     * Remove a room from the database
     * @param room
     * @return Nothing
     */
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

    /**
     * Remove a group from the database
     * @param group
     * @return Nothing
     */
	public void delete(Group group) {
		String sql = "DELETE FROM group1 WHERE id='?'";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, group.getNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    /**
     * For internal use. Checks if the appropriate tables exists, otherwise it makes them
     * @return Nothing
     */
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
            for (String statement : sqlStatements) {
                stmt.execute(statement);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Get the location of the database
     * @return String database path
     */
    public String getDbLocation() {
        return dbLocation;
    }

    /**
     * Get the name of the database
     * @return String database name
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Checks if the database is closed
     * @return boolean true if closed, false if open
     * @throws SQLException
     * @see SQLException
     */
    public boolean isClosed() throws SQLException {
        if (conn == null || conn.isClosed()) {
            return true;
        }
        return false;
    }
}
