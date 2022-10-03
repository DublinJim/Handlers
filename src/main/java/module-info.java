module com.example.handlers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.handlers to javafx.fxml;
    exports com.example.handlers;
}