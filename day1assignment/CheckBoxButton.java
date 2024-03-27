package week3.day1assignment;

public class CheckBoxButton extends Button{
public void clickCheckButton() {
	System.out.println("CheckButton clicked");
}
public static void main(String[] args) {
	CheckBoxButton cbb = new CheckBoxButton();
	cbb.setText("Text");
	cbb.click();
	cbb.submit();
	cbb.clickCheckButton();
}
}
