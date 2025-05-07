package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void metodatest(){
        Cerc cerc = new Cerc();
        cerc.setRaza(5);
        cerc.calcArie();

        Patrat patrat = new Patrat();
        patrat.setLatura(5);
        patrat.calcArie();

    }
}
