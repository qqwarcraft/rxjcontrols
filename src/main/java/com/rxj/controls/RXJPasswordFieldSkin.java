package com.rxj.controls;

import com.jfoenix.skins.JFXTextFieldSkin;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TextField;

public class RXJPasswordFieldSkin extends JFXTextFieldSkin {
	public static final char BULLET = '\u25cf';//圆点 ,可以用 星号*等其他字符代替,默认就是圆点
	private SimpleBooleanProperty showPassword;

	public final SimpleBooleanProperty showPasswordProperty() {
		if (showPassword == null) {
			showPassword = new SimpleBooleanProperty(false);
		}

		return this.showPassword;
	}

	public final boolean isShowPassword() {
		return this.showPasswordProperty().get();
	}

	public final void setShowPassword(final boolean showPassword) {
		this.showPasswordProperty().set(showPassword);
	}

	public RXJPasswordFieldSkin(RXJPasswordField control) {
		super(control);
		showPasswordProperty().addListener(ob -> {
			control.setText(control.getText());
		});
	}

	@Override
	protected String maskText(String txt) {
		TextField textField = (TextField) getSkinnable();
		if (showPasswordProperty().get()) {
			return textField.getText();
		} else {
			int n = textField.getLength();
			StringBuilder passwordBuilder = new StringBuilder(n);
			for (int i = 0; i < n; i++) {
				passwordBuilder.append(BULLET);
			}
			return passwordBuilder.toString();
		}
	}
}
