package integers;

import org.testng.annotations.Test;

public class RectanglePerimeter{

    @Test
    public void  calcTest() {
        calculatePerimeter(4, 8);
    }

    public void calculatePerimeter(Integer length,Integer width){
        Integer perimeter;
        perimeter=(length+width)*2;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
