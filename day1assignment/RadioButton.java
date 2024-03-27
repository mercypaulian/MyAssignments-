package week3.day1assignment;

public class RadioButton extends Button{
public void selectRadioButton() {
	System.out.println("Radio button selecetd");

}
public static void main(String[] args) {
	RadioButton rb = new RadioButton();
	rb.setText("Text");
	rb.click();
	rb.submit();
	rb.selectRadioButton();
}
}
