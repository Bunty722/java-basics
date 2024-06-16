import java.security.PublicKey;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class puppy extends Application
{
    private TextField tfCount;
    private Button btnCount;
    private int count =0;
    @Override
    public void start(Stage primaryStage)
    {
        //allocate controls
        tfCount =new TextField("0");
        tfCount.setEditable(false);
        btnCount=new Button("Count");
        //Regester event handling using lambda
        btnCount.setOnAction(evt -> tfCount.setText(++count + ""));
        //create a scene graph of node rooted at a flowplane
        FlowPane flow=new FlowPane();
        flow.setPadding(new Insets(15,12,15,12));
        //top,bottom ,right,left
        flow.setVgap(10);//vertical gap between nodes in pixels
        flow.setHgap(10);//horigantal gap between nodes in pexels
        flow.setAlignment(Pos.CENTER);//alignment
        flow.getChildren().addAll(new Label("count : "),tfCount,btnCount);
        //setup scene and stage 
        primaryStage.setScene(new Scene(flow,400,80));
        primaryStage.show();


    }
    public static void main(String[]args) 
    {
        launch(args);
    }
}




