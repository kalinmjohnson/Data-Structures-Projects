package project9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class AddShirtPanel extends AddApparelPanel implements EventHandler<ActionEvent>{
	
	private TextField text;
	private ComboBox<Shirt.Size> size;
    private Button addShirtB;
    private Wardrobe wdrb;
    
    /*	A TextField for the user to enter the text that appears on the shirt
		A ComboBox<Shirt.Size> for the user to select a shirt size
		A Button for the user to click to add a shirt to the Wardrobe
		A reference back to the Wardrobe object
	*/
    
    public
    AddShirtPanel(Wardrobe w)
    {
    	super();
    	this.wdrb = w;
    	
    	text = new TextField();
    	size = new ComboBox<Shirt.Size>();
	    size.getItems().addAll(Shirt.Size.values());
    	
    	addShirtB = new Button("Add a Shirt");
    	addShirtB.setOnAction(this);
    	
    	FlowPane temp = new FlowPane();
    	temp.getChildren().add(new Label("Size: "));
    	temp.getChildren().add(size);
    	temp.getChildren().add(new Label("Text on the Shirt: "));
    	temp.getChildren().add(text);
    	
    	// now add this pane to the superclass
    	getChildren().add(temp);
    	getChildren().add(addShirtB);
    	
    }
    
    @Override
    protected void
    clear()
    {
	// add the calls to clear the panel's input fields
    	text.setText("");
    	colorTF.setText("");
	    priceTF.setText("");
	    conditionCB.getSelectionModel().select(0);
    }
    
    @Override
    public void
    handle(ActionEvent e)
    {
	// add the code to handle action that pertain to Pants
    	try {
    		Shirt ashirt = new Shirt(colorTF.getText(), Double.parseDouble(priceTF.getText()), conditionCB.getValue(), size.getValue(), text.getText());
    		wdrb.addApparel(ashirt);
    		clear();
    	} catch (NumberFormatException ex) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setTitle("Not a number");
    		alert.setContentText(ex.getMessage());
    		alert.showAndWait();
    	} catch (IllegalArgumentException ex) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setTitle("There is an issue with the argument");
    		alert.setContentText(ex.getMessage());
    		alert.showAndWait();
    		
    		//There was no information about throwing an argument, so I can't provide a more helpful alert message
    	}
    }

}
