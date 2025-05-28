package prak9;

import java.io.File;
import java.util.ArrayList;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import prak9.model.Post;
import prak9.model.User;

public class HomeScene {
    private final Scene scene;
    private final VBox postsContainer = new VBox(15);
    private final ArrayList<Post> posts = new ArrayList<>();

    public HomeScene(User user) {
        // Layout utama
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: linear-gradient(to bottom right, #e0eafc, #cfdef3);");

        // Judul aplikasi
        Label title = new Label("Welcome to Eeeeeeee!");
        title.setFont(new Font("Arial", 24));
        title.setTextFill(Color.web("#333"));

        // Info profil user
        Label nameLabel = new Label("Name: " + user.getFullName());
        Label nickLabel = new Label("Nickname: @" + user.getNickName());
        nameLabel.setFont(new Font(16));
        nickLabel.setFont(new Font(14));

        HBox profileBox = new HBox(15);
        profileBox.setAlignment(Pos.CENTER_LEFT);

        // Foto profil dengan efek shadow
        ImageView profileView = new ImageView(user.getProfileImage());
        profileView.setFitHeight(80);
        profileView.setFitWidth(80);
        profileView.setStyle("-fx-effect: dropshadow(three-pass-box, gray, 5, 0.3, 0, 2); -fx-background-radius: 10;");

        VBox infoBox = new VBox(5, nameLabel, nickLabel);
        profileBox.getChildren().addAll(profileView, infoBox);

        // Tombol tambah post dengan efek hover
        Button addPostButton = new Button("➕ Add New Post");
        addPostButton.setStyle("-fx-background-color: #007ACC; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;");
        addPostButton.setOnMouseEntered(e -> addPostButton.setStyle("-fx-background-color: #005fa3; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        addPostButton.setOnMouseExited(e -> addPostButton.setStyle("-fx-background-color: #007ACC; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;"));
        addPostButton.setOnAction(e -> openAddPostWindow());

        // Container untuk post
        postsContainer.setPadding(new Insets(10));
        ScrollPane scrollPane = new ScrollPane(postsContainer);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent;");

        // Menambahkan semua elemen ke root
        root.getChildren().addAll(title, profileBox, addPostButton, scrollPane);
        scene = new Scene(root, 450, 650);
    }

    // Membuka window untuk membuat post baru
    private void openAddPostWindow() {
        Stage stage = new Stage();
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 15;");

        // Field caption
        TextField captionField = new TextField();
        captionField.setPromptText("Caption");
        captionField.setPrefWidth(250);

        // Preview gambar post
        ImageView postImageView = new ImageView();
        postImageView.setFitWidth(250);
        postImageView.setFitHeight(180);
        postImageView.setStyle("-fx-border-color: #ccc; -fx-border-radius: 5;");

        // Tombol upload gambar
        Button uploadBtn = new Button("📁 Choose Image");
        uploadBtn.setStyle("-fx-background-color: #6c757d; -fx-text-fill: white; -fx-background-radius: 10;");
        uploadBtn.setOnMouseEntered(e -> uploadBtn.setStyle("-fx-background-color: #495057; -fx-text-fill: white; -fx-background-radius: 10;"));
        uploadBtn.setOnMouseExited(e -> uploadBtn.setStyle("-fx-background-color: #6c757d; -fx-text-fill: white; -fx-background-radius: 10;"));

        final Image[] postImage = new Image[1];

        uploadBtn.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                postImage[0] = new Image(file.toURI().toString());
                postImageView.setImage(postImage[0]);
            }
        });

        // Tombol submit post
        Button submitBtn = new Button("📤 Post");
        submitBtn.setStyle("-fx-background-color: #28a745; -fx-text-fill: white; -fx-background-radius: 10;");
        submitBtn.setOnMouseEntered(e -> submitBtn.setStyle("-fx-background-color: #218838; -fx-text-fill: white; -fx-background-radius: 10;"));
        submitBtn.setOnMouseExited(e -> submitBtn.setStyle("-fx-background-color: #28a745; -fx-text-fill: white; -fx-background-radius: 10;"));

        submitBtn.setOnAction(e -> {
            // Validasi input
            if (postImage[0] != null && !captionField.getText().isEmpty()) {
                Post newPost = new Post(captionField.getText(), postImage[0]);
                posts.add(newPost);
                renderPost(newPost); // Tampilkan post baru
                stage.close();
            }
        });

        layout.getChildren().addAll(captionField, uploadBtn, postImageView, submitBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 350, 450);
        stage.setScene(scene);
        stage.setTitle("New Post");
        stage.show();
    }

    // Menampilkan post ke dalam postsContainer
    private void renderPost(Post post) {
        StackPane stack = new StackPane();
        stack.setStyle("-fx-border-radius: 10; -fx-padding: 5px;");

        // Gambar post dengan efek shadow
        ImageView imageView = new ImageView(post.getPostImage());
        imageView.setFitHeight(200);
        imageView.setFitWidth(300);
        imageView.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.3), 10, 0.5, 0, 5);");

        // Caption yang muncul saat hover
        Label caption = new Label(post.getCaption());
        caption.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7); -fx-text-fill: white; -fx-padding: 10px; -fx-font-size: 14px;");
        caption.setVisible(false);
        caption.setMaxWidth(300);
        caption.setWrapText(true);

        stack.getChildren().addAll(imageView, caption);
        StackPane.setAlignment(caption, Pos.BOTTOM_CENTER);

        // Efek hover: caption muncul saat mouse di atas gambar
        imageView.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> caption.setVisible(true));
        imageView.addEventHandler(MouseEvent.MOUSE_EXITED, e -> caption.setVisible(false));

        // Animasi fade-in saat post baru muncul
        FadeTransition ft = new FadeTransition(Duration.millis(600), stack);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();

        postsContainer.getChildren().add(stack);
    }

    public Scene getScene() {
        return scene;
    }
}
