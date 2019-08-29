package com.kartturi;



public class Main {



    public static void main(String[] args) {
	// write your code here
        Thread1 mt = new Thread1("child 1");

        Thread newThrd = new Thread(mt);

        Thread2 mt2 = new Thread2("child 2");


        newThrd.start();

        for(int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
                System.out.println("main thread");
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thead ending");
    }
}
