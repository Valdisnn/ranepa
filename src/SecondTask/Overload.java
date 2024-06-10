package SecondTask;

// Перегрузка методов и конструкторов / кастом пример с комментариями
public class Overload {

    public static void main(String[] args) {

        // Создаем экземпляр класса Person с помощью конструктора по умолчанию
        Person person1 = new Person();
        System.out.println(person1);

        // Создаем экземпляр класса Person с помощью конструктора с одним параметром
        Person person2 = new Person("Ваня");
        System.out.println(person2);

        // Создаем экземпляр класса Person с помощью конструктора с двумя параметрами
        Person person3 = new Person("Вася", 24);
        System.out.println(person3);

        // Вызываем перегруженный метод print с одним параметром
        print("Хеллоу");

        // Вызываем перегруженный метод print с двумя параметрами
        print("Хеллоу", "World");
    }

    // Перегруженный метод print с одним параметром
    public static void print(String text) {
        System.out.println(text);
    }

    // Перегруженный метод print с двумя параметрами
    public static void print(String text1, String text2) {
        System.out.println(text1 + " " + text2);
    }
}

// Класс с именем Person для представления человека
class Person {

    // Поле для хранения имени
    private String name;

    // Поле для хранения возраста
    private int age;

    // Конструктор по умолчанию
    public Person() {
        name = "unnamed";
        age = 0;
    }

    // Конструктор с одним параметром
    public Person(String name) {
        this.name = name;
        age = 0;
    }

    // Конструктор с двумя параметрами
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для получения строкового представления объекта
    @Override
    public String toString() {
        return "Профиль [имя: " + name + ", возраст: " + age + "]";
    }
}