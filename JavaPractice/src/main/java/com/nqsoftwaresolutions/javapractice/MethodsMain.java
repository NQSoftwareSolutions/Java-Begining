package com.nqsoftwaresolutions.javapractice;

public class MethodsMain {
    public static void main(String[] args) {
        getMilk(2);
        getMilk(20);
        getMilk(3);
    }

    /**
     * @param noOfPackets of milk
     *                    this is method for getting the milk
     */
    private static void getMilk(int noOfPackets) {
        goForMilk();
        int price = milkPrice(noOfPackets);
        System.out.println("get "+noOfPackets +" " +
                "packets of milk & pay only "+price+" rupees not more then that");
        returnBackWithMilk();
    }

    public static int milkPrice (int noOfPackets){
        return noOfPackets * 10;
    }

    /**
     * This is methods for going to milk shop
     */
    public static void goForMilk(){
       System.out.println("Open the door");
       System.out.println("close the door");
       System.out.println("go to straight for 1km");
       System.out.println("turn right");
       System.out.println("go for 100 meter");
   }

    /**
     * This is methods for return back from milk shop
     */
   public static void returnBackWithMilk(){
       System.out.println("turn around");
       System.out.println("go for 100 meter");
       System.out.println("turn left");
       System.out.println("go to straight for 1km");
       System.out.println("Open the door");
       System.out.println("close the door");
   }
}
