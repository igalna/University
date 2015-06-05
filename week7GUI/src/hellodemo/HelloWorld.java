package hellodemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World demo");
		final Button btn = new Button();
		btn.setText("Hello World Button");
		
		// calls the setOnAction method on the button
		
		btn.setOnAction(ae -> {btn.setText("I've been pressed");
		});
				
				/*EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				System.out.println("ouch!");
				btn.setText("I've been pressed!");
			}
		});*/
		
		StackPane st = new StackPane();
		st.getChildren().add(btn);
		primaryStage.setScene(new Scene(st, 300, 300));
		primaryStage.show();
		
	}

}
