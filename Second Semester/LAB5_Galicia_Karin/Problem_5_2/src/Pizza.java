import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: Problem 5.2
 * File name: Pizza.java
 */
public class Pizza extends Application
{
    //Instantiates all posiible ingredients for the pizza as checkboxes
    //Instantiates the Text object that represents the value of the pizza
    private CheckBox init, pep, bacon, mush, pine, ham, sau;
    private Text cost;
    public void start(Stage stage)
    {
        //Assigns a process to each checkbox when it is clicked
        init = new CheckBox("Plain Pizza (dough, cheese, sauce)");
        init.setOnAction(this::processA);
        
        pep = new CheckBox("Pepperonni");
        pep.setOnAction(this::processB);
        
        bacon = new CheckBox("Bacon");
        bacon.setOnAction(this::processC);
        
        mush = new CheckBox("Mushroom");
        mush.setOnAction(this::processD);
        
        pine = new CheckBox("Pineapple");
        pine.setOnAction(this::processE);
        
        ham = new CheckBox("Ham");
        ham.setOnAction(this::processF);
        
        sau = new CheckBox("Sausage");
        sau.setOnAction(this::processG);
        
        //Assign value to the Text object, and formats it
        cost = new Text("0.0");
        cost.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 30));
        cost.setTextOrigin(VPos.CENTER);
        cost.setTextAlignment(TextAlignment.RIGHT);
        
        //Aligns all checkboxes vertically and adds it to a flowpane
        VBox vbox = new VBox(init, pep, bacon, mush, pine, ham ,sau);
        vbox.setSpacing(8);
        FlowPane pane = new FlowPane(vbox, cost);
        
        //Scene and stage format
        Scene scene = new Scene(pane, 350, 200);
        stage.setTitle("Pizza Builder");
        stage.setScene(scene);
        stage.show();
    }
    
    //All possible processes for each ingredient.
    //They take the cost value and add or subtract the value of each ingredient
    public void processA(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(init.isSelected())
        {
            cost.setText(num + 10 + "");
        }
        else
        {
            cost.setText(num - 10 + "");
        }
    }
    public void processB(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(pep.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    public void processC(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(bacon.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    public void processD(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(mush.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    public void processE(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(pine.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    public void processF(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(ham.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    public void processG(ActionEvent event)
    {
        double num = Double.parseDouble(cost.getText() );
        if(sau.isSelected() )
        {
            cost.setText(num + 0.5 + "");
        }
        else 
        {
            cost.setText(num - 0.5 + "");
        }
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
