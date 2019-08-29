package com.kartturi;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static ArrayList<Integer>  calculateBrute(int[] intArr, int total) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i;
        for(i = 0; i < intArr.length - 1; i++) {

            int current = intArr[i];
            int complement = total - current;
            for(int j = i + 1; j < intArr.length; j++) {
                if(complement == intArr[j]) {
                    result.add(current);
                    result.add(complement);
                    return result;
                }
            }


        }

        result.add(0);
        return result;
    }

    public static ArrayList<Integer> calculate(int[] intArr, int total) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Boolean> numList = new HashMap<Integer, Boolean>();
        int complement;
        for(int i = 0; i < intArr.length; i++) {
            complement = total - intArr[i];
            System.out.println(complement);
            ;
            if(numList.containsKey(complement)) {
                result.add(intArr[i]);
                result.add(complement);
                return result;
            }

            numList.put(intArr[i],true);


        }

        System.out.println(numList);
        result.add(0);
        return result;
    }

    public static void main(String[] args) {
	// write your code here
            int[] intArr = {1,3,9,11,15};
        System.out.println(calculateBrute(intArr, 24));
        System.out.println(calculate(intArr, 24));
    }
}
