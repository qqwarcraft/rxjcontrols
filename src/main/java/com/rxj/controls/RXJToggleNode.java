package com.rxj.controls;


import com.jfoenix.controls.JFXToggleNode;

/**
 * 用来做导航按钮,非常不错,具有单选按钮的效果 ,具有普通按钮的外观
 */

public class RXJToggleNode extends JFXToggleNode {
	private static final String DEFAULT_STYLE_CLASS = "rxj-toggle-node";

	public RXJToggleNode(){
		getStyleClass().add(DEFAULT_STYLE_CLASS);
	}
	public RXJToggleNode(String text){
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
