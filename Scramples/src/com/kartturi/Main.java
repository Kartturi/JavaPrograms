package com.kartturi;

public class Main {

    public static boolean scramble(String str1, String str2) {


        String[] str2Arr = str1.split("");
        String[] str1Arr = str2.split("");

        for(int j = 0; j < str1Arr.length; j++) {
            boolean tempBool = false;
            for(int i = 0; i < str2Arr.length; i++) {

                if(str1Arr[j].equals(str2Arr[i]) ) {

                    tempBool = true;
                    str2Arr[i] = null;
                    break;
                }

            }

            if(tempBool == true) {
                tempBool = false;
            } else {
                System.out.println(str1Arr[j]);
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(scramble("rkqodlw","world"));
    }
}
