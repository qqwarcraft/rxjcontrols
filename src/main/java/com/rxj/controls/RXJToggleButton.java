package com.rxj.controls;

import com.jfoenix.controls.JFXToggleButton;
/*此组件:
 	行为上类似于RadioButton: 点击一次是选择,点击第二次依然是选择,不会取消

	外观上类似于JFXRadioButton: 没有了单选按钮前面的圆点,避免了写很多的css去屏蔽圆点

*/
public class RXJToggleButton extends JFXToggleButton {
	private static final String DEFAULT_STYLE_CLASS = "rxj-toggle-button";

	public RXJToggleButton() {
		getStyleClass().add(DEFAULT_STYLE_CLASS);
	}

	public RXJToggleButton(String text) {
		this();
		setText(text);
	}

	@Override
	public void fire() {
		if (getToggleGroup() == null || !isSelected()) {
			super.fire();

		}
	}
}
