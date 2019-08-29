package com.kartturi;

public class Main {

    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        if(h < 0 && 0 < bounce && bounce < 1 && window < h) {
            return -1;
        }

        int counter = 0;
        double vHeight = h;

        while (vHeight >= window) {
            vHeight *= bounce;

            System.out.println(vHeight);
            counter += 2;
        }
        //
        return --counter;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(bouncingBall(2.0, 0.66, 1.5));
    }
}
