public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate one sphere
        Sphere sphere = new Sphere(2.0);

        // Instantiate one cylinder
        Cylinder cylinder = new Cylinder(3.0, 4.0);

        // Instantiate one cone
        Cone cone = new Cone(4.0, 5.0);

        // Store the class instances into an array named "shapeArray"
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print out the instance data of each object
        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }
    }
}