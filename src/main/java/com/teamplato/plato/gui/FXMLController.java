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

import com.teamplato.plato.bol.Teacher;
import com.teamplato.plato.dal.DAO;
import com.teamplato.plato.dal.Teachers_DAO;

/**
 * FXML Controller class
 *
 * @author nicks
 */
public class FXMLController implements Initializable {
    
    ObservableList<Teacher> list;
    DAO teachersDAO = new Teachers_DAO();
    
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
    private ChoiceBox<?> cmbTeacherTechnicalGr1;
    @FXML
    private ChoiceBox<?> cmbTeacherTechnicalGr2;
    @FXML
    private ChoiceBox<Teacher> cmbTeacherPersonalGr1;
    @FXML
    private ChoiceBox<?> cmbTeacherPersonalGr2;
    @FXML
    private ChoiceBox<?> cmbRoomGr1;
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
        setcmbTeacherPersonalGr1();
    }    
    
    //method for showing database table in the GUI/View
    private void setcmbTeacherPersonalGr1(){
        list = FXCollections.observableArrayList(teachersDAO.getAll());
        cmbTeacherPersonalGr1.setItems(list);
    }
    
}
