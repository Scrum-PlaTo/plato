module com.teamplato.plato {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.teamplato.plato to javafx.fxml;
    exports com.teamplato.plato;
}