package week3.day1assignment;

public class LoginTestData extends TestData {
public void enterUserName() {
	System.out.println("TestLeaf");

}
public void enterPassword() {
	System.out.println("testleaf123");

}
public static void main(String[] args) {
	LoginTestData ltd = new LoginTestData();
	ltd.enterCredentials();
	ltd.navigateToHomePage();
	ltd.enterUserName();
	ltd.enterPassword();
}

}
