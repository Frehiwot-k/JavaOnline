package com.fundamentals;

import com.fundamentals.lessons.Lesson5;

public class Main {
    public static void main(String[] args){
        //write your code here(single line commit)


        /*
        * multi line commit
        * */

        //System.out.println("Hello Java");

        //House myHouse = new House();
        //Lesson3Ex myLesson3Ex = new Lesson3Ex();
        //myLesson3Ex.someMethod();

        lesson5Examples();

}//end main method

    public static void lesson5Examples(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,15);
        int value = myLesson5.showLocalWithReturn(25,19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5,8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();

    }//end lesson5Examples method

}//end class





