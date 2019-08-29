package com.kartturi;

class Thread2 implements  Runnable {

    Thread thrd;

    Thread2(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting");

        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("in "+ thrd.getName() + 2 +" count is" + count);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
