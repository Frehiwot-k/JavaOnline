package com.fundamentals.lessons;

/*
* Lesson8 control flow statements
* */

public class Lesson8 {
    //This method shows an if statement
    public void basicIfExample(int num1, int num2){
        System.out.println("Before If statement");
        if(num1==num2){
            System.out.println("values are equal");
        }//end if
        System.out.println("After if statement");
    }//end Method basicIfExample

    //This method shows and if else statement

    public void basicIfElseExample(int alpha,int beta){
        System.out.println("Before if statement");
        if (alpha != beta){
            System.out.println("values are not equal");
        }else {
            System.out.println("the value are equal");
        }//end if else
        System.out.println("end of if else statement");

    }//end basic if else example

    //this method show an if else chain method

    public void basicIfElseChainExample(int value){
        if(value < 30){
            System.out.println("the value is less than 30");
        }else if(value <= 40){
            System.out.println("the value is greater than 30 but less than 40");
        }else {
            System.out.println("the value is greater than 40");
        }//end if else chain
    }//end basicIfElseChainExample

    //this method show how to use the And/or statement with if
    public void basicIfAndOrExample(int num){
        if (num> 100 || num < 50){
            System.out.println("The value is less than 50 or greater than 100");
        }//end if statement
        if(num %2 == 0 && num > 30){
            System.out.println("the value is greater than 30 and an even number");
        }//end if
    }//end And/or example

    //This method show how a switch statement is used
    public void basicSwitchExample(int day){
        switch (day) {
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
            case 3:
                System.out.println("day is either 2 or 3");
                break;
            default:
                System.out.println("day is greater than 3");
                break;
        }//end switch
    }//end switch

    //This method show how to do awhile loop
    public void basicWhileExample(){
        int val = 0; //initialize value
        while (val < 10){//expression
            System.out.println(val);
            val++; //increment
        }
    }//end basic while example

    //This method show how to do a Do while loop
    public void basicDoWhileExample(){
        int num = 0; //initialize
       do {
           if(num % 2 == 0){
               System.out.println(num);
           }
           num ++;//increment

       }while (num < 24); //expression
    }//end do while

    //This method show how to do for loop
    public void basicForLoopExample(){
        for (int i = 0; i < 10; i++){
          System.out.println(i);
        }//end for loop
    }//end basic for loop<

    //This method shows the branching statements of continue and break
    public void basicBranchExample(){
        for (int i = 0; i < 10; i++){
            if (i == 2){
                continue;
            }
            if(i == 4){
                System.out.println("Loop breaks");
                break;
            }
            System.out.println(i);
        }//end for loop
        System.out.println("end of loop");
    }//end basic branch example

}//end class
