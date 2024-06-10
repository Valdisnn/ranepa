package SecondTask.Interfaces;

// Подклассы Interfaces.Shape и реализующие Interfaces.Colorable
public class Circle extends Shape implements Colorable {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
