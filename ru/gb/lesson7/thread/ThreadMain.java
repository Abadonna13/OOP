package ru.gb.lesson7.thread;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account();

        Thread putter = new Thread(() -> {
            for (int i = 0; i < 50_000; i++) {
                account.put(1);
            }
        });

        Thread taker = new Thread(() -> {
            for (int i = 0; i < 50_000; i++) {
                account.take(1);
            }
        });

        putter.start();
        taker.start();

        putter.join();
        taker.join();

        System.out.println(account.getAmount());

        // account[100_000]  -> local[100_000] -> local[100_001] -> account[100_001]
        //

    }

    static class Account {

        // x86
        private volatile int amount = 100_000; // long -> 64 byte

        public synchronized void take(int amount) {
            this.amount -= amount;
        }

        public synchronized void put(int amount) {
            this.amount += amount;
        }

        public int getAmount() {
            return amount;
        }
    }

}
