import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MavenClassWork extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//1.create and configure user interface control
		
		//name label
		Label helloLabel=new Label("Enter your name");
		
		//name Textbox
		TextField textbox=new TextField();
		
		//button
		Button addButton=new Button();
		addButton.setText("Click Me!");
		
		//2.Make a layout manager
		VBox verticalBox=new VBox();
		
		//3.Add controls to the layout manager
		   //Always add your control in the same order as you want
		verticalBox.getChildren().add(helloLabel);    //getchildren is a function in box that is called and label is added by .add
		verticalBox.getChildren().add(textbox);
		verticalBox.getChildren().add(addButton);
		
		//4.Add layout manager to scene
		//5.Add scene to the stage
		primaryStage.setScene(new Scene(verticalBox,300,300)); //layout manager go inside scene which go inside a stage
		primaryStage.setTitle("Example");
		
		//6.Show the app
		primaryStage.show();
		
		
	}

}
