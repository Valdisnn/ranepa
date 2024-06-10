package SecondTask.Interfaces;

// Абстрактный класс
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea(); // Абстрактный метод, должен быть реализован в подклассах

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
