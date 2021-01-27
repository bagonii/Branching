package com.example.branching;

import java.util.Scanner;

public class Branching {

    public static void main(String[] args) {
        practicalTaskNo1_1();
        practicalTaskNo1_2();
        practicalTaskNo1_3();
        practicalTaskNo1_4();
        practicalTaskNo1_5();
    }

    static void practicalTaskNo1_1() {
        short a = -5;
        short b = 50;
        if (a < b) {
            System.out.println("largest number " + b);
            System.out.println("smallest number " + a);
        } else {
            System.out.println("smallest number " + b);
            System.out.println("largest number " + a);
        }
        {
            System.out.println("numbers are " + (a == b ? "equals" : "not equals"));
        }
        {
            System.out.println("one number is " + (a % 2 == 0 ? "even" : "odd"));
        }
        {
            System.out.println("another number is " + (b % 2 != 0 ? "odd" : "even"));
        }
        {
            System.out.println("one number is " + (a > 0 ? "positive" : "negative"));
        }
        {
            System.out.println("another number is " + (b > 0 ? "positive" : "negative"));
        }
        if ((a < 100) || (b < 100)) {
            System.out.println("there are numbers less than 100");
        }
    }

    static void practicalTaskNo1_2() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("enter time!");
        }
        int time = input.nextInt();
        if (time <= 12 && time > 0) {
            System.out.println("Good Morning Sunshine!");
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon.Work hard!");
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good Evening.Get some rest!");
        } else {
            System.out.println("There is no such time! Please choose time from 1 to 24");
        }
    }

    static void practicalTaskNo1_3() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please write the day");
        }
        int day = input.nextInt();
        {
            System.out.println("Please write the month");
        }
        int month = input.nextInt();
        {
            System.out.println("Please write the year");
        }
        int year = input.nextInt();
        {
            System.out.println("Please select the date formatting. 1 - YYYY/MM/DD 2 - YYYY.MM.DD");
        }
        int format = input.nextInt();

        if ((day <= 0) || (day > 31) || (month <= 0) || (month > 12) || (year <= 0)) {
            System.out.println("Incorrect date! Please try again!");
            return;
        }
        if ((month == 2) && (day > 28)) {
            System.out.println("Incorrect date! Please try again!");
            return;
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 31)) {
            System.out.println("Incorrect date! Please try again!");
        } else {
            if (format == 1) {
                System.out.println("Your date is: " + year + "/" + month + "/" + day);
            } else {
                System.out.println("Your date is:" + year + "." + month + "." + day);
            }
        }
    }

    static void practicalTaskNo1_4() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please enter the day of the year");
        }
        int day = input.nextInt();
        {
            System.out.println("The day number is: " + day);
        }
        if ((day >= 1) && (day <= 31)) {
            System.out.println("It is: January");
        } else if ((day > 32) && (day <= 59)) {
            System.out.println("It is: February");
        } else if ((day > 60) && (day <= 90)) {
            System.out.println("It is: March");
        } else if ((day > 91) && (day <= 120)) {
            System.out.println("It is: April");
        } else if ((day > 121) && (day <= 151)) {
            System.out.println("It is: May");
        } else if ((day > 152) && (day <= 181)) {
            System.out.println("It is: June");
        } else if ((day > 182) && (day <= 212)) {
            System.out.println("It is: July");
        } else if ((day > 213) && (day <= 243)) {
            System.out.println("It is: August");
        } else if ((day > 244) && (day <= 273)) {
            System.out.println("It is: September");
        } else if ((day > 274) && (day <= 304)) {
            System.out.println("It is: October");
        } else if ((day > 305) && (day <= 334)) {
            System.out.println("It is: November");
        } else if ((day > 335) && (day <= 365)) {
            System.out.println("It is: December");
        } else {
            System.out.println("There are only 365 days in the year! Try again!");
        }
    }

    static void practicalTaskNo1_5() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please enter your working hours per day.");
            int workingHoursInDay = input.nextInt();
            if ((workingHoursInDay) >= 1 && (workingHoursInDay <= 8)) {
                workingHoursInDay = workingHoursInDay * 10;
                System.out.println("Your salary is: " + workingHoursInDay);
            } else if (workingHoursInDay > 8) {
                workingHoursInDay = (80 + (workingHoursInDay - 8) * 15);
                System.out.println("Your salary is: " + workingHoursInDay);
            } else {
                System.out.println("Impossible Working Hours!");
            }
        }
    }
}