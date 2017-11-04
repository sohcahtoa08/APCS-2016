/**
 * This program creates a calculator GUI that computes the sum of
 * two values.
 * 
 * @author Pranshu Suri
*/


// Import necessary packages
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;

public class Unit15Lab1 extends Application {
	
	// Class Attributes
	private Button aButton;
	private TextField firstVal;
	private TextField secondVal;
	private TextField sum;
	
	public void start(Stage myStage) {
		
		// Create rootNode and set padding
		myStage.setTitle("Simple Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 400, 200);
		
		// Add labels and text fields
		rootNode.add(new Label("First Value:  "), 0, 0);
		firstVal = new TextField();
		rootNode.add(firstVal, 1, 0);
		rootNode.add(new Label("Second Value: "), 0, 1);
		secondVal = new TextField();
		rootNode.add(secondVal, 1, 1);
		rootNode.add(new Label("Sum is:       "), 0, 2);
		sum = new TextField();
		rootNode.add(sum, 1, 2);

		
		// Create button
		aButton = new Button("Calculate");
		rootNode.add(aButton, 1, 3);
		
		// Handle event
		aButton.setOnAction(new ButtonHandler());
		
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
	class ButtonHandler implements EventHandler<ActionEvent> {
		
		public void handle(ActionEvent e) {
			
			// Get values from text fields and calculate sum
			double val1 = Double.parseDouble((firstVal.getText()));
			double val2 = Double.parseDouble((secondVal.getText()));
			double sumOfValues = val1 + val2;
			
			// Display uneditable sum
			sum.setText(Double.toString(sumOfValues));
			sum.setEditable(false);
			
		}
		
	}

}