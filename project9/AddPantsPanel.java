package project9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class 
AddPantsPanel 
    extends AddApparelPanel implements EventHandler<ActionEvent>
{
    private TextField waistTF;
    private TextField inseamTF;
    private Button addPantsB;
    private Wardrobe wdrb;    // whom to tell that we're adding stuff
    
    public
    AddPantsPanel(Wardrobe w)
    {
    	super();
    	this.wdrb = w;
    	
    	waistTF = new TextField();
    	waistTF.setPrefColumnCount(2);
    	
    	inseamTF = new TextField();
    	inseamTF.setPrefColumnCount(2);
    	
    	addPantsB = new Button("Add Pants");
    	addPantsB.setOnAction(this);
    	
    	FlowPane temp = new FlowPane();
    	temp.getChildren().add(new Label("Waist Size (inches): "));
    	temp.getChildren().add(waistTF);
    	temp.getChildren().add(new Label("Inseam Size (inches): "));
    	temp.getChildren().add(inseamTF);
    	
    	// now add this pane to the superclass
    	getChildren().add(temp);
    	getChildren().add(addPantsB);
    	
    }
    	
    /**
     * clear -
     *  clear out text fields - though maybe it would be better
     *  to leave some values in place for easier entry of the next item.
     */
    @Override
    protected void
    clear()
    {
	// add the calls to clear the panel's input fields
    	waistTF.setText("");
    	inseamTF.setText("");
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
    		Pants apair = new Pants(colorTF.getText(), Double.parseDouble(priceTF.getText()), conditionCB.getValue(), Integer.parseInt(waistTF.getText()), Integer.parseInt(inseamTF.getText()));
    		wdrb.addApparel(apair);
    		clear();
    	} catch (NumberFormatException ex) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setTitle("Not a number");
    		alert.setContentText(ex.getMessage());
    		alert.showAndWait();
    	}
    }

} // class AddPants_Panel 