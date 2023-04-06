module com.example.w23comp1008s1w12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008s1w12 to javafx.fxml;
    exports com.example.w23comp1008s1w12;
}