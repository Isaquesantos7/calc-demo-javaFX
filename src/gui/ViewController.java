package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML 
	private TextField txtNumberOne;
	
	@FXML 
	private TextField txtNumberTwo;
	
	@FXML
	private Button btnClick;
	
	@FXML
	private Label labelResult;
	
	@FXML
	public void onBtnClickAction() {
		try {
			double insertOne = Double.parseDouble(txtNumberOne.getText());
			double insertSecond = Double.parseDouble(txtNumberTwo.getText());
			double sum = insertOne + insertSecond;
			labelResult.setText(String.format("%.1f", sum));
		}
		catch(NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
