package com.kartturi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static String stat(String strg) {
        // your code
        String[] strArr = strg.split(", ");
        ArrayList<Integer> numArr = new ArrayList<Integer>();


        for(String s : strArr) {
            String[] timeArr = s.split("[|]");
            int counter = 0;
            int totalSeconds = 0;
            for(String ss : timeArr) {
                int tempInt = Integer.parseInt(ss);
                if(counter == 0) {
                    totalSeconds += tempInt * 60 *60;
                } else if(counter == 1) {
                    totalSeconds += tempInt * 60;
                } else {
                    totalSeconds += tempInt;
                }

                counter++;
            }
            numArr.add(totalSeconds);
        }



        Collections.sort(numArr);

        int range = numArr.get(numArr.size() -1) - numArr.get(0);
        int mean;

        int sum = 0;

        for(int i : numArr) {
            sum += i;
        }

        mean = sum / numArr.size();
        int medianIndex = (int) Math.ceil(numArr.size() / 2);
        System.out.println(medianIndex);
        int median = numArr.get(medianIndex);


        String resultStr = String.format("Range: %s Average: %s Median: %s",formatToSeconds(range),
                formatToSeconds(mean), formatToSeconds(median) );

        return resultStr;
    }

    public static String formatToSeconds(int timeInSeconds) {
        int hours = timeInSeconds / 3600;
        int secondsLeft = timeInSeconds - hours * 3600;
        int minutes = secondsLeft / 60;
        int seconds = secondsLeft - minutes * 60;

        String formattedTime = "";
        if (hours < 10)
            formattedTime += "0";
        formattedTime += hours + "|";

        if (minutes < 10)
            formattedTime += "0";
        formattedTime += minutes + "|";

        if (seconds < 10)
            formattedTime += "0";
        formattedTime += seconds ;

        return formattedTime;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41"));
    }
}
