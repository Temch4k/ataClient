module com.example.clientside_ata {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.clientside_ata to javafx.fxml;
    exports com.example.clientside_ata;
}