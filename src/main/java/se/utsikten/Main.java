
package se.utsikten;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Button button = new Button("Skapa avtal");

        button.setOnAction(event -> {
            System.out.println("Skapa avtal!");
        });

        VBox root = new VBox(20, button);

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Utsikten Avtal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
