module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo3 to javafx.fxml;
    exports org.example.demo3;
}