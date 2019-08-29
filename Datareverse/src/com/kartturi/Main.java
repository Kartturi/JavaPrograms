package com.kartturi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


        public static int[] DataReverse(int[] data) {
            int bytes[] = new int[data.length];
            for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
                System.arraycopy(data, i, bytes, j, 8);
            }

            for(int i : bytes) {
                System.out.println(i);
            }

            return bytes;
        }

    public static int[] DataReverse2(int[] data) {
        ArrayList<int[]> myList = new ArrayList<>();

        for(int i=0; i<data.length; i=i+8){
            myList.add(Arrays.copyOfRange(data, i, i+8));
        }

        Collections.reverse(myList);

        return myList.stream().flatMapToInt(i -> Arrays.stream(i)).toArray();
    }



    public static void main(String[] args) {
	// write your code here
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        DataReverse(data1);
    }
}
