public class Cylinder extends Shape {
    // Attributes
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to compute surface area
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to compute volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method
    @Override
    public String toString() {
        return "Cylinder - Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }

    // Main method for testing
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        System.out.println(cylinder);
    }
}