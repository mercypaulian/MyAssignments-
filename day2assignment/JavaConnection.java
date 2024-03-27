package week3.day2assignment;

public class JavaConnection implements DatabaseConnection{

	public void connect() {
		System.out.println("Checked for the connectivity");
		
	}

	public void disconnect() {
		System.out.println("Checked for the disconnectivity");
	}

	public void executeUpdate() {
		System.out.println("Execution updation");
	}

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}
}
