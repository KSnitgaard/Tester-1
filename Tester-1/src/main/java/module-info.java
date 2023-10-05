module com.example.tester1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tester1 to javafx.fxml;
    exports com.example.tester1;
}