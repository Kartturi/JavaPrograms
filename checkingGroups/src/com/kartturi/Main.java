package com.kartturi;

public class Main {

    public static boolean groupCheck(String s){

        String[] arr = s.split("");
        int countBracket = 0;
        int countCurly = 0;
        int countArrBracket = 0;

        if(arr.length % 2 != 0) {
            return false;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            //check if first or last is invalid bracket
            if(checkIfRight(arr[0]) || checkIfRight(arr[arr.length - 1])) {
                return false;
            }

            //check if next char is right
            if(checkIfRight(arr[i + 1])) {

            }
        }

        return true;
    }

    public static boolean checkIfRight(String bracket) {
        String[] bracketArr = {")", "]", "}"};



        for(String s : bracketArr) {
            if(s == bracket) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
	// write your code here


        System.out.println(groupCheck("[()]"));
    }
}
