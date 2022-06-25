package com.fundamentals.lessons;
/*
* string and more
* */

import java.lang.reflect.Method;
import java.util.Locale;

public class Lesson6 {
    String myString = "Hello";
    // Method shows string methode for ChartAt
    public void exampleCharAt(){
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    }//end methode exampleCharAt

    //Method compare two string to see if they  are equal
    public void exampleEquals(String value){
        boolean myBoolean = myString.equals(value);
        System.out.println(myBoolean);
    }//end methode exampleEqual

    //Method takes a string and converts it all lowercase
    public String exampleLowercase(){
        return myString.toLowerCase();
    }//end method exampleLowercase

    //Methode takes a string and coverts it all uppercase
    public String exampleUppercase(){
        return myString.toUpperCase();
    }//end exampleUppercase

    //method determines the length of a string
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);
    }//end exampleLength

    //Example how to ude the stringBuilder class
    public void exampleBuilder(String food,int value){
        StringBuilder  builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ");
        builder.append(value).append(" plates of it.");
        String fav = builder.toString();
        System.out.println(fav);
    }//end exampleBuilder

    // Method for showing the char data type
    public void exampleChar(){
        char c1 = 't';//\u0074
        char c2 = '\u00A7';
        System.out.println(c2);
    }//end exampleChar

    // Method show escape sequences
    public void exampleEscape(){
        System.out.println("That \'s a cool toy. \tCan I\n play with it");
    }//end exampleEscape
}//end class
