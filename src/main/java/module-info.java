module com.example.newyearprojectyaaass {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.newyearprojectyaaass to javafx.fxml;
    exports com.example.newyearprojectyaaass;
}