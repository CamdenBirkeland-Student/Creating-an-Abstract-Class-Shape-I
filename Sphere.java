public class Sphere extends Shape {
    // Attributes
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to compute surface area
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to compute volume
    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString method
    @Override
    public String toString() {
        return "Sphere - Radius: " + radius + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Sphere sphere = new Sphere(3.0);
        System.out.println(sphere);
    }
}