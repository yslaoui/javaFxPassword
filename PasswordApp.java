package password;

import javafx.application.Application;
import javafx.stage.Stage;

public class PasswordApp extends Application {
    @Override
    public void start(Stage window) {
        window.setTitle("Password App");
        window.show();
    }

    public static void main(String[] args) {
        launch(PasswordApp.class);
    }
}
