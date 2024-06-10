package SecondTask.Interfaces;

public class Rectangle extends Shape implements Colorable {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
