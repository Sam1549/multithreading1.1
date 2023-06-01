package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Callable<Integer> myCallable1 = new MyThread();
        Callable<Integer> myCallable2 = new MyThread();
        Callable<Integer> myCallable3 = new MyThread();
        Callable<Integer> myCallable4 = new MyThread();
        List<Callable<Integer>> callables = new ArrayList<>();
        callables.add(myCallable1);
        callables.add(myCallable2);
        callables.add(myCallable3);
        callables.add(myCallable4);
        int result = executorService.invokeAny(callables);
        System.out.println("result = " + result);
        executorService.shutdown();


    }
}