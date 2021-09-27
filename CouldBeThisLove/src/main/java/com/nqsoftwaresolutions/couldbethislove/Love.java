package com.nqsoftwaresolutions.couldbethislove;

import java.util.Random;

public class Love {
    public static void main(String[] args) {
        System.out.println("your love score is "+calculateLove("Abdul Qayoom", "Nihan"));
    }
    public static int calculateLove (String yourName, String theirName){
        int loveScore = new Random().nextInt(101);
        String statement = "No love possible you will be forever alone...!!!";
        if (loveScore > 80){
            System.out.println("You love very much each other & you will be always with each other");
        }else if (loveScore > 40){
            System.out.println("You will be together for some time");
        }else {
            System.out.println(statement);
        }
        return loveScore;
    }
}