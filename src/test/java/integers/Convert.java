package integers;

import org.testng.annotations.Test;

public class Convert{

    @Test
    public void ConvertToSeconds(){
        minToSec(2);
    }

    public void minToSec(Integer paramMinute){
        Integer minToSecResult = paramMinute * 60;
        System.out.println(paramMinute + " minutes is equal to " + minToSecResult + " seconds");
    }
}
