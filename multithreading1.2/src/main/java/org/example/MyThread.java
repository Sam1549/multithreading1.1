package org.example;

import java.util.concurrent.Callable;

class MyThread implements Callable {


    @Override
    public Object call() throws Exception {
        int count = 0;
        try {

            for (; count < 10; count++) {
                Thread.sleep(2500);
                System.out.format("Я %s всем привет! Счетчик: %d\n", Thread.currentThread().getName(), count);
            }

        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
        return count;
    }
}
