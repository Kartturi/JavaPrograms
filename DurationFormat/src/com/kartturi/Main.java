package com.kartturi;


public class Main {
    int year;
    int days;
    int hours;
    int minutes;
    int seconds;

    public static String formatDuration(int seconds) {
     // your code goes here

        return "";
    }

    public static int calcYear(int seconds) {
        int oneYearInSeconds = 3600 * 24 * 365;

        if(seconds <= oneYearInSeconds) {
            return 0;
        }


        double result = Math.floor(seconds/oneYearInSeconds);
         int convertToInt = (int)result;

        return  convertToInt;
    }

    public static int calcDays(int seconds) {
        int oneDay = 3600 * 24;
        double totalDays = Math.floor((seconds/3600/24) % 365);

        if(seconds <= oneDay) {
            return 0;
        }

        return (int) totalDays;

    }
    public static int calcHours(int seconds) {
        int oneHour = 3600 * 60;
        double remainingHours = Math.floor((seconds/3600/24/60) % 60);

        if(seconds <= oneHour) {
            return 0;
        }

        return (int) remainingHours;

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Years: "+ calcYear((3600 * 24 * 732)));
        System.out.println("day " + calcDays((3600 * 24 * 732)));
        System.out.println("hour " + calcHours((3600 * 24 * 732 + )));


    }
}
