package week3.day1assignment;

public class Button extends WebElement {
public void submit() {
	System.out.println("Submit -> From Button");

}
public static void main(String[] args) {
	Button bt = new Button();
	bt.setText("Text");
	bt.click();
	bt.submit();
}
}
