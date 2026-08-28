module ni.edu.uam.inscribirclases {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.inscribirclases to javafx.fxml;
    exports ni.edu.uam.inscribirclases;
}