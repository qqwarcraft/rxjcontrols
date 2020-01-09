package com.rxj.controls;

import com.jfoenix.controls.JFXPasswordField;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.AccessibleAttribute;
import javafx.scene.AccessibleRole;
import javafx.scene.control.Skin;

public class RXJPasswordField extends JFXPasswordField {
	private static final String DEFAULT_STYLE_CLASS = "rxj-password-field";
	RXJPasswordFieldSkin skin;

	public final SimpleBooleanProperty showPasswordProperty() {
		return skin.showPasswordProperty();
	}

	public final boolean isShowPassword() {
		return skin.showPasswordProperty().get();
	}

	public final void setShowPassword(final boolean showPassword) {
		skin.showPasswordProperty().set(showPassword);
	}

	// Creates a default PasswordField instance.
	public RXJPasswordField() {
		getStyleClass().add(DEFAULT_STYLE_CLASS);
		skin = new RXJPasswordFieldSkin(this);
		setAccessibleRole(AccessibleRole.PASSWORD_FIELD);
	}

	public RXJPasswordField(String txt) {
		this();
		setText(txt);
	}

	@Override
	protected Skin<?> createDefaultSkin() {
		return skin;
	}

	@Override
	public void cut() {
		// No-op
	}

	/**
	 * Does nothing for PasswordField.
	 */
	@Override
	public void copy() {
		// No-op
	}

	// Accessibility handling
	@Override
	public Object queryAccessibleAttribute(AccessibleAttribute attribute, Object... parameters) {
		switch (attribute) {
		case TEXT:
			return null;
		default:
			return super.queryAccessibleAttribute(attribute, parameters);
		}
	}
}
