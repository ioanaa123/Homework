package integers;

import org.testng.annotations.Test;

public class Areas {

    @Test
    public void squareArea (){
        areaOfSquare(4);
    }

    public void areaOfSquare(Integer paramSquareSide){
        Integer area = paramSquareSide * paramSquareSide;
        System.out.println("The area of the square is: " + area);
    }
}
