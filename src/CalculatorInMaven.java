import javafx.application.Application;
import javafx.stage.Stage;
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

public class CalculatorInMaven extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label Name=new Label("Enter your name");
		Label HoursWorked=new Label("Enetr hours worked");
		Label HourlyRate=new Label("Enter hourly rate");
		Label output=new Label("");
		
		TextField name=new TextField();
		TextField hours=new TextField();
		TextField rate=new TextField();
		
		Button calculate=new Button();
		calculate.setText("Calculate");
		
		calculate.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		      //logic for what should happen when you push the button
		    	System.out.println("hii");
		    	
		    	//1.get what the person add in textbox
		    	String Name1=Name.getText();
		    	String hours1=hours.getText();
		    	String rate1=rate.getText();
		    	
		    	//2.Do the calculation
		    	double hours2=Double.parseDouble(hours1);
		    	double rate2=Double.parseDouble(rate1);
		    	
		    	double output1=hours2*rate2;
		    	System.out.println("The hourly rate is " +output1);
		    	
		    	
		    	//3.output result to the screen
		    	output.setText(Name1 + " earns " +output1);
		    	
		    	
		    }
		});
		
		VBox verticalBox=new VBox();
		verticalBox.setSpacing(10); 
		
		verticalBox.getChildren().add(Name);
		verticalBox.getChildren().add(name);
		verticalBox.getChildren().add(HoursWorked);
		verticalBox.getChildren().add(hours);
		verticalBox.getChildren().add(HourlyRate);
		verticalBox.getChildren().add(rate);
		verticalBox.getChildren().add(calculate);
		verticalBox.getChildren().add(output);
		
		
		
		primaryStage.setScene(new Scene(verticalBox,300,300)); //layout manager go inside scene which go inside a stage;Scene can control the width and height of object
		primaryStage.setTitle("Calculator");
		
		primaryStage.show();
		
	}

}
