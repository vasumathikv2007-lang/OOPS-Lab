import java.util.*;

interface Shape {
    void calculateShape(String shape);   // abstract method
}

class Calculateac implements Shape {

    Scanner obj = new Scanner(System.in);
    double r;

    // implementing abstraction
    public void calculateShape(String shape) {

        if (shape.equalsIgnoreCase("Circle")) {

            System.out.println("Enter Radius (in meters):");
            r = obj.nextDouble();

            double area = Math.PI * r * r;
            double c = 2 * Math.PI * r;

            System.out.println("Area of Circle: " + Math.round(area) + " sq m");
            System.out.println("Circumference: " +  Math.round(c));
        } 
        else {
            System.out.println("Only Circle is applicable");
        }
    }
}

public class Calculate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Shape s = new Calculateac();  

        System.out.println("Enter shape:");
        String shape = sc.nextLine();

        s.calculateShape(shape);    
    }
}