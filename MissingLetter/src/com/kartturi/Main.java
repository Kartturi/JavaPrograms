package com.kartturi;

public class Main {

    public static char findMissingLetter(char[] array)
    {
        for(int i = 0; i < array.length - 1; i++){

            int getNextValue = i + 1;
            int asciiCurrent = (int) array[i];
            int asciiSecond = (int) array[getNextValue] - 1;
            System.out.println(getNextValue);
            System.out.println(String.format("%d and %d", asciiCurrent, asciiSecond));
            if(asciiCurrent != asciiSecond) {
                System.out.println("retunring");
                System.out.println(asciiCurrent);
                System.out.println(asciiSecond);
                //convert ascii value to char
                return (char) asciiSecond;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(findMissingLetter(new char[] {'a','b','c','d','f'}));
    }
}
