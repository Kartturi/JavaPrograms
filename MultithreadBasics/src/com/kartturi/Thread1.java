package com.kartturi;

class Thread1 implements  Runnable {

    String thrdName;

    Thread1(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " starting");

        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("in "+ thrdName +" count is" + count);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
