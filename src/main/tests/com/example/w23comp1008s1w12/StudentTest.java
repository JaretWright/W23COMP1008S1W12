package com.example.w23comp1008s1w12;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student;

    @org.junit.Before
    public void setUp() throws Exception {
        student = new Student("Fred Flintstone",100001, LocalDate.of(1965,10,10));
    }

    @org.junit.Test
    public void setName() {
        student.setName("Oscar Grouch");
        assertEquals("Oscar Grouch", student.getName());
    }

    @org.junit.Test
    public void setStudentNum() {
    }

    @org.junit.Test
    public void setBirthday() {
    }

    @org.junit.Test
    public void testToString() {
    }

    @org.junit.Test
    public void getAge() {
    }
}