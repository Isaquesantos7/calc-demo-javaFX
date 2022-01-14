package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Contraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
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
		Locale.setDefault(Locale.US);
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Contraints.setTextFildeMaxLength(txtNumberOne, 11);
		Contraints.setTextFildeMaxLength(txtNumberTwo, 11);
		Contraints.setTextFieldInteger(txtNumberOne);
		Contraints.setTextFieldInteger(txtNumberTwo);
		
		/*
		Contraints.setTextFieldDouble(txtNumberOne);
		Contraints.setTextFieldDouble(txtNumberTwo);
		*/
	}
}
