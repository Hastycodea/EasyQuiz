module org.example.easyquiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.easyquiz to javafx.fxml;
    exports org.example.easyquiz;
}