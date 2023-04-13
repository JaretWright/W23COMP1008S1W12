package com.example.w23comp1008s1w12;

public class StringExamples {
    public static void main(String[] args) {
        //when comparing Strings, which is the correct way?
        String myName = new String("  Ruth Anne   ");
        myName = myName.trim();   //"Ruth Anne" removes leading and trailing whitespaces
        myName = myName.replaceAll("\s", "");  //RuthAnne
        myName = myName.replaceAll("[0-9]", "");

        String name = new String("Jaret");

        System.out.println("using == " + myName == name);
        System.out.println("using .equals() "+ myName.equals(name));

        String course = "Intro to Objects";
        String courseName = "Intro to Objects";
        System.out.println("comparing using == " + course == courseName);

        //what are potential down sides of handling a date a String?
        //-don't have access to the date functions
        //-harder to treat as an actual date
        //-comparison is harder
        //
        //April 13, 2023
        //2023, 04, 13
        //2023, 13, 04
        //April 12, 23
        //"Strings are just characters in an array"
        //how old is someone?
    }
}
