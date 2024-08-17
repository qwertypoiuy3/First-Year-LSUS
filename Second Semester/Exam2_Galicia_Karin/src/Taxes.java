import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Karin Galicia
 * CSC 135
 * Taxes.java
 */

public class Taxes extends Application
{
    TextField amount = new TextField();
    private Text output = new Text();
    
    public void start(Stage stage)
    {
        amount.setMaxSize(75, 35);
        
        FlowPane input = new FlowPane(amount, output);
        input.setAlignment(Pos.CENTER);
        
        amount.setOnAction(this::ProcessAmount);
        
        Scene scene = new Scene(input, 300, 150);
        scene.setFill(Color.WHITE);
        
        stage.setTitle("Tax Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
    public void ProcessAmount(ActionEvent event)
    {
        int amount1 = Integer.parseInt(amount.getText());
        double op = (double)amount1 * 0.0064;
        output.setText(op + "");
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
