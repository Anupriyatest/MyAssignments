package assignment.week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		// Creating objects for all classes
		
		WebElement et = new WebElement();
		et.click();
		et.setText("Welcome to Inheritance");
		
		 Button bt = new Button();
	        bt.click();
	        bt.submit();
	        
	     TextField textField = new TextField();
	        textField.setText("Name");
	        System.out.println(textField.getText());  
	        
	     CheckBoxButton checkBox = new CheckBoxButton();
	        checkBox.click();
	        checkBox.clickCheckButton();

	     RadioButton radio = new RadioButton();
	        radio.click();
	        radio.selectRadioButton();

	        // Elements class object (inheriting Button)
	     Elements elements = new Elements();
	        elements.submit();
	        elements.click();    
		

	}

}
