package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	Queue kuyruk = new Queue();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                kuyruk.kuyrugaGir();
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                kuyruk.kuyruktanCık();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
