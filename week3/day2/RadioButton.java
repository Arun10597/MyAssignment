package week3.day2;

class RadioButton extends Button {

    public void selectRadioButton() {
        System.out.println("Radio button selected");
    }
    public static void main(String[] args) {
    	RadioButton rb = new RadioButton();
        rb.click();
        rb.submit();
        rb.selectRadioButton();
	}
}