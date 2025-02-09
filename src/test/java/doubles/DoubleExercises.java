package doubles;

import org.testng.annotations.Test;

public class DoubleExercises {

    @Test
    public void calculate() {
        cylinderVolume(12.3, 89.7);
        fahrenheitToC(130.5);
    }

    // Calculate the Volume of a Cylinder

    public void cylinderVolume(double height, double radius) {
        double volume = Math.PI * (height * radius) * height;
        System.out.println("The volume of the Cylinder is: " + volume);
    }

    // Convert Fahrenheit to Celsius

    public void fahrenheitToC(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheits is equal to " + celsius + " C");
    }
}
