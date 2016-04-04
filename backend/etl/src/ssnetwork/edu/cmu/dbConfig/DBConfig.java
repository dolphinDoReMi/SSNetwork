package ssnetwork.edu.cmu.dbConfig;

/**
 * Author: Lunwen He
 * Date: 04/04/2016
 * */

/**
 * this class defines the user name and password of database
 * please change to your database user name and password before
 * loading data into MySQL
 * */
public class DBConfig {
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	public static final String DB_URL = "jdbc:mysql://localhost/article";
	
	public static String USER = "root";
	public static String PASS = "helunwen";
}
