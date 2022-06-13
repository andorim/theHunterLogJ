module de.andorim.thehunterlogj {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.andorim.thehunterlogj to javafx.fxml;
    exports de.andorim.thehunterlogj;
}