package com.kartturi;

public class Main {

    public static boolean comp(int[] a, int[] b) {

        if(a.length == 0 || b.length == 0 || a == null || b == null) {
            return false;
        }
        boolean isComp = true;

        for(int i : a) {
            boolean tempComp = false;

            for(int j = 0; j < b.length; j++) {

                if((i*i) == b[j]) {
                    tempComp = true;
                }
            }

            if(tempComp == false) {
                isComp = false;
                break;
            }


        }
        return isComp;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arrA = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] arrB = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(arrA,arrB));
    }
}
