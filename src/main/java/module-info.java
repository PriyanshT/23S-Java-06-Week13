module com.georgiancollege.week13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens com.georgiancollege.week13 to javafx.fxml, com.google.gson;
    exports com.georgiancollege.week13;
}