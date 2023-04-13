package com.example.w23comp1008s1w12;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClassViewController implements Initializable {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label msgLabel;
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField studentNumTextField;

    @FXML
    private Label ageLabel;

    @FXML
    private ListView<Student> listView;

    @FXML
    private Label nameLabel;

    @FXML
    private Label stNumLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        msgLabel.setText("");
        ArrayList<Student> students = new ArrayList<>();
        Student homer = new Student("Homer",20023, LocalDate.of(1965,05,12));
        Student marge = new Student("Marge",20024, LocalDate.of(1977,04,12));
        Student bart = new Student("Bart",20025, LocalDate.of(1985,06,15));
        students.add(homer);
        students.add(marge);
        students.add(bart);

        listView.getItems().add(homer);
        listView.getItems().add(bart);
        listView.getItems().addAll(students);
        listView.getItems().add(new Student("Maggie",20026,LocalDate.of(1990,01,29)));

//        listView.getItems().add(homer.toString());
//        listView.getItems().add(marge.toString());
//        listView.getItems().add(bart.toString());

        //create a listener to observe when a user clicks on an item in the listview
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, studentSelected) ->
        {
            stNumLabel.setText("St Num: "+studentSelected.getStudentNum());
            ageLabel.setText("Age: " + studentSelected.getAge());
            nameLabel.setText("Name: "+studentSelected.getName());
        });
    }

    @FXML
    void createStudent(ActionEvent event) {
        String name = nameTextField.getText();
        int studentNum = Integer.parseInt(studentNumTextField.getText());
        LocalDate birthday = datePicker.getValue();

        try{
            Student newStudent= new Student(name, studentNum,birthday);
            listView.getItems().add(newStudent);
            msgLabel.setText("Successfully added student");
        } catch (IllegalArgumentException e)
        {
            msgLabel.setText(e.getMessage());
        }

    }
    @FXML
    void showName(MouseEvent event) {

    }
}
