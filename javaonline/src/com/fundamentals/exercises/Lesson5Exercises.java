package com.fundamentals.exercises;

public class Lesson5Exercises {
    //Exercises 1
    // Decimal value of 29
    int value = 29;

    // Hexadecimal value of 29
    int value2 = 0x1d;
    // binary value of 29
    int value3 = 0b11101;

    public void decimalEx(){
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);


    }

    //widening Exercise 2

    public void wideningConversion() {
        byte myByte = 125;
        short myShort = 120_66;
        int myInt = 10_564;

        int byteToInt = myByte;
        long shortToLong = myShort;
        float intToFloat = myInt;

        System.out.println(byteToInt);
        System.out.println(shortToLong);
        System.out.println(intToFloat);
    }

    public void narrowingConversion() {

        double myDouble = 125_673.89D;
        float myFloat = 120_066.78F;
        long myLong = 10_564_786L;

        long doubleToLong = (long) myDouble;
        int floatToInt = (int) myFloat;
        short longToShort = (short) myLong;

        System.out.println(doubleToLong);
        System.out.println(floatToInt);
        System.out.println(longToShort);
    }

}
