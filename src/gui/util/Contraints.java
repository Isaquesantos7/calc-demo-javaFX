package gui.util;

import javafx.scene.control.TextField;

public class Contraints {

	// limitar as entradas so a numeros inteiros
	public static void setTextFieldInteger(TextField Text) {
		Text.textProperty().addListener((obj, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				Text.setText(oldValue);
			}
		});
	}

	// limitar a quantidade de caracteres
	public static void setTextFildeMaxLength(TextField Text, int max) {
		Text.textProperty().addListener((obj, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				Text.setText(oldValue);
			}
		});
	}

	// Limitar so a caracteres de ponto flutuante
	public static void setTextFieldDouble(TextField Text) {
		Text.textProperty().addListener((obj, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				Text.setText(oldValue);
			}
		});
	}
}
