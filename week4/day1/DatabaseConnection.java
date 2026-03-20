package week4.day1;

/*
 * Interface Name: DatabaseConnection
 * This interface defines common database operations.
 */

public interface DatabaseConnection {
	void connect();
	void disconnect();
	void executeUpdate();

}
