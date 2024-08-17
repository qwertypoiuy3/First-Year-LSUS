import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 4.2
 * File name: CircleField.java
 */
public class CircleField extends Application
{   
    
    TextField size = new TextField();
    Circle circle = new Circle(30);
    
    public void start(Stage primaryStage)
    {
        //formats and gives the TextField an action do
        size.setMaxSize(75, 35);
        size.setOnAction(this::processCircle);
        
        //formats circle object     
        circle.setFill(null);
        circle.setStroke(Color.BLUEVIOLET);
        circle.setStrokeWidth(2);
        
        //Crates a flow pane and centers it
        FlowPane pane = new FlowPane(size, circle);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(0);
        pane.setVgap(0);
        
        //formats the scene
        Scene scene = new Scene(pane, 500, 500);
        scene.setFill(Color.WHITESMOKE);
        
        //formats the stage
        primaryStage.setTitle("Circle adjuster");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
            
    public void processCircle(ActionEvent event)
    {
        //Action to happen when the user presses enter
        int a = Integer.parseInt(size.getText());
        circle.setRadius(a);
    }
            
    public static void main(String[] args) 
    {
        launch(args);
    }
}
