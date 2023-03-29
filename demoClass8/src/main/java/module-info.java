module com.example.democlass8 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.democlass8 to javafx.fxml;
    exports com.example.democlass8;
}