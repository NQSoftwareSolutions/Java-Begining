package com.nqsoftwaresolutions.javapractice;

import java.util.Date;

public class BasicsMain {
    public static void main(String[] args) {
        //This code will print on console
        System.out.print("Hello to java from android");
        System.out.println(" Hello with println");
        System.out.println("hello with println");

        // this is single line comment
        /**
         * this is java doc comment
         */
        /*
        this is multiline comment
         */

        int mCash; //Definition of mCash variable which has integer type
        mCash = 10; // Initialization of mCash variable by assigning to value 10.

        // this is constant & return us today date.
        final Date TODAY_DATE = new Date();
        System.out.println("Today is "+ TODAY_DATE);

    }

}