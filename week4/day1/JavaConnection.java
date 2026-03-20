package week4.day1;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("MySQL Database connected");		
	}

	@Override
	public void disconnect() {
		System.out.println("MySQL Database disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("MySQL update executed");
		
	}
	
	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();

        db.connect();
        db.executeQuery();
        db.executeUpdate();
        db.disconnect();
	}
}



