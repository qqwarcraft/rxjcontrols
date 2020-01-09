package com.rxj.test;

import com.jfoenix.controls.JFXRippler;
import com.rxj.controls.RXJToggleButton;
import com.rxj.controls.RXJToggleNode;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
//		Parent root = loader.load();
//		stage.setScene(new Scene(root));

		//toggle-button jfx-toggle-node
		ToggleGroup tg=new ToggleGroup();
		RXJToggleNode n1=new RXJToggleNode("LWY");
		n1.setGraphic(new Label("按钮1"));
		RXJToggleNode n2=new RXJToggleNode();
		n2.setGraphic(new Label("按钮2"));
		RXJToggleNode n3=new RXJToggleNode();
		n3.setGraphic(new Label("按钮3"));
		RXJToggleButton btn=new RXJToggleButton("张三");
		n1.setToggleGroup(tg);
		n2.setToggleGroup(tg);
		n3.setToggleGroup(tg);
		btn.setToggleGroup(tg);
		n1.setStyle("-fx-pref-width:190;-fx-pref-heigth:80");
		n2.setStyle("-fx-pref-width:190;-fx-pref-height:80");
		n3.setStyle("-fx-pref-width:190;-fx-pref-height:80");



		Label t2 = new Label("大家一起玩好");
		t2.setFont(Font.font(50d));
		//test.getChildren().add(t2);


		Label t1 = new Label("大家一起玩");
		t1.setFont(Font.font(50d));
		JFXRippler ri=new JFXRippler(t1);

		VBox pane=new VBox(n1,n2,n3,btn,ri);
		Scene scene=new Scene(pane,300,300);
		stage.setScene(scene);
		stage.setTitle("Password Depot");
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
