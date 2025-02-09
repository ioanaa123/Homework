package Operators;

import org.testng.annotations.Test;

public class BasicMath {

    @Test
    public void mainMathOps() {
        mathOp(10, 2);
        mathOp(10, 0);
    }

    public void mathOp(Integer a, Integer b) {

        // Calulate the sum of the 2 given numbers
        Integer sum;
        sum = a + b;
        System.out.println("The sum of the 2 given number is " + sum);

        // Calulate the difference of the 2 given numbers
        Integer diff;
        diff = a - b;
        System.out.println("The difference of the 2 given number is " + diff);

        // Calulate the product of the 2 given numbers
        Integer prod;
        prod = a * b;
        System.out.println("The product of the 2 given number is " + prod);

        // Calulate the division  of the 2 given numbers
        Integer div;

        if (b != 0) {
            div = a / b;
            System.out.println("The division of the 2 given number is " + div);
        } else {
            System.out.println("Division by 0 not possible");
        }
    }

/*    public void passwordCheck(String a) {
        int sizeOfPassword = a.length();
        if (sizeOfPassword >= 8) {
            System.out.println("Weak Password");
        }
    }*/
}
