package com.journaldev.threads;

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(20);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        
    }

}