package com.teamplato.plato.bol;

import com.teamplato.plato.service.Course;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * This class provides a boiler plate for the MC01 and MC02 agendas.
 * To be extended...
 * @author Thijme.Langelaar
 */
public class Agenda {
    private String agendaType;
    private LocalDate startDate;
    private ArrayList<Course> courses;

    public Agenda(LocalDate startDate){
        this.startDate = startDate;
    }

    public ArrayList<Course> retrieveCourses(){
        return null;
    }
}
