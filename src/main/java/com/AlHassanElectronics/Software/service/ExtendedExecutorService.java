package com.AlHassanElectronics.Software.service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExtendedExecutorService {

//    public static void main(String[] args) {
//        ExecutorService es = getExecutorThreadPool(10);
//        System.out.println("Hello");
//        es.execute(newRunnable("Task 1"));
//        es.execute(newRunnable("Task 2"));
//        es.execute(newRunnable("Task 3"));
//    }

    private static Runnable newRunnable(String taskName) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": "+ taskName);
            }
        };
    }

    private static Callable newCallable(String taskName) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        };
    }
    public static ExecutorService getExecutorThreadPool(int threads){
        return Executors.newFixedThreadPool(threads);
    }
}
