package week4.day1;
/*
 * Class Name: MySqlConnection
 * This abstract class implements the DatabaseConnection interface.
 */

public abstract class MySqlConnection implements DatabaseConnection {
	
	void executeQuery() {
		System.out.println("Query executed");
	}
	

}
