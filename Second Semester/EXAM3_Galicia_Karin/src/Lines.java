import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: EXAM3_Galicia_Karin
 * File name: Lines.java
 */
public class Lines extends Application
{
    public void start(Stage stage)
    {
    //Creates the first line that shows up in the scene
        Line line = new Line(50, 50, random(50,450), 50);
        line.setStrokeWidth(3);
        line.setFill(Color.SKYBLUE);
        
    //Creates a group with the line added to it
        Group group = new Group(line);

    //I cretae a variable that contains y value position of the line
        double pos = line.getStartY();
    
    //Loops 19 times, since I already created one line before
        for(int i = 0; i < 19; i++)
        {
        //Every time the loop runs, 15 is added to pos, changing the y position 
        //of the line
            pos += 15;
        
        //Creates a new line with radom proportions and adds it to the group
            line = new Line(50, pos, random(50, 450), pos);
            line.setStrokeWidth(3);
            line.setFill(Color.SKYBLUE);
            
            group.getChildren().add(line);
        }
        
    //Scene and stage formatting
        Scene scene = new Scene(group, 500, 400);
        scene.setFill(Color.YELLOW);
        
        stage.setScene(scene);
        stage.setTitle("Lines");
        stage.show();
    }

//Returns a random number between the parameters it takes
    public double random(int min, int max)
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
