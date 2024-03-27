package week3.day1assignment;

public class TextField extends WebElement {
public void getText() {
	System.out.println("get Text -> From TextField ");

}
public static void main(String[] args) {
	TextField tf = new TextField();
	tf.setText("Text");
	tf.click();
	tf.getText();
}
}
