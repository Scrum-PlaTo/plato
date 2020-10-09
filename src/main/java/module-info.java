module com.teamplato.plato {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;
    
    exports com.teamplato.plato.gui to javafx.graphics, javafx.fxml;
    
    opens com.teamplato.plato to javafx.fxml;
    opens com.teamplato.plato.gui to javafx.fxml;
    
    exports com.teamplato.plato;
}