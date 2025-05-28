package prak9;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage; // Menyimpan primary stage agar bisa diakses di seluruh class

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // Membuka scene register saat aplikasi pertama kali dijalankan
        RegisterScene registerScene = new RegisterScene(this);
        primaryStage.setTitle("Register");
        primaryStage.setScene(registerScene.getScene());
        primaryStage.show();
    }

    // Method untuk berpindah ke HomeScene setelah user register
    public void goToHomeScene(prak9.model.User user) {
        HomeScene homeScene = new HomeScene(user);
        primaryStage.setScene(homeScene.getScene());
        primaryStage.setTitle("Home");
    }

    public static void main(String[] args) {
        launch(args); // Menjalankan aplikasi JavaFX
    }
}

