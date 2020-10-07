module com.sergion {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;

    opens com.sergion to javafx.fxml;
    exports com.sergion;
}