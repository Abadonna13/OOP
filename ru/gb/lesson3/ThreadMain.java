package ru.gb.lesson3;

import java.time.Duration;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(Duration.ofSeconds(3)); // Останавливает исполнение в текущем потоке на 1 секунду
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    cat.уменьшитьСытость();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();


//        while (true) {
//            Thread.sleep(Duration.ofSeconds(1)); // Останавливает исполнение в текущем потоке на 1 секунду
//            System.out.println(cat);
//        }

        System.out.println("END OF PROGRAM");
    }

    static class Cat {

        private int сытость = 10;

        public void уменьшитьСытость() {
            if (сытость > 0) {
                сытость--;
            }
        }

        @Override
        public String toString() {
            return "Сытость кота: " + сытость;
        }
    }

}
