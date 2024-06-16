import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;

public class LayoutExample extends Application {
    public void start(Stage primaryStage) {
        // VBox layout
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));

        // HBox layout
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10));
        hbox.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));

        // GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(new Button("Button 1"), 0, 0);
        gridPane.add(new Button("Button 2"), 1, 0);
        gridPane.add(new Button("Button 3"), 0, 1);
        gridPane.add(new Button("Button 4"), 1, 1);

        // BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));
        borderPane.setTop(new Button("Top"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setCenter(new Button("Center"));
        borderPane.setRight(new Button("Right"));
        borderPane.setBottom(new Button("Bottom"));

        // StackPane layout
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(new Button("Button"));

        // Create a TabPane and add layouts as tabs
        TabPane tabPane = new TabPane();
        tabPane.getTabs().addAll(
                new Tab("VBox", vbox),
                new Tab("HBox", hbox),
                new Tab("GridPane", gridPane),
                new Tab("BorderPane", borderPane),
                new Tab("StackPane", stackPane)
        );

        Scene scene = new Scene(tabPane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Layout Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
