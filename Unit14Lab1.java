/**
 * This program creates a GUI with labels, text fields, and buttons.
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

public class Unit14Lab1 extends Application {
	
	public void start(Stage myStage) {
		
		// Create rootNode and set padding
		myStage.setTitle("Loan Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 400, 200);
		
		// Add labels and text fields
		rootNode.add(new Label("Annual Interest Rate:"), 0, 0);
		rootNode.add(new TextField(), 1, 0);
		rootNode.add(new Label("Number of Years:     "), 0, 1);
		rootNode.add(new TextField(), 1, 1);
		rootNode.add(new Label("Loan Amount:         "), 0, 2);
		rootNode.add(new TextField(), 1, 2);
		rootNode.add(new Label("Monthly Payment:     "), 0, 3);
		rootNode.add(new TextField(), 1, 3);
		rootNode.add(new Label("Total Payment:       "), 0, 4);
		rootNode.add(new TextField(), 1, 4);
		
		// Create button
		Button aButton = new Button("Calculate");
		rootNode.add(aButton, 1, 5);
		rootNode.setHalignment(aButton, HPos.RIGHT);
		
		myStage.setScene(myScene);
		myStage.show();
		
	}

}
