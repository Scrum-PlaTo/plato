/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamplato.plato.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import com.teamplato.plato.service.*;

/**
 * FXML Controller class
 *
 * @author nicks
 */
public class FXMLController implements Initializable {

    private TeachersDAOImpl teachersDAO = new TeachersDAOImpl();
    private ObservableList<Teacher> teacherObservableList = FXCollections.observableArrayList(teachersDAO.getAll());

    private RoomsDAOImpl roomsDAO = new RoomsDAOImpl();
    private ObservableList<Room> roomObservableList = FXCollections.observableArrayList(roomsDAO.getAll());

    private GroupsDAOImpl groupsDAO = new GroupsDAOImpl();
    private ObservableList<Group> groupObservableList = FXCollections.observableArrayList(groupsDAO.getAll());

    private CoursesDAOImpl coursesDAO = new CoursesDAOImpl();
    private ObservableList<Course> courseObservableList = FXCollections.observableArrayList(coursesDAO.getAll());

    @FXML
    private ChoiceBox<?> cmbAgenda;
    @FXML
    private DatePicker dtpStartDate;
    @FXML
    private RadioButton rbtOneGroup;
    @FXML
    private ToggleGroup toggleRbtGroups;
    @FXML
    private RadioButton rbtTwoGroups;
    @FXML
    private ChoiceBox<Teacher> cmbTeacherTechnicalGr1;
    @FXML
    private ChoiceBox<?> cmbTeacherTechnicalGr2;
    @FXML
    private ChoiceBox<Teacher> cmbTeacherPersonalGr1;
    @FXML
    private ChoiceBox<?> cmbTeacherPersonalGr2;
    @FXML
    private ChoiceBox<Room> cmbRoomGr1;
    @FXML
    private ChoiceBox<?> cmbRoomGr2;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnConfirm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Adds all the teachers to the GUI/View
        setCmbTeacherPersonalGr1();
        setCmbTeacherTechnicalGr1();

        setCmbRoomGr1();
    }

    //method for showing database table in the GUI/View
    private void setCmbTeacherPersonalGr1(){
        cmbTeacherPersonalGr1.setItems(teacherObservableList);
    }

    private void setCmbTeacherTechnicalGr1() {
        cmbTeacherTechnicalGr1.setItems(teacherObservableList);
    }

    private void setCmbRoomGr1() {
        cmbRoomGr1.setItems(roomObservableList);
    }

}
