package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("MainGroup");
        Thread thread1 = new Thread(threadGroup, new MyThread(), "Поток 1");
        thread1.start();

        Thread thread2 = new Thread(threadGroup, new MyThread(), "Поток 2");
        thread2.start();

        Thread thread3 = new Thread(threadGroup, new MyThread(), "Поток 3");
        thread3.start();

        Thread thread4 = new Thread(threadGroup, new MyThread(), "Поток 4");
        thread4.start();

        stopThread(threadGroup);
    }

    public static void stopThread(ThreadGroup threadGroup) throws InterruptedException {
        Thread.sleep(15000);
        threadGroup.interrupt();

    }
}