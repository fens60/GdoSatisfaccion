module es.ieslosmontecillos.gdosatisfaccion {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.gdosatisfaccion to javafx.fxml;
    exports es.ieslosmontecillos.gdosatisfaccion;
}