public class Cone extends Shape {
    // Attributes
    private double radius;
    private double height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to compute surface area
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    // Method to compute volume
    @Override
    public double volume() {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method
    @Override
    public String toString() {
        return "Cone - Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }

    // Main method for testing
    public static void main(String[] args) {
        Cone cone = new Cone(3.0, 4.0);
        System.out.println(cone);
    }
}