package com.kartturi;

public class Main {

    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32
        byte[] byteArr = new byte[] {
                (byte)(ip >>> 24),
                (byte)(ip >>> 16),
                (byte)(ip >>> 8),
                (byte)ip};

        // do it!
        for(byte b : byteArr) {
            System.out.println(b);
        }
        return "";
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(longToIP(46464646));
    }
}
