module com.example.basen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basen to javafx.fxml;
    exports com.example.basen;
}