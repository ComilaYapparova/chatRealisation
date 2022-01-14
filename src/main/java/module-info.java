module com.example.chatrealisation {
    requires javafx.controls;
    requires javafx.fxml;


    opens server.chatrealisation to javafx.fxml;
    exports server;
}