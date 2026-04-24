module com.mycompany.task4_calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.task4_calculator to javafx.fxml;
    exports com.mycompany.task4_calculator;
}
