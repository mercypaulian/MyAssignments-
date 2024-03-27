package week3.day1assignment;

public class Elements extends Button {
	public void execute() {
		System.out.println("Execute");

	}
	public static void main(String[] args) {
		Elements e = new Elements();
		e.setText("Text");
		e.click();
		e.submit();
		e.execute();
		
	}

}
