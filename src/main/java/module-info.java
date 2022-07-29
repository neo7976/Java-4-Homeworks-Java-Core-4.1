module ru.sobinda.javacore41 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sobinda.javacore41 to javafx.fxml;
    exports ru.sobinda.javacore41;
}