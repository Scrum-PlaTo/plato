package com.teamplato.plato.service;

import java.time.Duration;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Thijme.Langelaar
 */
public class ServiceTests {

    /**
     * Teacher tests
     */
    @Test
    void creatingEmailFromNormalNameTest(){
        Teacher teacher = new Teacher("Thijme Langelaar");
        assertEquals("Thijme.Langelaar@calco.nl", teacher.getEmail());
        teacher = null;
    }

    @Test
    void creatingEmailFromDifficultNameTest(){
        Teacher teacher = new Teacher("Bob de Bouwer");
        assertEquals("Bob.deBouwer@calco.nl", teacher.getEmail());
        teacher = null;
    }

    /**
     * Course tests
     */

    @Test
    void createLocalDateFromStringTest(){
        Course course = new Course();
        course.setStartTime("10:00");
        assertEquals(LocalTime.parse("10:00"), course.getStartTime());
        course = null;
    }

    @Test
    void createDurationFromStringTest() {
        Course course = new Course();
        course.setDuration(5);
        assertEquals(Duration.ofHours(5), course.getDuration());
        course = null;
    }


}
