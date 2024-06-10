package SecondTask.Interfaces;

// Класс Interface для тестирования
public class Interface {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        circle.setColor("Green"); // установить цвет круга в зеленый
        rectangle.setColor("Yellow"); // установить цвет прямоугольника в желтый

        System.out.println("Цвет круга: " + circle.getColor());
        System.out.println("Цвет прямоугольника: " + rectangle.getColor());
    }
}

/*
В примере Shape является абстрактным классом, потому что он содержит абстрактный метод calculateArea().
Этот метод предназначен для реализации в конкретных подклассах Shape, таких как Circle и Rectangle, каждый из которых может вычислять свою площадь по-разному.
Colorable является интерфейсом, который определяет метод setColor(String color).
Любой класс, реализующий этот интерфейс, такой как Circle и Rectangle, должен предоставить реализацию для этого метода.
Способ гарантирует, что все объекты Colorable могут изменять свой цвет в заданном и соглассованном способе.
*/