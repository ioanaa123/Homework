package BooleanExercises;

import org.testng.annotations.Test;

public class booleanEx {

    @Test
    public void booleanExcercises() {
        value(true);
        value(false);

        boolComparison(10, 5);
        boolComparison(3, 5);
        boolComparison(5, 5);

    }

    public void value(boolean val) {
        System.out.println("The given boolean value is " + val);
    }

    // Boolean Comparison
    public boolean boolComparison(int a, int b) {
        boolean val;
        if (a == b) {
            val = true;
            System.out.println("The comparison is " + val);
        } else if (a > b) {
            val = false;
            System.out.println("The comparison is " + val);
        } else if (a < b) {
            val = false;
            System.out.println("The comparison is " + val);
        }
        return false;
    }
}

