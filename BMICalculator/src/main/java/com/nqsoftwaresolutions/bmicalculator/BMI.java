package com.nqsoftwaresolutions.bmicalculator;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        welcome();
        System.out.println("Your BMI score is "+calculateBMI(getHeight(),getWeight()));
    }
    public static double calculateBMI(double yourHeight, double yourWeight){
        double bmi = (yourWeight / yourHeight / yourHeight ) * 10000;
        if (bmi >= 30.0){
            System.out.println("You are obese");
        }else if(bmi >= 25.0){
            System.out.println("You are over weight");
        }else if(bmi >= 18.5){
            System.out.println("You are healthy");
        }else {
            System.out.println("You are under weight");
        }
        return bmi;
    }
    public static void welcome (){
        System.out.println("Hello to the BMI Calculator");
        System.out.println("<<<<<<<<<<<<<---------------->>>>>>>>>>>>>>>");
    }
    public static double getHeight(){
        System.out.println();
        System.out.print("Enter you height in feet : ");
        double height = new Scanner(System.in).nextDouble();
        return height  * 30.48;
    }
    public static double getWeight (){
        System.out.print("Enter you wight in kg : ");
        double weight = new Scanner(System.in).nextDouble();
        return weight;
    }
}