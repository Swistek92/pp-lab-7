module com.example.pplab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pplab7 to javafx.fxml;
    exports com.example.pplab7;
}