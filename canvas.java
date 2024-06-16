import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EnentHandler;
import javafx.scene.canvas;
import javafx.scene.paint.colour;
import javafx.scene.Group;
public class canvas extends Application
{
   //launch application
   public void start(Stage stage);
   {
   //set little for the stage
   stage.setTitle("creating canvas");
   Canvas canvas=new canvas(100.0f,100.0f)
   //graphic content
   GraphicsContext graphics_Context=canvas.getGraphicsContext2D();
   graphics_Context.setFill(colour,RED);
   graphics_Context.fillRect(20,20,70,70);
   graphics_Context.setFill(colour.BLUE);
   graphics_Context.fillOval(30,30,70,70);
   Group group=new Group(canvas);
   Scene scene=new Scene(group,200,200);
   //sst the scene
   stage.setScene(scene);
   stage.Show();
   }

}
//Main Meth
 public static void main(String[] args) 
 {
    //laughing the application
    launch(args);
 }
}
