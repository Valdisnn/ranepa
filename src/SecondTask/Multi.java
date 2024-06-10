package SecondTask;

// многопоток
public class Multi {
    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем количество потоков
        int numThreads = 10;
        // Создаем массив потоков
        Thread[] threads = new Thread[numThreads];

        // Определяем класс-счетчик, реализующий интерфейс Runnable
        class Counter implements Runnable {
            // Объявляем статический счетчик
            private static int counter = 0;
            // Объявляем статический объект-блокировку
            private static final Object lock = new Object();

            @Override
            public void run() {
                // В цикле увеличиваем счетчик на 1 и выводим его значение
                for (int i = 0; i < 1000; i++) {
                    // Блокируем доступ к счетчику с помощью synchronized-блока
                    synchronized(lock) {
                        counter++;
                    }
                }
                // вывод значений из всех потоков
                System.out.printf("Счет одного из потоков: %d\n", Counter.getCounter());
            }

            // Объявляем статический метод для получения значения счетчика
            public static int getCounter() {
                return counter;
            }
        }

        // Создаем и запускаем указанное количество потоков-счетчиков
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Counter());
            threads[i].start();
        }

        // Дожидаемся завершения всех потоков-счетчиков
        for (Thread thread: threads) {
            thread.join();
        }
    }
}