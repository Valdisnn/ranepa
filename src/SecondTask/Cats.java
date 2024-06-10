package SecondTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

// с лекции
public class Cats {
    public static void main(String[] args) {
        // Выводим заголовок в консоль
        System.out.println("Cat Fights Console ");

        // Создаем список котов-потоков
        List<Cat> catThreads = new ArrayList<>();

        // Устанавливаем количество жизней для каждого кота
        int life = 9;

        // Создаем и добавляем в список четырех котов-потоков
        catThreads.add(new Cat("Tom", life, "Thread Tom"));
        catThreads.add(new Cat("Cleocatra", life, "Thread Cleocatra"));
        catThreads.add(new Cat("Dupli", life, "Thread Dupli"));
        catThreads.add(new Cat("Toodles", life, "Thread Toodles"));

        // Запускаем всех котов-потоков
        for (Cat cat : catThreads) {
            cat.getThread().start();
        }

        // Дожидаемся завершения всех котов-потоков
        for (Cat cat : catThreads) {
            try {
                cat.getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Выводим в консоль кота-победителя
        System.out.println(String.format("Кот-победитель: %s!!!", Cat.cats.get(0)));
    }
}

// Класс, представляющий кота
class Cat implements Runnable {
    // Объявляем статический список всех котов, используя CopyOnWriteArrayList для безопасности в многопоточном режиме
    public static final List<Cat> cats = new CopyOnWriteArrayList<>();

    // Объявляем поля класса: имя, количество жизней и поток, в котором будет выполняться кот
    private String name;
    private volatile int life;
    private Thread thread;

    // Конструктор класса, создающий кота с заданным именем, количеством жизней и именем потока
    public Cat(String name, int life, String threadName) {
        this.name = name;
        this.life = life;

        // Добавляем нового кота в статический список всех котов
        Cat.cats.add(this);

        // Создаем поток для кота с заданным именем и указываем, что кот будет выполняться в этом потоке
        thread = new Thread(this, threadName);

        // Выводим в консоль сообщение о создании кота
        System.out.println(String.format("Кот %s создан. HP: %d", this.name, this.life));
    }

    // Статический метод, выполняющий атаку одного кота на другого
    public static synchronized void attack(Cat thisCat, Cat enemyCat) {
        // Если у атакующего кота количество жизней <= 0, то прерываем метод
        if (thisCat.getLife() <= 0) {
            return;
        }

        // Если у целевого кота количество жизней > 0, то уменьшаем его на 1 и выводим в консоль сообщение об атаке
        if (enemyCat.getLife() > 0) {
            enemyCat.decrementLife();
            System.out.println(String.format("Кот %s атаковал кота %s. Жизни %s:%d", thisCat.getName(), enemyCat.getName(), enemyCat.getName(), enemyCat.getLife()));

            // Если у целевого кота количество жизней <= 0, то удаляем его из статического списка всех котов,
            // выводим в консоль сообщение о том, что он покидает бой,
            // выводим в консоль список оставшихся котов
            // и прерываем поток, в котором выполнялся целевой кот
            if (enemyCat.getLife() <= 0) {
                Cat.cats.remove(enemyCat);
                System.out.println(String.format("Кот %s покидает бой.", enemyCat.getName()));
                System.out.println(String.format("Оставшиеся коты: %s", Cat.cats));
                System.out.println(String.format("%s завершвет свою работу.", enemyCat.getThread().getName()));
                enemyCat.getThread().interrupt();
            }
        }
    }

    // Метод, выполняющийся в потоке кота
    @Override
    public void run() {
        // Выводим в консоль сообщение о том, что кот идет в бой
        System.out.println(String.format("Кот %s идет в бой.", name));

        // Пока количество котов в статическом списке всех котов > 1,
        // кот выбирает случайного врага из списка, откуда удален он сам,
        // и выполняет атаку на него
        while (Cat.cats.size() > 1) {
            Cat.attack(this, getRandomEnemyCat(this));
        }
    }

    // Метод, возвращающий случайного врага из списка, откуда удален данный кот
    private Cat getRandomEnemyCat(Cat deleteThisCat) {
        List<Cat> copyCats = new ArrayList<>(Cat.cats);
        copyCats.remove(deleteThisCat);
        return copyCats.get(new Random().nextInt(copyCats.size()));
    }

    // Метод, уменьшающий количество жизней кота на 1
    public synchronized void decrementLife() {
        life--;
    }

    // Метод, возвращающий строковое представление кота
    @Override
    public String toString() {
        return name;
    }

    // Геттеры для полей класса
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public Thread getThread() {
        return thread;
    }
}