package org.kodluyoruz;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue {
    Random random = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void kuyrugaGir() {

        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Integer value =  random.nextInt(100);
                queue.put(value);

                System.out.println(value + " sıra no'lu kişi sıraya girdi.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    public void kuyruktanCık(){

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value =  queue.take();
                System.out.println(value + " sıra no'lu kullancı kuyruktan cıktı.");

                System.out.println("Queue Size: " + queue.size());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
