import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: Problem_6_14
 * File name: Circles.java
 */
public class Circles extends Application
{
    //Creates a circle object
    private Circle a;
    
    public void start(Stage stage)
    {   
        //Creates a Group object
        Group group = new Group();
        
        //Loops 100 times to add 100 circles to the group object
        for(int i = 0; i < 100; i++)
        {
            a = new Circle(getRandom(85,1715), getRandom(85,815), getRandom(5,85), Color.rgb(getRandom(0,255), getRandom(0,255), getRandom(0,255) ) );
            
            group.getChildren().add(a);
        }
        
        //Stage and scene modifications
        Scene scene = new Scene(group, 1800, 900);
        scene.setFill(null);
        
        stage.setTitle("Circles");
        stage.setScene(scene);
        stage.show();
    }
    
    //Creates a random number between s minimum and maximum number
    public int getRandom(int min, int max)
    {
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        return (int)Math.floor(Math.random() * (max - min)) + min;
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
