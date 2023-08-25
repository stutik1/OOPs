package OOPS;

// Define an interface named "Shape"
interface MathsGeo {

}

interface Shape extends MathsGeo {
    double calculateArea();  // Method declaration without implementation
    double calculatePerimeter();
    String shapeName(String owner);
}

abstract class MeraShape {
    public String hello(){
        return "Hello Megha ";
    }

}
abstract class MeraShape2 {
    public String hello(){
        return "Hello Megha 2 ";
    }

}

// Implementing classes: Circle and Rectangle
class Circle extends  MeraShape implements Shape,MathsGeo {
    private double radius;
    private String shapeName;

    public Circle(double radius) {
        this.radius = radius;
        this.shapeName="Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String shapeName(String owner) {
        return owner+shapeName;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String shapeName;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.shapeName="Mera Rectangle";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String shapeName(String owner) {
        return owner+shapeName;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Name: " + circle.shapeName("Megha : "));
        System.out.println("Hello:  " + circle.hello());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Name: " + circle.shapeName("Guru : "));

    }
}
