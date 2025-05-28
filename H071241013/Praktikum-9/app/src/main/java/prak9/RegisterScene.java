package prak9;

import java.io.File;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import prak9.model.User;

public class RegisterScene {
    private Scene scene;
    private Image profileImage;

    public RegisterScene(Main mainApp) {
        // Layout utama dengan padding dan background gradient
        VBox root = new VBox(18);
        root.setPadding(new Insets(32));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: linear-gradient(to bottom right, #e0eafc, #cfdef3);");

        // Judul halaman
        Text title = new Text("Welcome!");
        title.setFont(Font.font("Arial", 28));
        title.setFill(Color.web("#007ACC"));

        // Field untuk nickname
        TextField nickNameField = new TextField();
        nickNameField.setPromptText("Enter your nickname");
        nickNameField.setMaxWidth(250);

        // Field untuk nama lengkap
        TextField fullNameField = new TextField();
        fullNameField.setPromptText("Enter your full name");
        fullNameField.setMaxWidth(250);

        // Membuat lingkaran untuk clip foto profil
        Circle circleClip = new Circle(60, 60, 60);

        // ImageView untuk foto profil bundar dengan shadow
        ImageView imageView = new ImageView();
        imageView.setFitHeight(120);
        imageView.setFitWidth(120);
        imageView.setPreserveRatio(false);
        imageView.setClip(circleClip);
        imageView.setStyle("-fx-effect: dropshadow(gaussian, #007ACC, 8, 0.2, 0, 2);");

        // Shadow effect di luar lingkaran
        DropShadow shadow = new DropShadow();
        shadow.setRadius(10);
        shadow.setColor(Color.web("#007ACC", 0.25));
        imageView.setEffect(shadow);

        // StackPane agar bisa menambah efek/overlay jika ingin
        StackPane imageStack = new StackPane(imageView);
        imageStack.setPrefSize(120, 120);

        // Tombol upload gambar profil dengan efek hover
        Button uploadButton = new Button("📁 Upload Profile Image");
        uploadButton.setStyle("-fx-background-color: #007ACC; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;");
        uploadButton.setOnMouseEntered(e -> uploadButton.setStyle("-fx-background-color: #005fa3; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        uploadButton.setOnMouseExited(e -> uploadButton.setStyle("-fx-background-color: #007ACC; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        uploadButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                profileImage = new Image(file.toURI().toString());
                imageView.setImage(profileImage);
            }
        });

        // Label error untuk validasi input
        Label errorLabel = new Label();
        errorLabel.setTextFill(Color.RED);
        errorLabel.setFont(Font.font(13));
        errorLabel.setVisible(false);

        // Tombol submit/daftar dengan efek hover
        Button submitButton = new Button("🚀 Register");
        submitButton.setStyle("-fx-background-color: #28a745; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;");
        submitButton.setOnMouseEntered(e -> submitButton.setStyle("-fx-background-color: #218838; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        submitButton.setOnMouseExited(e -> submitButton.setStyle("-fx-background-color: #28a745; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        submitButton.setOnAction(e -> {
            // Validasi input
            if (nickNameField.getText().isEmpty() || fullNameField.getText().isEmpty() || profileImage == null) {
                errorLabel.setText("Please fill all fields and upload a profile image.");
                errorLabel.setVisible(true);
                return;
            }
            errorLabel.setVisible(false);
            // Membuat objek User dan berpindah ke HomeScene
            User user = new User(nickNameField.getText(), fullNameField.getText(), profileImage);
            mainApp.goToHomeScene(user);
        });

        // Menambahkan semua elemen ke layout
        root.getChildren().addAll(
            title,
            nickNameField,
            fullNameField,
            imageStack,
            uploadButton,
            submitButton,
            errorLabel
        );
        scene = new Scene(root, 370, 540); // Scene lebih tinggi agar tidak padat
    }

    public Scene getScene() {
        return scene;
    }
}
