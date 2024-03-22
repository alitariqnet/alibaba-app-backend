package com.AlHassanElectronics.Software.service;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomExecutorService {

    final Queue<Runnable> tasks = new ArrayDeque<>();
    final Executor executor;
    Runnable active;

    CustomExecutorService(Executor executor) {
        this.executor = executor;
    }

    public synchronized void execute(Runnable r) {
        tasks.add(() -> {
            try {
                r.run();
            } finally {
                scheduleNext();
            }
        });
        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }

    public static void main(String[] args) {
//        ExecutorService e = new ThreadPoolExecutor();
//         Executors es = new Executors.newFixedThreadPool(3)
    }

}
