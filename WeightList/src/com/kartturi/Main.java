package com.kartturi;


public class Main {

    public static String orderWeight(String strng) {
        // your code
        String[] strArr = strng.split(" ");
        int[] cloneArr = new int[strArr.length];

        //fill clone array with calculated nums
        for(int i = 0; i < strArr.length; i++) {
            String[] tempStrArr = strArr[i].split("");
            int sum = 0;
            for(String ss : tempStrArr) {
                sum += Integer.parseInt(ss);
            }
            cloneArr[i] = sum;
        }

        //sorting with bubble
        int temp = 0;
        String strTemp = "";
        for(int i=0; i < strArr.length; i++){
            for(int j=1; j < (strArr.length-i); j++){
                if(cloneArr[j-1] > cloneArr[j]){
                    //swap cloneArr
                    temp = cloneArr[j-1];
                    cloneArr[j-1] = cloneArr[j];
                    cloneArr[j] = temp;
                    //swap strArr
                    strTemp = strArr[j-1];
                    strArr[j-1] = strArr[j];
                    strArr[j] = strTemp;
                }

            }
        }

        return String.join(" ",strArr);
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(orderWeight("130 103 123 4444 99 2000"));
    }
}
