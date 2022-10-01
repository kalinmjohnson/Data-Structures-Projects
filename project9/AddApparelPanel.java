package project9;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class
AddApparelPanel extends VBox
{
	protected TextField colorTF;
	protected ComboBox<Apparel.Condition> conditionCB;
	protected TextField priceTF;
	
	/**
	 * Default constructor.
	 * Create text fields and combobox in a vertical layout
	 */
	public
	AddApparelPanel()
	{
	    super();
	    // TODO: add the gui elements here
	    colorTF = new TextField();
	    priceTF = new TextField();
	    conditionCB = new ComboBox<Apparel.Condition>();
	    conditionCB.getItems().addAll(Apparel.Condition.values());

	    FlowPane temp = new FlowPane();
	    temp.getChildren().add(new Label("Apparel Color:  "));
	    temp.getChildren().add(colorTF);
	    getChildren().add(temp);

	    temp = new FlowPane();
	    temp.getChildren().add(new Label("Apparel Condition:  "));
	    temp.getChildren().add(conditionCB);
	    getChildren().add(temp);

	    temp = new FlowPane();
	    temp.getChildren().add(new Label("Price:                $ "));
	    temp.getChildren().add(priceTF);
	    getChildren().add(temp);
		
	} // AddApparelPanel
	
	/**
	 * clear - Reset all of the user entry fields
	 */
	protected void
	clear()
	{
	    // TODO: add the calls to clear the fields
		colorTF.setText("");
	    priceTF.setText("");
	    conditionCB.getSelectionModel().select(0);
	}

} // class AddApparelPanel