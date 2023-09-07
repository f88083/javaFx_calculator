module com.simonlai.application.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.simonlai.application.calculator to javafx.fxml;
    exports com.simonlai.application.calculator;
}