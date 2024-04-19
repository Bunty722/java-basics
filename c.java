import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckboxExample1 extends Application {
    public void start(Stage primaryStage) {
        // Create CheckBoxes for programming languages
        CheckBox javaCheckbox = new CheckBox("Java");
        CheckBox pythonCheckbox = new CheckBox("Python");
        CheckBox cSharpCheckbox = new CheckBox("C#");
        CheckBox javascriptCheckbox = new CheckBox("JavaScript");

        // Create a VBox to hold the CheckBoxes
        VBox vbox = new VBox(10); // Set spacing between CheckBoxes
        vbox.getChildren().addAll(javaCheckbox, pythonCheckbox, cSharpCheckbox, javascriptCheckbox);

        // Event handlers for CheckBoxes
        javaCheckbox.setOnAction(event -> handleCheckBoxSelection(javaCheckbox));
        pythonCheckbox.setOnAction(event -> handleCheckBoxSelection(pythonCheckbox));
        cSharpCheckbox.setOnAction(event -> handleCheckBoxSelection(cSharpCheckbox));
        javascriptCheckbox.setOnAction(event -> handleCheckBoxSelection(javascriptCheckbox));

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkbox Example");
        primaryStage.show();
    }

    // Event handler for CheckBox selection
    private void handleCheckBoxSelection(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            System.out.println(checkBox.getText() + " selected");
        } else {
            System.out.println(checkBox.getText() + " deselected");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
