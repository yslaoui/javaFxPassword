package password;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class PasswordApp extends Application {
    @Override
    public void start(Stage window) {

        // Components
        Label passwordLabel = new Label("Enter your password");
        PasswordField field = new PasswordField();
        Button button = new Button("Login");
        Label errorMessage = new Label("");
        Label welcomeMessage = new Label("Welcome to your personal space");

        // Layouts
        GridPane passwordLayout = new GridPane();
        passwordLayout.setPrefSize(300, 180);
        passwordLayout.setAlignment(Pos.CENTER);
        passwordLayout.setVgap(10);
        passwordLayout.setHgap(10);
        passwordLayout.setPadding(new Insets(20, 20, 20, 20));

        passwordLayout.add(passwordLabel, 0,0);
        passwordLayout.add(field, 0,1);
        passwordLayout.add(button, 0,2);
        passwordLayout.add(errorMessage, 0,3);

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.setAlignment(Pos.CENTER);
        welcomeLayout.setPadding(new Insets(20, 20, 20, 20));

        welcomeLayout.getChildren().add(welcomeMessage);


        //Scenes
        Scene passwordScene = new Scene(passwordLayout);
        Scene welcomeScene = new Scene(welcomeLayout);

        window.setTitle("Password App");
        window.setScene(passwordScene);

        // Event Handlers
        button.setOnAction((event) -> {
            if (field.getText().trim().equals("password")) {
               window.setScene(welcomeScene);
            }
            else {
                errorMessage.setText("Invalid password. Please try again");
            }
        });


        window.show();

    }

    public static void main(String[] args) {
        launch(PasswordApp.class);
    }
}
