package com.pluralsight;

import java.util.Random;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 30000;
        int garySalary = 45000;
        // find highest
        @SuppressWarnings("DataFlowIssue")
        int highestSalary = Math.max(bobSalary, garySalary);
        //print highest
        System.out.println("The highest salary is " + highestSalary );


        //question 2
        int carPrice = 65000;
        int truckPrice = 70000;
        @SuppressWarnings("DataFlowIssue")
        int lowestCarPrice = Math.min(carPrice, truckPrice);
        //find highest
        System.out.println("The lowest price is " + lowestCarPrice);

        //question 3
        double radius = 7.25;
        System.out.println("The area is " + (Math.PI * radius * radius));

        //question 4
        double sqrtNum = 5.0;
        System.out.println("The square root is " + Math.sqrt(sqrtNum));

        //question 6
        double absNum = -3.8;
        System.out.println("The absolute value is " + Math.abs(absNum));

        //question 7
        Random rand = new Random();
        int randInt = rand.nextInt(2);
        System.out.println("Your random number is " + randInt);

        //question 8
        int days = 24;
        int hoursInDay = 24;
        int minsInHour = 60;
        int totalMins = days * hoursInDay *  minsInHour;
        System.out.println("There are " + totalMins + " minutes in " + days + " days");


    }
}